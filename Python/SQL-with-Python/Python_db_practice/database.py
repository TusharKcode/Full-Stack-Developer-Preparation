import sqlite3

DB_name = "app.db"

def get_connection():
    return sqlite3.connect(DB_name)

def create_table():
    with get_connection() as connection:
        cursor = connection.cursor()
        cursor.execute(
            """
            CREATE TABLE IF NOT EXISTS users (
                id INTEGER PRIMARY KEY AUTOINCREMENT,
                name TEXT NOT NULL,
                email TEXT NOT NULL,
                age INTEGER
            )
        """
        )
        connection.commit()

def create_user(name, email, age):
    with get_connection() as connection:
        try:
            cursor = connection.cursor()
            cursor.execute(
            """
            INSERT INTO users (name, email, age) VALUES (?, ?, ?)
            """, (name, email, age),
            )
            connection.commit()

        except sqlite3.IntegrityError as e:
            print(f"Failed to insert user {name} ({email}): {e}")
            return None

def get_users():
    with get_connection() as connection:
        cursor = connection.cursor()
        cursor.execute("SELECT * FROM users")
        return cursor.fetchall()

def get_users_by_id(user_id):
    with get_connection() as connection:
        cursor = connection.cursor()
        cursor.execute("SELECT * FROM users WHERE id = ?", (user_id,))
        return cursor.fetchone()

def get_users_by_age(age):
    with get_connection() as connection:
        cursor = connection.cursor()
        cursor.execute("SELECT * FROM users WHERE age > ?", (age,))
        return cursor.fetchone()

def get_users_by_name(letter):
    with get_connection() as connection:
        cursor = connection.cursor()
        cursor.execute("SELECT * FROM users WHERE name LIKE ?", (f"{letter}%",))
        return cursor.fetchall()

def update_user_age(user_id, new_age):
    with get_connection() as connection:
        cursor = connection.cursor()
        cursor.execute(
            """
            UPDATE users
            SET age = ? 
            where id = ? 
        """, (new_age, user_id)
        )
        connection.commit()

def delete_user(user_id):
    with get_connection() as connection:
        cursor = connection.cursor()
        cursor.execute("DELETE FROM users WHERE id = ?", (user_id,))
        connection.commit()