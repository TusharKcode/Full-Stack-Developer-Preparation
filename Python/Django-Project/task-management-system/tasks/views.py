from django.shortcuts import render, redirect, get_object_or_404
from django.contrib.auth.decorators import login_required
from django.contrib.auth import login, logout
from django.contrib.auth.forms import UserCreationForm, AuthenticationForm
from django.contrib import messages
from .models import Task
from .forms import TaskForm

def register_view(request):
    if request.method == "POST":
        form = UserCreationForm(request.POST)
        if form.is_valid():
            user = form.save()
            login(request, user)        # Auto log in User after registration
            return redirect("dashboard")
    else:
        form = UserCreationForm()
    return render(request, "accounts/register.html", {"form":form})

def login_view(request):
    if request.method == "POST":
        form = AuthenticationForm(request, data=request.POST)
        if form.is_valid():
            user = form.get_user()
            login(request, user)
            return redirect("dashboard")
    else:
        form = AuthenticationForm()
    return render(request, "accounts/login.html", {"form":form})

@login_required
def logout_view(request):
    if request.method == "POST":
        logout(request)
        return redirect("login")
    return render(request, "accounts/logout.html")

# ============================ Only for Logged In User

@login_required
def dashboard_view(request):
    user_tasks = Task.objects.filter(owner=request.user)
    context = {
        "total_tasks": user_tasks.count(),
        "pending_tasks": user_tasks.filter(status=Task.StatusChoices.PENDING).count(),
        "completed_tasks": user_tasks.filter(status=Task.StatusChoices.COMPLETED).count(),
        "recent_tasks": user_tasks[:5],
    }
    return render(request, "tasks/dashboard.html", context)

@login_required
def task_list_view(request):
    tasks = Task.objects.filter(owner=request.user)
    return render(request, "tasks/task_list.html", {"tasks":tasks})

@login_required
def task_detail_view(request, task_id):
    task = get_object_or_404(Task, id=task_id, owner=request.user)
    return render(request, "tasks/task_detail.html", {"task":task})

@login_required
def task_create_view(request):
    if request.method == "POST":
        form = TaskForm(request.POST)
        if form.is_valid():
            task = form.save(commit=False)
            task.owner = request.user
            task.save()
            messages.success(request, "Task created successfully!")
            return redirect("task_list")
    else:
        form = TaskForm()
    return render(request, "tasks/task_form.html", {"form":form, "title":"Create Task"})

@login_required
def task_update_view(request, task_id):
    task = get_object_or_404(Task, id=task_id, owner=request.user)
    if request.method == "POST":
        form = TaskForm(request.POST, instance=task)
        if form.is_valid():
            form.save()
            messages.success(request, "Task updated successfully!")
            return redirect("task_detail", task_id=task.id)
    else:
        form = TaskForm(instance=task)
    return render(request, "tasks/task_form.html", {"form":form, "title":"Edit Task"})

@login_required
def task_delete_view(request, task_id):
    task = get_object_or_404(Task, id=task_id, owner=request.user)
    if request.method == "POST":
        task.delete()
        messages.success(request, "Task deleted successfully!")
        return redirect("task_list")
    return render(request, "tasks/task_confirm_delete.html", {"task":task})

@login_required
def task_complete_view(request, task_id):
    task = get_object_or_404(Task, id=task_id, owner=request.user)
    task.status = Task.StatusChoices.COMPLETED
    task.save()
    messages.success(request, f"Task: '{task.title}' mark as completed!")
    return redirect("task_list")