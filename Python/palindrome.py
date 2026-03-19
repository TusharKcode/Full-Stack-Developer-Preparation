# A palindrome is a number, string or any data value, which reads the same from backwards. 
# i.e. If we reverse a value and compare it with its original value, the result should be true.

palindrome_str = input("Enter string to check palindrome: ")

not_palindrome = 0
i = 0
j = len(palindrome_str) - 1

while i <= j :
    if palindrome_str[i] != palindrome_str[j]:
        not_palindrome = 1
        break
    i += 1
    j -= 1

if not_palindrome != 1:
    print("It is Palindrome")
else: 
    print("It is not Palindrome")