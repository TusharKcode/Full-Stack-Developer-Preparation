# quote = 'She said, "Hello World!"'
# print(quote)

# msg = 'It\'s a sunny day'
# quote = "She said, \"Hello!\""
# print(msg)
# print(quote)

# my_str = 'Hello world'
# print('Hello' in my_str)
# print('hey' in my_str)
# print('hi' in my_str)
# print('e' in my_str)
# print('f' in my_str)

# my_str = 'Hello world'
# print(len(my_str))

# my_str = 'Hello world'
# my_str = 'greetings'
# print(my_str[5]) # spaceing
# print(my_str[10])
# print(my_str[-1]) # simple we can say ' from reverse'
# print(my_str[-7])

# my_str = 'Hello'
# my_str2 = 'Bro'
# sp_str = my_str + ' ' + my_str2 # same
# print(my_str + " " + my_str2)   # concatenation
# print(sp_str) 

# name = 'Tushar'
# age = 22
# name_age = name + ' ' + str(age)
# print(name_age)

# name = 'John Doe'
# age = 26
# name_and_age = name  # Start with the name
# name_and_age += str(age)  # Append the age as string
# print(name_and_age)  # John Doe26

# num1 = 10
# num2 = 23
# print(f"The sum of {num1} and {num2} is {num1 + num2}")

# name = 'Tushar'
# age = 22
# name_age = f'My name is {name} and age is {age}'
# print(name_age)

my_str = ' "Hello World" '
print("Start - End - Step: ",my_str[0 : 11 : 2])
print("Uppercase String: ", my_str.upper())
print("Is string upper?: ", my_str.isupper())
print("Is string lower?: ", my_str.islower())
print("Lowercase String: ", my_str.lower())
print("Removed Spaces: ", my_str.strip())
print("Replacing Strings: ", my_str.replace('hello', 'hi'))
print("Separating words: ", my_str.split())
print("Starts with: ", my_str.startswith('hello'))
print("Ends with: ", my_str.startswith('world'))
print("Find words", my_str.find('world'))
print("Counting words: ", my_str.count('l'))
print("Capitalize string: ", my_str.capitalize())
print("Title format of string:", my_str.title())