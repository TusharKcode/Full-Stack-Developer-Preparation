// const person = {
//     name: "Tushar",
//     greet(){
//         console.log("Hello")
//     }
// }

// console.log(person.name)
// console.log(person.greet())

// function Person(name){
//     this.name = name
// }

// Person.prototype.sayHello = function(){
//     console.log("Hello " + this.name)
// }

// const user = new Person("Tushar")
// user.sayHello();


// const animal = {
//     eats: true
// }

// const dogs = {
//     barks: true
// }

// dogs.__proto__ = animal
// console.log(dogs.eats)

// const obj = {}
// console.log(obj.toString()) Output: [object Object]

// function Car(brand){
//     this.brand = brand
// }

// Car.prototype.drive = function(){
//     console.log("I am driving " + this.brand)
// }

// const car = new Car("BMW")
// car.drive()


// Modern Syntax instead of using "__proto__"
    const Animal = {
        eats: true
    }
    const dogs = Object.create(Animal)
    dogs.barks = true

    console.log(dogs.eats)