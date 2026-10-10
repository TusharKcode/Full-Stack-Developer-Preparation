numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

squares = [number ** 2 for number in numbers]
print("Squares: ", squares)

even_numbers = [number for number in numbers if number % 2 == 0]
print("Even numbers: ", even_numbers)

odd_numbers = [number for number in numbers if number % 2 != 0]
print("Odd numbers: ", odd_numbers)

even_cubes = [number ** 3 for number in numbers if number % 2 == 0]
print("Even Cubes: ", even_cubes)

# ---------------------------------

skills = ["python", "fastapi", "react", "mysql", "docker"]

uppercase_skills = [skill.upper() for skill in skills]
print("Skills in uppercase: ", uppercase_skills)

greater_than_5 = [skill for skill in skills if len(skill) > 5]
print("Skills greater than 5: ", greater_than_5)

skill_length = [len(skill) for skill in skills]
print("Length of skills: ", skill_length)

# ---------------------------------

numbers = [10, 15, 20, 25, 30]

even_odd = ["Even" if number % 2 == 0 else "Odd" for number in numbers]
print("Even / Odd: ", even_odd)

# ---------------------------------

users = [
    {"name": "Alice", "active": True},
    {"name": "Bob", "active": False},
    {"name": "Charlie", "active": True},
    {"name": "David", "active": False},
    {"name": "Eva", "active": True}
]

active_user = [
    user['name']
    for user in users
    if user['active']
]

print("Name of active users: ", active_user)