student = {
    "name": "Alice",
    "age": 22,
    "course": "Python Full Stack",
    "marks": 85,
}
print(student)

# ---------------------------------

print(student["name"])
print(student["age"])
print(student["course"])
print(student["marks"])

# ---------------------------------

user = {
    "name": "Alice",
    "age": 25
}
user.update({
    "city": "Delhi",
    "age": 26
})
print(user)

# ---------------------------------

user = {
    "name": "Alice",
    "age": 25,
    "city": "Delhi"
}

if "name" in user:
    print("Name exists as Key")
else:
    print("Name does not exists as Key")

if "email" in user:
    print("Email exists as Key")
else:
    print("Email does not exists as Key")

# ---------------------------------

user = {
    "name": "Alice",
    "age": 25
}

print(user.get("name"))
print(user.get("email", "No email provided"))

# ---------------------------------

products = {
    "Laptop": 60000,
    "Mouse": 800,
    "Keyboard": 2500
}

for product, price in products.items():
    print(f"{product}: {price}")

# ---------------------------------

user = {
    "name": "Alice",
    "age": 25,
    "address": {
        "city": "New Delhi",
        "state": "Delhi",
        "pincode": 110043
    }
}

print(user["name"])
print(user["address"]["city"])
print(user["address"]["pincode"])

# ---------------------------------

users = [
    {"name": "Alice", "age": 25},
    {"name": "Bob", "age": 28},
    {"name": "Charlie", "age": 23}
]

for user in users:
    print(f"{user['name']} - {user['age']}")

# ---------------------------------

user = {
    "username": "alice",
    "email": "alice@example.com",
    "is_logged_in": True,
    "is_verified": True
}

if not user["is_logged_in"]:
    print("Please login")
elif not user["is_verified"]:
    print("Please verify your account")
else: 
    print("Access granted")

# ---------------------------------

products = [
    {
        "name": "Laptop",
        "price": 60000,
        "category": "Electronics",
        "available": True
    },
    {
        "name": "Keyboard",
        "price": 800,
        "category": "Electronics",
        "available": True
    },
    {
        "name": "Mouse",
        "price": 1500,
        "category": "Electronics",
        "available": False
    },
    {
        "name": "Monitor",
        "price": 12000,
        "category": "Electronics",
        "available": True
    }
]

for product in products:
    print(f"Product:   {product['name']}")
    print(f"Price:     {product['price']}")
    print(f"Category:  {product['category']}")
    print(f"Available: {product['available']}")