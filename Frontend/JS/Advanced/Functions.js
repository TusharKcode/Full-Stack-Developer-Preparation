// Function Statement / function declaration
function add(a, b){
    return a + b
}
console.log(add(2,5))

// Function Expression
const add2 = function(x, y){
    return x + y
}
console.log(add2(7, 8))

// Anonymous Function
// Named Function Expression
// First class function
// Arrow Function
const multiply = (a, b) => a / b 
console.log(multiply(5, 4))

// Map function in High order functions
const arr = [1, 2, 3, 4, 5];
const output = arr.map((num) => num += 10)
console.log(arr); // [1, 2, 3, 4, 5]
console.log(output); // [11, 12, 13, 14, 15]

// Filter function in High order functions
const arr1 = [1, 2, 3, 4, 5];
const output1 = arr.filter((num) => num % 2) // filter out odd numbers
console.log(arr1); // [1, 2, 3, 4, 5]
console.log(output1); // [1, 3, 5]

//Reduce method
const numbers = [1, 2, 3, 4, 5];
const sum = numbers.reduce((total, currentValue) => {
    return total + currentValue;
}, 0)
console.log(sum); // 15

// const myNames = ["Oluwatobi", "Sofela"];
// function updateMyName(newName) {
//     myNames.push(newName);
//     return myNames;
// }
// console.log("Impure name: ", updateMyName("Tushar"))

function updateMyName(newName) {
    const myNames = ["Oluwatobi", "Sofela"];
    myNames[myNames.length] = newName;
    return myNames;
}
console.log("Pure name: " , updateMyName("Tushar"))

const myBio = ["Oluwatobi", "Sofela"];
function updateMyBio(newBio, array) {
    const clonedBio = [...array];
    clonedBio[clonedBio.length] = newBio;
    return clonedBio;
}
console.log(updateMyBio("codesweetly.com", myBio));
