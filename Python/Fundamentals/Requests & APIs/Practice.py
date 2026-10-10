import requests

# url = "https://jsonplaceholder.typicode.com/users"
post_url = "https://jsonplaceholder.typicode.com/posts"
params = {
    "userId": 1
}
response = requests.get(post_url, params=params)

# if response.status_code == 200:
#     users = response.json()
#     # print(users)

#     for user in users:
#         if user['address']['city'] == "Gwenborough":
#             print(user['name'])
#             print(f"{user['id']} - {user['name']} - {user['email']}")

if response.status_code == 200:
    posts = response.json()
    
    for post in posts:
        print(f"Post {post['id']} (User {post['userId']}): {post['title']}")
    print("\nRequested URL:", response.url)

else: 
    print(f"Failed to retrieve data. Status code: {response.status_code}")
