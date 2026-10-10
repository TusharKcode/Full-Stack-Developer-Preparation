stack = []

stack.append("Login")
stack.append("Dashboard")
stack.append("Profile")

print(stack)

removed_page = stack.pop()
print("Removed: ", removed_page)
print("Remaining: ", stack)

# ----------------------------------------

from collections import deque

queue = deque()
queue.append("Task 1")
queue.append("Task 2")
queue.append("Task 3")

print(queue)

removed_task = queue.popleft()
print("Processed:", removed_task)
print("Remaining:", queue)