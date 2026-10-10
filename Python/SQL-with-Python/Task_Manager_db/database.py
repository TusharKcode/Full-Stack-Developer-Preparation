import sqlite3

DB_name = "tasks_manager.db"

def get_connection():
    connection = sqlite3.connect(DB_name)
    connection.row_factory = sqlite3.Row
    return connection

def create_table():
    with get_connection() as connection:
        cursor = connection.cursor()
        cursor.execute(
            """
            CREATE TABLE IF NOT EXISTS tasks (
                id INTEGER PRIMARY KEY AUTOINCREMENT,
                title TEXT NOT NULL,
                description TEXT,
                status TEXT NOT NULL CHECK(status IN ('pending', 'completed')),
                priority TEXT NOT NULL CHECK(priority IN ('low', 'medium', 'high'))
            )
        """
        )
        connection.commit()

def create_task(title, description, status="pending", priority="medium"):
    with get_connection() as connection:
        cursor = connection.cursor()
        cursor.execute(
            """
            INSERT INTO tasks (title, description, status, priority) VALUES (?, ?, ?, ?)
        """, (title, description, status.lower(), priority.lower())
        )
        connection.commit()

def get_tasks(status=None, priority=None):
    query = "SELECT * FROM tasks WHERE 1=1"
    params = []

    if status:
        query += " AND status = ?"
        params.append(status.lower())
    if priority:
        query += " AND priority = ?"
        params.append(priority.lower())

    with get_connection() as connection:
        cursor = connection.cursor()
        cursor.execute(query, params)
        return cursor.fetchall()
    
def get_task_by_id(task_id):
    with get_connection() as connection:
        cursor = connection.cursor()
        cursor.execute("SELECT * FROM tasks WHERE id = ?", (task_id,))
        return cursor.fetchone()

def update_task_status(task_id, new_status):
    with get_connection() as connection:
        cursor = connection.cursor()
        cursor.execute(
            """
            UPDATE tasks
            SET status = ?
            WHERE id = ?
        """, (new_status, task_id),
        )
        connection.commit()

def delete_task(task_id):
    with get_connection() as connection:
        cursor = connection.cursor()
        cursor.execute("DELETE FROM tasks WHERE id = ?", (task_id,))
        connection.commit()

def print_tasks(tasks):
    if not tasks:
        print("  No tasks found.")
        return
    for task in tasks:
        print(f"  [{task['id']}] {task['title']} | Status: {task['status']} | Priority: {task['priority']}")
        if task["description"]:
            print(f"      Description: {task['description']}")