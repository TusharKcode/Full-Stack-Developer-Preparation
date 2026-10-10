class Student:
    def show_details(self):
        print(f"Name: {self.name}")
        print(f"Age: {self.age}")
        print(f"Course: {self.course}")

student1 = Student()
student1.name = "Alice"
student1.age = 22
student1.course = "Python Full Stack"

student1.show_details()

student2 = Student()
student2.name = "Bob"
student2.age = 23
student2.course = "Python Full Stack"

student2.show_details()