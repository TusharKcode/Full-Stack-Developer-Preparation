import requests

BASE_URL = "https://api.example.com"

def get_users():
    response = requests.get(f"{BASE_URL}/users", timeout=10)

    response.raise_for_status()
    return response.json()


def get_user(user_id):
    response = requests.get(f"{BASE_URL}/users/{user_id}", timeout=10)

    response.raise_for_status()
    return response.json()


def create_user(name, email):
    data = {
        "name": name,
        "email": email
    }

    response = requests.post(f"{BASE_URL}/users", json=data, timeout=10)

    response.raise_for_status()
    return response.json()

users = get_users()

for user in users:
    print(user)