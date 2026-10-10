skills_set = {"Python", "Java", "JavaScript", "C++"}
print(skills_set)

# ----------------------------------

numbers = [10, 20, 10, 30, 20, 40, 30, 50]
number_set = set(numbers)
print(number_set)

# ----------------------------------

skills = {"Python", "React"}
skills.update(["FastAPI", "Docker"]) # to add multiple elements 
print(skills)

# ----------------------------------

skills = {"Python", "React", "FastAPI", "Docker"}
skills.remove("React")
skills.discard("Docker")
print(skills)

# ----------------------------------

skills = {"Python", "FastAPI", "React", "MySQL"}
if "Python" in skills:
    print("Python exists")
else:
    print("Python does not exist")

if "Java" in skills:
    print("Java exists")
else:
    print("Java does not exist")

# ----------------------------------

python_students = {"Alice", "Bob", "Charlie"}
java_students = {"Bob", "David", "Eve"}

all_students = python_students | java_students      # union
print(all_students)

learning_both = python_students & java_students     # intersection
print(learning_both)

only_python = python_students - java_students       # difference
print(only_python)

result = python_students ^ java_students            # symmetric difference
print(result)

# ----------------------------------

user_permissions = {"read", "profile"}

if "read" in user_permissions:
    print("User can read")
else:
    print("User cannot read")

if "write" in user_permissions:
    print("User can write")
else:
    print("User cannot write")

if "delete" in user_permissions:
    print("User can delete")
else:
    print("User cannot delete")

# ----------------------------------

user_skills = [
    "Python",
    "React",
    "Python",
    "FastAPI",
    "React",
    "Docker",
    "Python"
]

unique_skills = set(user_skills)
print("Unique skills: ", unique_skills)
print("Number of unique skills: ", len(unique_skills))

# ----------------------------------

frontend = {"HTML", "CSS", "JavaScript", "React"}
backend = {"Python", "FastAPI", "JavaScript", "SQL"}

all_tech = frontend | backend           # union
print(all_tech)

common_tech = frontend & backend        # intersection
print(common_tech)

only_frontend = frontend - backend      # difference
print(only_frontend)

only_backend = backend - frontend       # difference
print(only_backend)