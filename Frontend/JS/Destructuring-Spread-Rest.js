let arr = [3, 5, 7, 9, 19]
// let [a, b, ...rest] = arr
// console.log(a, b, rest)   // Output: 3 5 [ 7, 9, 19 ]

// let [a, , , ...rest] = arr
// console.log(a, rest)   // Output: 3 [ 9, 19 ]

let {a, b} = {a : 1,  b : 2}
console.log(a, b)       // Output: 1 2

// Spreading
const arr1 = [1, 2, 3]
const obj1 = {...arr1}
console.log(obj1)       // Output: { '0': 1, '1': 2, '2': 3 }

let arr2 = [4, 7, 8]
function sum(v1, v2, v3){
    return v1 + v2 + v3
}
console.log(sum(...arr2))       // Output: 19

let objects = {
    name:"Tushar",
    course: "MCA",
    age: 22
}
console.log({...objects, age: 23}) //First it will print all objects then Overrides the 'age' value.
console.log({name: "John", age: 23, ...objects})// This will not change any values

const user = {
    name: "Tushar",
    address: {
        city: "Delhi"
    }
}
// const {city} = user.address
// console.log(city)

// const {address: {city}} = user
// console.log(city)

const {address: {city : userCity}} = user
console.log(userCity)

const a1 = { x : 1, z : 10}
const b1 = { y : 2, z : 20}
const merging = {...a1, ...b1}        // using spreading (...)
console.log(merging)            // Output: { x: 1, y: 2 }

const calculateSum = (...rest) => rest.reduce((a, b) => a + b, 0)
console.log(calculateSum(1,2,3,4,5))

// converting into arrow function
// function multiply(a, b){
//     return a * b
// }
// console.log(multiply(4 , 5))

const multiply = (a, b) => a * b
console.log(multiply(4,5))      // can use 'return' keyword