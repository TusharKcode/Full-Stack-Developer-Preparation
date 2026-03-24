const student = {
    name : "Tushar",
    age: 22,
    subjects: ["Python", "Java", "JavaScript", "TypeScript"],
    address: {
        state: "New Delhi",
        city: "Najafgarh"
    }
}

// Adding email as new property
student["email"] = "tk@gmail.com"
student.getEmail = function(){
    return this.email
}
console.log('User email added:',student.email)

//Updating age
student.age = 23
student.getAge = function(){
    return this.age
}
console.log('User age updated', student.age)

// deleting a property
delete student.age
console.log(student.age)

// removing an element
student.subjects.splice(1)
console.log("Subjects after removal:",student.subjects)

//Printing all keys and values 
Object.entries(student).forEach(([key, value]) => {
    console.log(`${key} : ${value}`)
})

