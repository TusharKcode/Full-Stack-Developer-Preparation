nums = [1, 2, 3, 4, 5]
result = [(x, x**2) for x in nums if x % 2 != 0]
print(result)

x = int(input("Enter x: "))
print("A" if x > 10 and x % 2 == 0 else "B" if x > 10 else "C")

data = ["apple","cat","banana","car","dog"]
print(sorted(data, key=lambda x:(len(x)%2, -len(x), x), reverse=True))