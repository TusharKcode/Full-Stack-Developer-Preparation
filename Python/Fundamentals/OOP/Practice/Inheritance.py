class Employee:
    def __init__(self, name, email):
        self.name = name
        self.email = email

    def show_basic_details(self):
        print(f"Name: {self.name}")
        print(f"Email: {self.email}")

class Developer(Employee):
    def __init__(self, name, email, programming_language):
        super().__init__(name, email)
        self.programming_language = programming_language

    def show_developer_details(self):
        print(f"Name: {self.name}")
        print(f"Email: {self.email}")
        print(f"Programming Language: {self.programming_language}")

    def show_basic_details(self):
        print(f"Developer: {self.name}")
        print(f"Email: {self.email}")

developer = Developer("Alice", "alice@example.com", "Python")

developer.show_basic_details()
developer.show_developer_details()