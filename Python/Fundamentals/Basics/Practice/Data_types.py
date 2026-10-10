name = "Alice"
age = 22
height = 5.6
is_student = True
middle_name = None

print(type(name))
print(type(age))
print(type(height))
print(type(is_student))
print(type(middle_name))

# ------------------------------------

age = "25"
price = "499.99"

converted_age = int(age)
converted_price = float(price)

print("Converted age to Int: ", converted_age, type(converted_age))
print("Converted price to Float: ", converted_price, type(converted_price))

# ------------------------------------

price = 250
quantity = 4
discount = 50.5

subtotal = price * quantity
final_price = subtotal - discount

print("Subtotal: ", subtotal)
print("Final Price: ", final_price, type(final_price))

# ------------------------------------

name = str(input("Name: "))
age  = int(input("Age: "))
salary = float(input("Salary: "))

print("Name: ", name, type(name))
print("Age: ", age, type(age))
print("Salary: ", salary, type(salary))

# ------------------------------------

username = "Johnny"
age = 25
email = "jh@example.com"
is_verified = True
profile_picture = None
account_balance = 1500.75

user = {
    "username": username,
    "age": age,
    "email": email,
    "is_verified": is_verified,
    "profile_picture": profile_picture,
    "account_balance": account_balance
}

print("User Dictionary:")
print(user)

for key, value in user.items():
    print(f"{key}: {type(value)}")

# ------------------------------------

# username              -> string           -> we are storing name as text
# age                   -> integer          -> it can't be text and decimal, will only be in integer value
# price                 -> float*           -> because calculation always results in decimal value
# email                 -> string           -> because of text format
# is_logged_in          -> boolean          -> to decide whether true or false
# phone_number          -> string           -> text format b/s can contains spaces, hyphens, leading zeroes, 
#                                               basically not performing calculations here
# profile_picture       -> None / str*      -> means no value exists if no picture
# number_of_products    -> integer          -> number format can't be count in decimal

# ------------------------------------