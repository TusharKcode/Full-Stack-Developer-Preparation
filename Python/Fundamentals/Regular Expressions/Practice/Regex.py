import re

text = "I am learning Python and FastAPI for backend development."
searching = re.search(r"Python", text)
print(searching.group())

start = re.match(r"I", text)
print(start.group())

end = re.search(r"development.$", text)
print(end.group())

# ------------------------------

text = "Products: Laptop 70000, Mouse 1500, Keyboard 3000"

numbers = re.findall(r"\d+", text)
print(numbers)

# ------------------------------

text = """
Contact alice@example.com
Support: support@company.com
Admin: admin123@test.org
"""
pattern = r"[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\.[a-zA-Z0-9-.]+"
emails = re.findall(pattern, text)
print(emails)

# ------------------------------

text = "Python     Full    Stack     Developer"

search_replace = re.sub(r"\s+", " ", text)
print(search_replace)

# ------------------------------

def is_valid_username(username):
    pattern = r"^[a-zA-Z0-9_]{3,20}"
    return bool(re.fullmatch(pattern, username))

print(is_valid_username("tushar_123"))
print(is_valid_username("ab"))
print(is_valid_username("tushar kumar"))

# ------------------------------

def is_valid_phone(phone):
    pattern = r"^[6-9]\d{9}$"
    return bool(re.match(pattern, phone))

print(is_valid_phone("9876543210"))
print(is_valid_phone("5123456789"))
print(is_valid_phone("987654321"))


# ------------------------------

text = """
User: Alice | Email: alice@example.com | Phone: 9876543210
User: Bob | Email: bob@example.com | Phone: 8765432109
"""

names = re.findall(r"User:\s*(\w+)", text)
emails = re.findall(r"[\w.-]+@[\w.-]+\.\w+", text)
phones = re.findall(r"Phone:\s*(\d{10})", text)

print("Names:",names)
print("Emails:",emails)
print("Phone Numbers:",phones)

# ------------------------------

logs = """
2026-09-26 INFO User 101 logged in
2026-09-26 ERROR User 102 authentication failed
2026-09-26 INFO User 103 logged in
2026-09-26 ERROR User 104 database connection failed
"""

user_ids = re.findall(r"User\s+(\d+)", logs)
errors_lines = re.findall(r"^.*ERROR.*$", logs, flags=re.MULTILINE)
error_user_ids = re.findall(r"ERROR\s+User\s+(\d+)" , logs)

print("User IDs:", user_ids)
print("Errors:", errors_lines)
print("Error User Id:", error_user_ids)

# ------------------------------

def analyze_text(text):
    email_pattern = r"[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}"
    url_pattern = r"https?://[^\s]+"
    number_pattern = r"\b\d+\b"
    phone_pattern = r"\b[6-9]\d{9}\b"

    emails = re.findall(email_pattern, text)
    phone_number = re.findall(phone_pattern, text)
    urls = re.findall(url_pattern, text)
    all_numbers = re.findall(number_pattern, text)

    numbers = [number for number in all_numbers if number not in phone_number]

    return{
        "emails":emails,
        "phone_number":phone_number,
        "urls":urls,
        "numbers":numbers
    }

text = """
    Contact alice@example.com or bob@test.com.
    Call 9876543210.
    Visit https://example.com.
    Order number 12345.
    """

result = analyze_text(text)
print(result)