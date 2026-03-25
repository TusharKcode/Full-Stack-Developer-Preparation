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