# Task Management System - Project Blueprint

## Project overview
```TaskFlow — Task Management System```

Project type: Django server-rendered web application

A web application where users can organize their daily work, manage deadlines, track progress, and keep their tasks organized in one place.

`Python` `Django` `SQLite` `HTML/CSS`

## Objective
- Practice Django Models and ORM.
- Build complete CRUD functionality.
- Handle forms and server-side validation.
- Understand URL routing, views, and template inheritance.
- Add user authentication and permissions.
- Create a clean, responsive interface.
- Structure the codebase for future API, React, and deployment upgrades.

### Application Workflow
                User visits TaskFlow
                        ↓
                Register / Login
            (Authenticate the user)
                        ↓
                    Dashboard
        (View task statistics and recent tasks)
                        ↓
                    Manage Tasks
        (Create · View · Edit · Complete · Delete)
                        ↓
                Django ORM → SQLite
        (Save and retrieve the user's data)

### Features & Project Scope

- Phase 1 — Core task management

`Task CRUD, Django Models, ORM, Forms, URL routing, views, templates, validation, and template inheritance.`

- Phase 2 — User accounts

`Registration, login, logout, protected pages, and ownership of tasks using Django's built-in authentication system.`

- Phase 3 — Dashboard and productivity

`Task counts, search, status/priority filters, due dates, sorting, success messages, and error handling.`

- Phase 4 — UI and project quality

`Responsive styling, empty states, confirmation pages, testing, documentation, and GitHub readiness.`

### Model
    -> Task Model
        - id 
        - title
        - description
        - status
        - priority
        - due_date
        - created_at
        - updated_at
        - owner

### View
        - dashboard 
        - task_list
        - task_detail
        - task_create
        - task_update
        - task_delete
        - task_complete
        - register
        - login / logout

### Templates
    - Dashboard
    - Task List
    - Task Form

### Planned URLs & Views
```
URL pattern                              View                      Purpose
/                                       dashboard               Main dashboard

tasks/                                  task_list               List tasks

tasks/create/                           task_create             Create task

tasks/<int:task_id>/                    task_detail             View task details

tasks/<int:task_id>/edit/               task_update             Update task

tasks/<int:task_id>/delete/             task_delete             Delete task

tasks/<int:task_id>/complete/           task_complete           Complete task

accounts/register/                      register                Register user

accounts/login/                         Django login view       Login

accounts/logout/                        Django logout view      Logout
```