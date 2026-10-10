double = lambda number: number * 2
print(double(6))

# ------------------------------------

add = lambda a, b: a + b
print(add(15, 25))

# ------------------------------------

check_age = lambda age: "Adult" if age >= 18 else "Minor"
print(check_age(20))
print(check_age(14))

# ------------------------------------

calculate_total = lambda price, quantity: price * quantity
print(calculate_total(750, 4))

# ------------------------------------

users = [
    {"name": "Alice", "age": 28},
    {"name": "Bob", "age": 21},
    {"name": "Charlie", "age": 25}
]

sorted_users = sorted(
    users,
    key=lambda user: user["age"]
)
print(sorted_users)

# ------------------------------------

numbers = [2, 4, 6, 8]

square_numbers = list(
    map(lambda number: number ** 2, numbers)
)
print(square_numbers)

# ------------------------------------

numbers = [10, 15, 20, 25, 30, 35]
even_numbers = list(
    filter(lambda number: number % 2 == 0, numbers)
)
print(even_numbers)

# ------------------------------------

products = [
    {"name": "Laptop", "price": 60000},
    {"name": "Mouse", "price": 800},
    {"name": "Keyboard", "price": 2500},
    {"name": "Monitor", "price": 12000}
]

sorted_products = sorted(
    products, 
    key=lambda product: product["price"]
)
print("Sorted products: ", sorted_products)

filter_products = list(
    filter(lambda product: product["price"] > 5000, products)
)
print("Filter products: ", filter_products)