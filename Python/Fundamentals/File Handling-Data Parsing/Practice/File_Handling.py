try:
    with open("notes.txt", "x") as file:
        file.write("Python Full Stack\nFastAPI\nReact\nMySQL")
except FileExistsError:
    print("File already exists.")

with open("notes.txt", "r", encoding="utf-8") as file:
    data = file.read()
print(data)

with open("notes.txt", "a") as file:
    file.write("\nDocker")

with open("notes.txt", "r") as file:
    for line in file:
        print("Skill: ", line.strip())

# -----------------------------------

import csv

with open("students.csv", "r", encoding="utf-8") as file:
    reader = csv.DictReader(file)
    for row in reader:
        if row["course"] == "Python":
            print(f"{row['name']} - {row['age']}")

products = [
    ["Laptop", 60000],
    ["Mouse", 800],
    ["Keyboard", 2500]
]

with open("products.csv", "w", newline="", encoding="utf-8") as file:
    writer = csv.writer(file)
    writer.writerow(['name', 'price'])

    for product in products:
        writer.writerow(product)
        print("Product details written in products.csv")

# -----------------------------------

import json

with open("user.json", "r", encoding="utf-8") as file:
    user = json.load(file)
print(user)

user = {
    "name": "Tushar",
    "age": 25,
    "role": "Python Full Stack Developer",
    "skills": ["Python", "FastAPI", "React", "MySQL"]
}

with open("user.json", "w", encoding="utf-8") as file:
    json.dump(user, file, indent=4)
    print("user info added")

# -----------------------------------

data = "Alice,22,Python"

parts = data.split(",")

name = parts[0].strip()
age = int(parts[1].strip())
course = parts[2].strip()

student = {
    "name":name,
    "age":age,
    "course":course
}

print(student)

# -----------------------------------

import json
try: 
    with open("users.json", "r", encoding="utf-8") as file:
        users = json.load(file)

        for user in users:
            if user["age"] >=18 and user["active"] == True:
                print(user['name'])
                found = True

        if not found:
            print("No user found.")

except FileNotFoundError:
    print("File not found.")
except json.JSONDecodeError:
    print("Invalid JSON")