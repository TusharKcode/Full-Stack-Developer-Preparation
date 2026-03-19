// console.log("Start")

// setTimeout(function cb(){
//     console.log("Callback")
// }, 1000)

// console.log("End")

console.log("Start")

setTimeout(function cbT(){
    console.log("CB SetTimeout")
}, 5000)

fetch("any API")
.then(function CbF(){
    console.log("CB Netflix")
})

console.log("End")