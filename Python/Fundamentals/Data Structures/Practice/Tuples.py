languages = ("Python", "Java", "JavaScript", "C++")
print(languages)

# ------------------------------------

print(languages[0])
print(languages[-1])
print(languages[2])

# ------------------------------------

# numbers = (10, 20, 30)
# numbers[1] = 50
# print(numbers)  # Give TypeError, because Tuples are immutable.

# ------------------------------------

languages = ("Python", "Java", "JavaScript", "C++", "Go")
print(languages[:3])
print(languages[3:])
print(languages[1:3])

# ------------------------------------

numbers = (10, 20, 10, 30, 10, 40)
print(numbers.count(10))
print(numbers.index(30))

# ------------------------------------

skills = ("Python", "FastAPI", "React", "MySQL")
print(len(skills))
print("FastAPI" in skills)
print("MongoDB" in skills)

# ------------------------------------

user = ("Alice", 25, "Delhi")
name, age, city = user
print(name)
print(age)
print(city)

# ------------------------------------

def get_product():
    return "Laptop", 60000, "Electronics"

name, price, category = get_product()
print(name)
print(price)
print(category)

# ------------------------------------

product = ("Laptop", 60000, "Electronics", True)
name, price, category, available = product
print(name)
print(price)
print(category)
print(available)

if available:
    print("Product available")
else:
    print("Product not available")

print(len(product))