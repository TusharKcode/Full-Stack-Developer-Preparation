languages = ["Python", "Java", "JavaScript", "C++"]
print(languages)

# ------------------------------------

print(languages[0])
print(languages[-1])
print(languages[2])

# ------------------------------------

languages[1] = "C#"
print(languages)

# ------------------------------------

languages = ["Python", "Java", "JavaScript"]
languages.append("C++")
languages.insert(1, "Go")
print(languages)

# ------------------------------------

languages = ["Python", "Java", "JavaScript", "C++"]
languages.remove("Java")
languages.pop(-1)
print(languages)

# ------------------------------------

languages = ["Python", "Java", "JavaScript"]
print("Python" in languages)
print("C++" in languages)

# ------------------------------------

products = ["Laptop", "Mouse", "Keyboard", "Monitor"]
for product in products:
    print("Product:", product)

# ------------------------------------

prices = [500, 1200, 800, 2500, 1000]
print(len(prices))
prices.append(3000)
prices.remove(800)
prices.sort()
print(prices)
print(2500 in prices)