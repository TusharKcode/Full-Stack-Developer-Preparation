const API_url = "https://jsonplaceholder.typicode.com/users"

let allUsers = []

async function getUsers() {
    const loading = document.getElementById("loading")
    const users = document.getElementById("users")
    
    loading.innerText = "Loading..."
    users.innerHTML = ""

    try {
        const res = await fetch(API_url)
        const data  = res.json()
        loading.innerText = ""
        console.log(data)
        displayUsers(data)
    } catch (error) {
        loading.innerText = "Error loading data"
        console.error(error)
    }
}

function displayUsers(){
    const usersList = document.getElementById("users")
    
    users.forEach(({name, email, address}) => {
        const div = document.createElement("div")
        div.className("users")

        div.innerHTML = `
            <h3>Name: ${name}</h3>
            <p>Email: ${email}</p>
            <p>City:  ${address.city}</p>
        `;

        usersList.appendChild(div)
    });
}

function filterUsers(users, keyword){
    return users.filter(user => {
        user.name.toLowerCase().includes(keyword.toLowerCase())
    })
}