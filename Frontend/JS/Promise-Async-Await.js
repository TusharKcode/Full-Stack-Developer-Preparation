// 1.
const promiseOne = new Promise(function(resolve, reject){
    setTimeout(function(){
        console.log("Async tasks is completed")         // Creation of Promise
        resolve()
    },1000) // 1 sec
})

promiseOne.then(function(){
    console.log("Promise consumed")
})


// 2.
new Promise(function(resolve, reject){
    setTimeout(function(){
        console.log("Async Task 2 is on way")
        resolve()
    }, 1000)
}).then(function(){
    console.log("Async Task 2 resolved")
})

// 3.
const promiseThree = new Promise(function(resolve , reject){
    setTimeout(function(){
        resolve({username: "Tushar", email: "tushar@test.com"})
    }, 1000)
})

promiseThree.then(function(user){
    console.log(user, "User In")
})

// 4.
const promiseFour = new Promise(function(resolve, reject){
    setTimeout(function(){
        let error = false
        if (!error) {
            resolve({username:"Tushar", password:"qwert1"})
        } else {
            reject("Error: Something went wrong")
        }
    }, 1000)
})

promiseFour.then(function(user){
    console.log(user)
    return user.username
}).then((username) => {
    console.log(username)
}).catch((error) => {
    console.log(error)
}).finally(() => {
    console.log("Something either resolved or rejected")
})

// 5.
const promiseFive = new Promise(function(resolve, reject) {
    setTimeout(function(){
        let error = false
        if (!error) {
            resolve("JS batch slots available")
        } else {
            reject("Slots full for this batch")
        }
    }, 1000)
})

async function consumePromiseFive(){
    try {
        const response = await promiseFive
        console.log(response)
    } catch (error) {
        console.log(error)
    }
}
consumePromiseFive()


// Using fetch in one format 

// async function getAllUsers(){
//     try {
//         const response = await fetch("https://jsonplaceholder.typicode.com/users")
//         const data = await response.json()
//         console.log(data)
//     } catch (error) {
//         console.log(error)
//     }
// }
// getAllUsers()

// Using fetch in another format 

// fetch("https://jsonplaceholder.typicode.com/users")
// .then((response) => {
//     console.log(response)
//     return response.json()
// })
// .then((data) => {
//     console.log(data)
// })
// .catch((error) => console.log(error))

const p = new Promise((resolve) => {
    setTimeout(() => resolve("Done"), 5000)
})
p.then(console.log)

async function test(){
    return 10;
}
test().then(console.log)

async function testing(){
    let val = await Promise.resolve(20)
    console.log(val)
}
testing()


const delay = (ms) => new Promise((resolve) => setTimeout(resolve, ms))
async function run(){
    console.log("Waiting....")
    await delay(2000)
    console.log("2 seconds passed")
}
run()



function fakeApi(){
    return new Promise((resolve) => {
        setTimeout(() => resolve("Data Fetched"),1000)
    })
}
async function fetchingFakeApi(){
    try{
        const res = await fetch("")
        const data = await res.json()
        console.log(data)
    } catch (error){
        console.log("Fake API caught")
    }
}
fetchingFakeApi()