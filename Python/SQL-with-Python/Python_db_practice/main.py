import database

def main():
    database.create_table()

    print("-------- Creating users --------")
    database.create_user("Ash", "ash@example.com", 22)
    database.create_user("John", "john@example.com", 24)
    database.create_user("Nick", "nick@example.com", 26)
    database.create_user("Alice", "alice@example.com", 22)
    database.create_user("Lily", "lily@example.com", 28)

    print("-------- Fetching all users --------")
    all_users = database.get_users()
    for user in all_users:
        print(
            f"ID: {user[0]} | Name: {user[1]} | Email: {user[2]} | Age: {user[3]}"
        )

    print("-------- Fetching user by ID (1) --------")
    user = database.get_users_by_id(3)
    if user:
        print(
            f"ID: {user[0]} | Name: {user[1]} | Email: {user[2]} | Age: {user[3]}"
        )

    print("-------- Updating age of user ID 1 to 26 --------")
    database.update_user_age(4, 26)
    updated_user = database.get_users_by_id(1)
    print(f"Updated Record: {updated_user}")

    print("-------- Deleting user by ID 5 --------")
    database.delete_user(5)

    print("-------- Remaining users --------")
    for user in database.get_users():
        print(
            f"ID: {user[0]} | Name: {user[1]} | Email: {user[2]} | Age: {user[3]}"
        )

if __name__ == "__main__":
    main()