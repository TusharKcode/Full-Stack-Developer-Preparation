numbers = [10, 20, 30, 40, 50]
iterator_numbers = iter(numbers)

print(next(iterator_numbers))
print(next(iterator_numbers))
print(next(iterator_numbers))

print(next(iterator_numbers))
print(next(iterator_numbers))

# print(next(iterator_numbers))   # Error: StopIteration

# -----------------------------

def count_numbers():
    yield 1
    yield 2
    yield 3
    yield 4
    yield 5

for number in count_numbers():
    print(number)

# -----------------------------

def even_numbers():
    for even_num in range(2, 11, 2):
        yield even_num

for even_number in even_numbers():
    print(even_number)

# -----------------------------

square_generator = (number ** 2 for number in range(1, 11))

for square in square_generator:
    print(square)

# -----------------------------

def active_users(users):
    for user in users:
        if user['active']:
            yield user['name']

users = [
    {"name": "Alice", "active": True},
    {"name": "Bob", "active": False},
    {"name": "Charlie", "active": True},
    {"name": "David", "active": False},
    {"name": "Eva", "active": True}
]

for name in active_users(users):
    print(name)
