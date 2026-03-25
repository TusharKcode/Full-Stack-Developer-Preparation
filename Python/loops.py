# programming_languages = ['Rust', 'Java', 'Python', 'C++']

# for language in programming_languages:
#     print(language)

# programming_languages = ['Rust', 'Java', 'Python', 'C++']
# for language in programming_languages:
#     print(language) 
        
# for char in 'code':
#     print(char)

# # Nested for loop
# categories = ['Fruit', 'Vegetable']
# foods = ['Apple', 'Carrot', 'Banana']
# for category in categories:
#     for food in foods:
#         print("Nested For loop: ",category, food)


# # With While loop
# secret_number = 3
# guess = 0
# while guess != secret_number:
#     guess = int(input('Guess the number (1-5): '))
#     if guess != secret_number:
#         print('Wrong! Try again.')

# print('You got it!')


# words = ['sky', 'apple', 'rhythm', 'fly', 'orange']
# for word in words:
#     for letter in word:
#         if letter.lower() in 'aeiou':
#             print(f"'{word}' contains the vowel '{letter}'")
#             break
#     else:
#         print(f"'{word}' has no vowels")


# languages = ['Spanish', 'English', 'Russian', 'Chinese']
# index = 0
# for language in languages:
#     print(f'Index {index} and language {language}')
#     index += 1

# languages = ['Spanish', 'English', 'Russian', 'Chinese']
# list(enumerate(languages))
# for index, language in enumerate(languages):
#     print('Enumerate Function:')
#     print(f'Index {index} and language {language}')

# languages = ['Spanish', 'English', 'Russian', 'Chinese']
# for index, language in enumerate(languages, 1):
#     print(f'Index {index} and language {language}')

# developers = ['Naomi', 'Dario', 'Jessica', 'Tom']
# ids = [1, 2, 3, 4]
# list(zip(developers, ids))

# developers = ['Naomi', 'Dario', 'Jessica', 'Tom']
# ids = [1, 2, 3, 4]

# for name, id in zip(developers, ids):
#     print(f'Name: {name}')
#     print(f'ID: {id}')

# even_numbers = []

# for num in range(21):
#     if num % 2 == 0:
#         even_numbers.append(num)

# print(even_numbers)

# even_numbers = [num for num in range(21) if num % 2 == 0]
# print(even_numbers)

numbers = [1, 2, 3, 4, 5]

even_numbers = list(filter(lambda x: x % 2 == 0, numbers))
print(even_numbers)  # [2, 4]    