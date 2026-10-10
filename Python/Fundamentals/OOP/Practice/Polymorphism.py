class Employee:
    def show_role(self):
        print("Employee works in the company.")

class Developer(Employee):
    def show_role(self):
        print("Developer writes code.")

class Designer(Employee):
    def show_role(self):
        print("Designer creates UI design.")

def display_role(employee):
    employee.show_role()

developer = Developer()
designer = Designer()

developer.show_role()
designer.show_role()

display_role(developer)
display_role(designer)