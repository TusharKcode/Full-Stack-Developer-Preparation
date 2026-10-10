def countdown(number):
    if number == 0:
        return 

    print(number)
    countdown(number - 1)

countdown(5)

# ------------------------------------

def count_up(number):
    if number == 0:
        return

    count_up(number - 1)
    print(number)
    
count_up(5)

# ------------------------------------

def factorial(number):
    if number == 0 or number == 1:
        return 1

    return number * factorial(number - 1)

print(factorial(5))

# ------------------------------------

def calculate_sum(number):
    if number == 0:
        return 0

    return number + calculate_sum(number - 1)

print(calculate_sum(10))

# ------------------------------------

def print_even_number(number):
    if number == 0:
        return 
    print_even_number(number - 2)
    print(number)

print_even_number(10)

# ------------------------------------

def print_characters(text, index=0):
    if index == len(text):
        return

    print(text[index])
    print_characters(text, index + 1)

print_characters("Python")

# ------------------------------------

def print_items(items, index=0):
    if index == len(items):
        return

    print(items[index])
    print_items(items, index + 1)

products = ["Laptop", "Mouse", "Keyboard", "Monitor"]
print_items(products)

# ------------------------------------

def calculate_total(numbers, index=0):
    if index == len(numbers):
        return 0
    
    return numbers[index] + calculate_total(numbers, index + 1)
    
prices = [500, 1000, 1500, 2000]
print(calculate_total(prices))