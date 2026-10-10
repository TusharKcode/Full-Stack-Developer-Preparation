class Student:
    def __init__(self, name, age, course, marks):
        self.name = name
        self.age = age
        self.course = course
        self.marks = marks

    def is_passed(self):
        if self.marks >= 40:
            return "Passed"
        else:
            return "Failed"

    def show_details(self):
        print(f"Name: {self.name}")
        print(f"Age: {self.age}")
        print(f"Course: {self.course}")
        print(f"Marks: {self.marks}")
        print(f"Is passed?: {self.is_passed()}")

student1 = Student("Alice", 22, "Python Full Stack", 85)
student2 = Student("Bob", 23, "Python Full Stack", 78)
student3 = Student("John", 23, "Python Full Stack", 39)

student1.show_details()
student2.show_details()
student3.show_details()