def fibonacci(n):
    sequence = [0, 1]

    if n == 0:
        return 0

    if n <= 2:
        return 1

    for i in range(2, n + 1):
        next_val = sequence[i - 1] + sequence[i - 2]
        sequence.append(next_val)

    return sequence[n]

print(fibonacci(0))
print('')
print(fibonacci(1))
print('')
print(fibonacci(2))
print('')
print(fibonacci(3))
print('')
print(fibonacci(5))
print('')
print(fibonacci(10))
print('')
print(fibonacci(15))