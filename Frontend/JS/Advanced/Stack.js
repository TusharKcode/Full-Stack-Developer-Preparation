// function first(){
//     console.log("First...")
// }

// function second(){
//     console.log("Second...")
// }

// function third(){
//     console.log("Third...")
// }

// first()
// second()
// third()

// function returnFunc(){
//     const x = () => {
//         let a = 1;
//         console.log(a)

//         const y = ()  => {
//             let a = 2
//             console.log(a)

//             const z = ()  => {
//                 let a = 3
//                 console.log(a)    
//             }
//             z()
//         }
//         a = 999
//         y()
//     }
//     return x
// }

// let a = returnFunc()
// a()

// function init(){
//     var name = "Tushar"
//     function displayName(){
//         console.log(name)
//     }
//     // name = "Kumar"
//     return displayName
// }
// let myName = init()
// myName()

// function test(){
//     let x = 10;

//     return function(){
//         console.log(x);
//     }
// }

// const fn = test();
// fn();

function multiplier(factor){
    return function(number){
        return number * factor;
    }
}

const multiplyBy2 = multiplier(2);

multiplyBy2(5); //10
multiplyBy2(10); //20

console.log(multiplyBy2(5))
console.log(multiplyBy2(10))