from ORMdb import create_user, get_users, get_user_by_id

create_user("Alice", "alice@example.com", 22)
create_user("Nick", "nick@example.com", 23)

print("All users:")

users = get_users()

for user in users:
    print(
        f"ID: {user.id} |"
        f"Name: {user.name} |"
        f"Email: {user.email} |"
        f"Age: {user.age}"
    )

print("\nUser ID (1):")
user = get_user_by_id(1)

if user:
    print(user.name)