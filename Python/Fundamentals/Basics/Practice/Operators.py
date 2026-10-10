price = 499
quantity = 3
discount = 100

subtotal = price * quantity
final_price = subtotal - discount

print("Subtotal: ", subtotal)
print("Final price after discount: ", final_price)

# -----------------------------

total_items = 27
items_per_box = 5

complete_boxes = total_items // items_per_box
remaining_items = total_items % items_per_box

print("Complete Boxes: ", complete_boxes)
print("Remaining Items: ", remaining_items)

# -----------------------------

balance = 1000

balance += 500
balance -= 200
balance *= 2
balance /= 2

print("Final Balance: ", balance)

# -----------------------------

age = 25
has_id = True

is_adult = age >= 18
can_enter = age >= 18 and has_id
cannot_enter = not can_enter

print("Is adult?: ", is_adult)
print("Can enter?: ", can_enter)
print("Cannot enter?: ")

# -----------------------------

email = "john@example.com"  # Ignore the name I used

print("@" in email)
print("gmail.com" in email)
print("example.com" in email)
print("yahoo.com" not in email)

# -----------------------------

price = 1200
quantity = 3
discount = 200

is_logged_in = True
is_verified = True

subtotal = price * quantity
final_price = subtotal - discount

print("Subtotal: ", subtotal)
print("Final price after discount: ", final_price)

can_checkout = is_logged_in and is_verified and final_price > 0
print("Do I checkout from store? : ", can_checkout)
# -----------------------------

age = 22

print(age == 22)
print(age != 22)
print(age > 18)
print(age < 18)
print(age >= 22)
print(age <= 22)