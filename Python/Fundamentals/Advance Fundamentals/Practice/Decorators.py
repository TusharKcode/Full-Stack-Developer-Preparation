def greet():
    print("Hello!")

def execute_function(function):
    function()

execute_function(greet)

# ----------------------------

def show_messages(function):
    def wrapper():
        print("Before function")
        function()
        print("After function")
    return wrapper

@show_messages
def welcome():
    print("Welcome to Python!")

welcome()
# ----------------------------

def show_messages(function):
    def wrapper(*args, **kwargs):
        print("Before function")
        result = function(*args, **kwargs)
        print("After function")
        return result
    return wrapper

@show_messages
def greet(name):
    print(f"Hello, {name}!")

greet("John")

# ----------------------------
@show_messages
def add(a, b):
    return a + b

result = add(10, 20)
print("Result: ", result)

# ----------------------------

from functools import wraps

def log_function(function):
    @wraps(function)
    def wrapper(*args, **kwargs):
        print(f"Calling {function.__name__}")
        result = function(*args, **kwargs)
        print(f"Finished {function.__name__}")
        return result
    return wrapper

@log_function
def calculate_total(price, quantity):
    return price * quantity

result = calculate_total(500, 3)
print("Total: ", result)