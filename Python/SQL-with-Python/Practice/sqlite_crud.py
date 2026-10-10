import sqlite3

def get_connection():
    return sqlite3.connect("app.db")

def create_table():
    connection = get_connection()
    cursor = connection.cursor()
    cursor.execute("""
        CREATE TABLE IF NOT EXISTS users (
            id INTEGER PRIMARY KEY AUTOINCREMENT,
            name TEXT NOT NULL,
            email TEXT NOT NULL,
            age INTEGER
        )
    """)
    connection.commit()
    connection.close()

def create_user(name, email, age):
    connection = get_connection()
    cursor = connection.cursor()

    cursor.execute(
        """
        INSERT INTO users (name, email, age) VALUES (?, ?, ?)
        """, 
        (name, email, age),
    )
    connection.commit()
    connection.close()

def get_users():
    connection = get_connection()
    cursor = connection.cursor()
    
    cursor.execute("SELECT * FROM users")

    users = cursor.fetchall()
    connection.close()
    return users

def update_user(user_id, age):
    connection = get_connection()
    cursor = connection.cursor()
        
    cursor.execute(
        "UPDATE users SET age = ? WHERE id = ?",
        (age, user_id),
    )
    connection.commit()
    connection.close()

def delete_user(user_id):
    connection = get_connection()
    cursor = connection.cursor()
        
    cursor.execute(
        "DELETE FROM users WHERE id = ?",  
        (user_id,)
    )
    connection.commit()
    connection.close()

if __name__ == "__main__":
    create_table()

    # Create a user
    create_user("Alice", "alice@example.com", 25)
    print("After Insert:", get_users())

    # Update user's age
    update_user(user_id=1, age=26)
    print("After Update:", get_users())

    # Delete user
    # delete_user(user_id=1)
    # print("After Delete:", get_users())