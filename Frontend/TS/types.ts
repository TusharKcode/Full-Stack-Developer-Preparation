// Type: Number
var num1 : number = 20
console.log(num1)

var octal : number = 0o100001;
var hexa : number = 0b100001;
var binary : number = 0x00001;
console.log("Octal value is: ",octal + 10)
console.log("Hexadecimal value is: ",hexa)
console.log("Binary value is: ",binary)

//Type conversion in 3 ways
var item: number = 100
var item2 = '50'
var convertToInt = Number(item2)
// var convertToInt = +item2
// console.log(item + + item2)
console.log(`After type conversion sum of ${item} + (string) ${item2} is: `, item + convertToInt)

// Type Inference means auto guess or detects data types
var data = 34 // TS auto guess its a number
var data1: number | string = '3' // manually telling TS that data1 can contains both types
console.log(typeof(data))
console.log(typeof(data1))

// Type: String , 3 ways and type conversion
var str : string = "Hello"
var str1 : string = 'Hello'
var str2 : string = `Hello`

var age : number = 30
var myName : string = 'Tushar'
console.log(`My name is ${myName} and age is ${age}`)

var num = 100
var convertData : string  = num.toString()
// var convertData : string  = " " + num    // same with boolean data
console.log("After converting into string:", typeof(convertData))

// Type: Boolean
var bool : boolean = true
var bool : boolean = false

// Type: Null / Undefined
var nullDt: null = null
var udf : undefined = undefined

// Type: BigInt
var bigNum = 9007199254740991n
var x = 1n
var y = 2n
console.log(bigNum + x)
console.log(bigNum + y)

//Type: Symbol
var sym = Symbol()
var sym2 = Symbol()
console.log(sym == sym2)
