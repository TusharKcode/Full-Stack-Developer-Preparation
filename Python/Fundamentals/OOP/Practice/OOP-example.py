# class Employee:
#     def __init__(self, name, email, salary):
#         self.name = name
#         self.email = email
#         self.__salary = salary

#     def get_salary(self):
#         return self.__salary

#     def show_details(self):
#         print(f"Name: {self.name}")
#         print(f"Email: {self.email}")
#         print(f"Salary: {self.__salary}")

#     def show_role(self):
#         print("Employee work in the company.")

# class Developer(Employee):
#     def __init__(self, name, email, salary, programming_language):
#         super().__init__(name, email, salary)
#         self.programming_language = programming_language

#     def show_role(self):
#         print("Developer writes code.")

#     def show_developer_details(self):
#         print(f"Programming language: {self.programming_language}")

# class Manager(Employee):
#     def __init__(self, name, email, salary, team_size):
#         super().__init__(name, email, salary)
#         self.team_size = team_size

#     def show_role(self):
#         print("Manager manages the team.")

#     def show_manager_details(self):
#         print(f"Team Size: {self.team_size}")

# def display_role(employee):
#     employee.show_role()

# developer = Developer("Alice", "alice@example.com", 70000, "Python")
# manager = Manager("John", "john@example.com", 100000, 8)

# developer.show_details()
# manager.show_details()

# print(developer.get_salary())

# developer.show_role()
# manager.show_role()

# display_role(developer)
# display_role(manager)

# --------------------------------------------------------------------------

class Payment:
    def __init__(self, amount):
        self.amount = amount

    def show_amount(self):
        print(f"Amount: {self.amount}")

    def pay(self):
        print("Processing Payment....")

class UPIPayment(Payment):
    def __init__(self, amount, upi_id):
        super().__init__(amount)
        self.upi_id = upi_id

    def pay(self):
        print(f"Paid {self.amount} using UPI ID {self.upi_id}.")

class CardPayment(Payment):
    def __init__(self, amount, card_last_four):
        super().__init__(amount)
        self.card_last_four = card_last_four
    
    def pay(self):
        print(f"Paid {self.amount} using Card ending in {self.card_last_four}.")

def process_payment(payment):
    payment.pay()

upi = UPIPayment(5000, "upi@12")
card = CardPayment(10000, "4321")

process_payment(upi)
process_payment(card)