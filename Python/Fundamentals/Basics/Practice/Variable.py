name = "Bob"
age = 24
city = "India"
programming_language = "Python"

print(name)
print(age)
print(city)
print(programming_language)

# ------------------------------------------

price = 500
quantity = 3
total = price * quantity

print(total)

# ------------------------------------------

name = str(input("Name: "))
age = int(input("Age: "))

print(f"Hello {name}, You are {age} years old.")

# ------------------------------------------

marks1 = 80
marks2 = 75
marks3 = 90

total = marks1 + marks2 + marks3
average = total / 3

print("Total marks: ", total)
print("Average Marks: ", average)

# ------------------------------------------

def create_user():
    username = "John Bravo"
    email = "johnUser@example.com"
    is_logged_in = True

    return{
        "username": username,
        "email": email,
        "is logged in?": is_logged_in
    }

print(create_user())