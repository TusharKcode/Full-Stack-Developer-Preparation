text = "Python Programming"

print("String:", text)
print("Length:", len(text))
print("First character:", text[0])
print("Last character:", text[-1])

print("Slicing:", text[:6])
print("Slicing:", text[7:])
print("First 6 character:", text[:6])
print("Last 11 character:", text[7:])
print("Reversed String:", text[::-1])

# ---------------------------------

text = "python full stack developer"

print("Upper:", text.upper())
print("Lower:", text.lower())
print("First character upper:", text.capitalize())
print("Every first character upper:", text.title())

# ---------------------------------

username = "   Alice   "
print(username.strip().lower())

# ---------------------------------

text = "Python is easy. Python is powerful. Python is popular."
print(text.find("Python"))
print(text.find("Java"))
print(text.count("Python"))

# ---------------------------------

message = "I am learning Java"
print(message.replace("Java", "Python"))

# ---------------------------------

skills_text = "Python,FastAPI,React,MySQL"

skills_list = skills_text.split(",")
print(skills_list)

joined_skills = " | ".join(skills_list)
print(joined_skills)

# ---------------------------------

value1 = "12345"
value2 = "Python"
value3 = "Python123"

print("Are all digits: ", value1.isdigit())
print("Are all alphabetic: ", value2.isalpha())
print("Is containing both numbers or alphabets: ", value3.isalnum())

# ---------------------------------

email = "   ALICE@EXAMPLE.COM   "
print(email.strip().lower())
print("@" in email)

# ---------------------------------

username = "   TusharKcode   "
email = "   TUSHAR@EXAMPLE.COM   "

print(username.strip().lower())
print(email.strip().lower())
print("@" in email)