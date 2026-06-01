class User{
    constructor(name, email){
        this.name = name
        this.email = email
    }
    getDetails(){
        return `User: ${this.name} and Email: ${this.email} a`
    }
}

const newUser = new User("Tushar", "tk@test.com")
console.log(newUser.getDetails())


// Inheritance
class Admin extends User{
    constructor(name, email, role){
        super(name, email)
        this.role = role
    }

    deleteUser(user){
        console.log(`${this.name} (Admin) deleting user: ${user.name}`)
    }

    getDetails(){
        console.log(`${super.getDetails()} [Role: ${this.role}]`)
    }
}

const adminAcc = new Admin("AdminTK", "admin12@test.com", "Admin")
console.log(adminAcc.getDetails())
adminAcc.deleteUser(newUser)

//Encapsulation
class Account{
    #balance
    constructor(initialBal){
        this.#balance = initialBal
    }
    deposit(amount){
        if (amount > 0) {
            this.#balance += amount
            console.log(`Deposited: ${amount}. New Balance: ${this.#balance}`);
        } else{
            console.log("There must be initial amount of balance.")
        }
    }

    withdraw(amount){
        if (amount > 0 && amount <= this.#balance) {
            this.#balance -= amount
            console.log(`Withdraw: ${amount}. Remaining Balance: ${this.#balance}`)
        } else {
            console.log("There must be initial amount of balance to withdraw")
        }
    }
    getBalance(){
        return this.#balance
    }
}
const mySavings = new Account(1000)
mySavings.deposit(500)
mySavings.withdraw(200)
console.log(mySavings.getBalance())