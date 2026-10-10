def greet():
    print("Hello, welcome to Python!")
greet()

# -----------------------------------

def greet_user(name):
    print(f"Hello, {name}!")

greet_user("Alice")
greet_user("John")

# -----------------------------------

def add_numbers(a, b):
    return a + b

result = add_numbers(10, 20)
print(result)

# -----------------------------------

def calculate_final_price(price, quantity, discount):
    subtotal = price * quantity
    final_price  = subtotal - discount
    return final_price

print(calculate_final_price(500, 3, 100))

# -----------------------------------

def check_age(age):
    if age >= 18:
        return "Adult"
    else:
        return "Minor"

print(check_age(25))
print(check_age(15))

# -----------------------------------

def greet_user(name="Guest"):
    print(f"Hello, {name}!")

greet_user()
greet_user("John")

# -----------------------------------

def create_user(name, age, city):
    return name, age, city

print(create_user(
    name="Alice",
    age=25,
    city="Delhi"
))

print(create_user(
    age=25,
    name="Alice",
    city="Delhi"
))

# -----------------------------------

message = "Global message"      # This is Global scope, outside the function

def test_scope():
    message = "Local message"   # This is Local scope, can call inside the function not outside
    print(message)
test_scope()

print(message)

# -----------------------------------

def check_access(is_logged_in, is_verified):
    if not is_logged_in:
        return "Please login first."
    elif not is_verified:
        return "Please verify your account."
    else:
        return "Access granted."

print(check_access(True, True))
print(check_access(False, True))
print(check_access(True, False))

# -----------------------------------

def calculate_subtotal(price, quantity):
    return price * quantity
    
def calculate_final_price(price, quantity, discount=0):
    subtotal = calculate_subtotal(price, quantity)
    print("Subtotal: ", subtotal)
    return subtotal - discount

final_price = calculate_final_price(1200, 3, 200)
print("Final price: ", final_price)

# -----------------------------------

def calculate_subtotal(price, quantity):
    return price * quantity

def calculate_discount(subtotal, discount):
    return subtotal - discount

def check_order(subtotal, final_price):
    if final_price <= 0:
        return "Invalid order"
    return "Order is valid"

def process_order(price, quantity, discount):
    subtotal = calculate_subtotal(price, quantity)
    final_price = calculate_discount(subtotal, discount)
    validate_status = check_order(subtotal, final_price)

    print(f"Subtotal:{subtotal}")
    print(f"Final Price:{final_price}")
    print(validate_status)

process_order(1200, 3, 200)
