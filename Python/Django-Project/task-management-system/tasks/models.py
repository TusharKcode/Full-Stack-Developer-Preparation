from django.db import models
from django.contrib.auth import get_user_model

# Task Model- 
#   id (auto generated)
#   title (text, required) 
#   description (text, optional)
#   status (CharField, Default[PENDING])
#   priority (CharField, Default[MEDIUM])
#   due_date (dateField, optional) 
#   created_at (DateTimeField)
#   updated_at (DateTimeField)
#   owner (useForeignKey to Django's built-in User model with on_delete=CASCADE)

User = get_user_model()

class Task(models.Model):
    class StatusChoices(models.TextChoices):
        PENDING = 'PENDING', 'Pending'
        IN_PROGRESS = 'IN_PROGRESS', 'In Progress'
        COMPLETED = 'COMPLETED', 'Completed'

    class PriorityChoices(models.TextChoices):
        LOW = 'LOW', 'Low'
        MEDIUM = 'MEDIUM', 'Medium'
        HIGH = 'HIGH', 'High'

    title = models.CharField(max_length=100)
    description = models.TextField(blank=True, null=True)  
    status = models.CharField(
        max_length=20,
        choices=StatusChoices.choices,
        default=StatusChoices.PENDING
    )
    priority = models.CharField(
        max_length=10,
        choices=PriorityChoices.choices,
        default=PriorityChoices.MEDIUM
    )
    due_date = models.DateField(blank=True, null=True)
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)
    owner = models.ForeignKey(
        User, 
        on_delete=models.CASCADE,
        related_name="tasks"
    )

    class Meta:
        ordering = ['-created_at']
        verbose_name = 'Task'
        verbose_name_plural = 'Tasks'

    def __str__(self):
        return f"{self.title} ({self.status})"