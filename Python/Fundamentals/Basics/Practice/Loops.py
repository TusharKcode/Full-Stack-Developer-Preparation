for number in range(1, 11):
    print(number)

# ----------------------------

for even_number in range(2, 21, 2):
    print(even_number)

# ----------------------------

name = "Python"

for character in name:
    print(character)

# ----------------------------
number = 1
while number <= 5:
    print(number)
    number += 1

# ----------------------------

for number in range(1, 8):
    if number == 6:
        break
    print(number)

# ----------------------------

for number in range(1, 11):
    if number == 5:
        continue
    print(number)

# ----------------------------

for number in range(1, 6):
    if number == 3:
        pass       # when number reaches 3, there is no specific condition so it will pass and continue till end of range.
    print(number)

# ----------------------------

attempts = 1

while attempts <= 3:
    print("Login attempt:", attempts)
    attempts += 1

print("Maximum attempts reached.")

# ----------------------------

orders = [500, 0, 1200, -50, 750]

for order_amount in orders:
    if order_amount <= 0:
        print("Invalid order, skipping.")
        continue

    if order_amount >= 1000: 
        print(f"Large order: {order_amount}")
    else: 
        print(f"Processing order: {order_amount}")

# ----------------------------

users = ["Alice", "Bob", "Charlie", "David"]
target_user = "Charlie"

for user in users:
    print(f"Checking: {user}")
    if user == target_user:
        print("User found!")
        break

# ----------------------------