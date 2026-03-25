function multiply(a, b){
    return a * b
}
console.log(multiply(2, 4))


const createMultiplier = (factor) => {
    return (num) => num * factor
}
const double = createMultiplier(2)
console.log(double(5))

// 2nd way of above code
// const createMultiplier = factor => num => num * factor
// const double = createMultiplier(2)
// console.log(double(5))

const prices = [100, 200, 300]
const gettingPrices = prices.map(p => (p * 1.10).toFixed(2)) // for decimal 
// const gettingPrices = prices.map(p => Math.round(p * 1.10))  // for non-decimal
console.log(gettingPrices)

const users = [
    {name: "A", age: 15},
    {name: "B", age: 22},
    {name: "C", age: 35},
    {name: "D", age: 12}
]
const filterAdults = users.filter(u => u.age >= 18)
console.log(filterAdults)

const nums = [10, 20, 30]
const totalSum = nums.reduce((acc, num) => {
    return acc + num
}, 0)
console.log(totalSum)

const orders = [
    { id: 1, amount: 100},
    { id: 2, amount: 200},
    { id: 3, amount: 300}
]
const revenue = orders.reduce((acc, order) => {
    return acc + order.amount
}, 0)
console.log(revenue)
