const human = {
        firstName: "Virat",
        lastName: "Kohli",
        age: 30,
        fullName: function(){
            return this.firstName + " " + this.lastName		
        }
}
console.log(human.age)      // 30

human.age = 35
human.getAge = function(){
    return this.age
}
console.log("New age of human is: ",human.age)  // 35, after adding new properties using "Dot notation"

human["weight"] = 65
human.getWeight = function(){
    return this.weight
}
console.log("Human weight is: ", human.weight)  // 65, after adding new properties using "Square brackets"

console.log(human.firstName)
console.log(human.fullName())
console.log(human["firstName"])
console.log(delete human.firstName) // returns boolean values
// console.log(human.firstName)    // Undefined after deleting