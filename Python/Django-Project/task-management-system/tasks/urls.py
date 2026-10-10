from django.urls import path
from . import views

urlpatterns = [
    path("", views.dashboard_view, name="dashboard"),

    path("tasks/", views.task_list_view, name="task_list"),
    path("tasks/create/", views.task_create_view, name="task_create"),
    path("tasks/<int:task_id>/", views.task_detail_view, name="task_detail"),
    path("tasks/<int:task_id>/edit/", views.task_update_view, name="task_edit"),
    path("tasks/<int:task_id>/delete/", views.task_delete_view, name="task_delete"),
    path("tasks/<int:task_id>/complete/", views.task_complete_view, name="task_complete"),

    path("accounts/register/", views.register_view, name="register"),
    path("accounts/login/", views.login_view, name="login"),
    path("accounts/logout/", views.logout_view, name="logout"),
]