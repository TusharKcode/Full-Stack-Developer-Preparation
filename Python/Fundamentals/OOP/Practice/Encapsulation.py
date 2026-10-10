class BankAccount:
    def __init__(self, account_holder, balance):
        self.account_holder = account_holder
        self.__balance = balance

    def deposit(self, amount):
        if amount > 0:
            self.__balance += amount
            return self.__balance
        else: 
            return "Invalid Deposit amount"

    def withdraw(self, amount):
        if amount > 0 and amount <= self.__balance:
            self.__balance -= amount
            return self.__balance
        else: 
            return "Invalid withdrawal"

    def get_balance(self):
        return self.__balance

account = BankAccount("Alice", 10000)

print(account.account_holder)

deposit_message = account.deposit(5000)
print(deposit_message)

withdraw_message = account.withdraw(3000)
print(withdraw_message)

print(account.get_balance())
# print(account.__balance)    # Attribute error