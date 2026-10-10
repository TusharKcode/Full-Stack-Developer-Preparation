age = 25

if age >= 18:
    print("You are an adult.")

# ------------------------------------

age = 16

if age >= 18:
    print("You can vote")
else:
    print("You cannot vote")

# ------------------------------------

number = -10

if number > 0:
    print("Positive")
else:
    print("Negative")

# ------------------------------------

marks = 82

if marks >= 90:
    print("A+")
elif marks >= 80:
    print("A")
elif marks >= 70:
    print("B")
elif marks >= 60:
    print("C")
else:
    print("Fail")

# ------------------------------------

is_logged_in = True

if is_logged_in:
    print("Welcome back!")
else:
    print("Please login first.")

# ------------------------------------

is_logged_in = True
is_verified = False

if not is_logged_in:
    print("Please login first.")
elif not is_verified:
    print("Please verify your account.")
else:
    print("Access granted.")

# ------------------------------------

price = 1200
quantity = 3
discount = 200

is_logged_in = True
is_verified = True

subtotal = price * quantity
final_price = subtotal - discount

print("Subtotal: ", subtotal)
print("Final price: ", final_price)

if not is_logged_in:
    print("Please login first.")
elif not is_verified:
    print("Please verify your account.")
elif final_price <= 0: 
    print("Invalid order amount.")
else: 
    print("Checkout successful.")