def verify_card_number(card_number):
    digits_only = ""

    for char in card_number:
        if char.isdigit():
            digits_only += char

    digits = [int(d) for d in digits_only]
    reversed_digits = digits[::-1]

    total = 0

    for i in range(len(reversed_digits)):
        digit = reversed_digits[i]

        if i % 2 == 1:
            digit *= 2 

            if digit > 9:
                digit -= 9

        total += digit

    if total % 10 == 0:
        return 'VALID!'
    else:
        return 'INVALID!'

print(verify_card_number('453914889'))
print(verify_card_number('4111-1111-1111-1111'))
print(verify_card_number('453914881'))
print(verify_card_number('1234 5678 9012 3456'))