try:
    number = int(input("Enter a number: "))
except ValueError:
    print("Invalid number.")

# ------------------------------

try:
    number = int(input("Enter a number: "))
    result = 100 / number
    print(result)
except ValueError:                    # attempted multiple exception as well (Q.8)
    print("Invalid input.")
except ZeroDivisionError:
    print("Number cannot be zero.")


# ------------------------------

numbers = [10, 20, 30]

try:
    user_input = int(input("Enter a number: "))
    index = int(user_input)
    print(f"The element at index {index} is {numbers[index]}")
except ValueError:
    print("Invalid input.")
except IndexError:
    print("Index out of range or invalid.")

# ------------------------------

user = {
    "name": "Alice",
    "age": 25,
    "city": "Delhi"
}

try:
    key = input("Enter key: ")
    print(f"The value for key '{key}' is : {user[key]}")
except KeyError:
    print("Key not found in dictionary.")

# ------------------------------

try:
    user_input = float(input("Enter a number: "))
    converted_number = int(user_input)
except:
    print("Invalid input")
else:
    print(f"Success! The converted number is: {converted_number}")
finally:
    print("Program finished")

# ------------------------------
class InsufficientBalanceError(Exception):
    pass

def withdraw(balance, amount):
    if amount <= 0:
        raise ValueError("Amount must be greater than 0.")
    if amount > balance:
        raise InsufficientBalanceError("Amount must not exceed balance")

    balance -= amount
    return balance

current_balance = 100.0

try:
    current_balance = withdraw(current_balance, 40.0)
    print(f"New Balance: {current_balance}")
except ValueError as e:
    print(f"Error: {e}")

# ------------------------------

# In Exercise 9, total = subtotal - discount

# ------------------------------
class InvalidAgeError(Exception):
    pass

def register_user(name, age, email):
    if not name:
        raise ValueError("Name cannot be empty.")
    if age < 18:
        raise InvalidAgeError("User age should be 18 or above 18.")
    if "@" not in email:
        raise ValueError("Invalid email.")
    return "Registration successful"

try:
    user = register_user("John", 33, "john@example.com")
    # user = register_user("John", 14, "john@example.com")
    # user = register_user("John", 33, "example.com")
    # user = register_user("", 14, "john@example.com")
except InvalidAgeError as e:
    print(f"Age Validation error: {e}")
except ValueError as e:
    print(f"Input Validation error: {e}")
else:
    print(f"Success: {user}")
finally:
    print("Registration attempt complete.")