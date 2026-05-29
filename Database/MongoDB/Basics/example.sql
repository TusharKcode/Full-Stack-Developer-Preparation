-- 1. Create or Switch to a Database
use LibraryDB

-- 2. Create a Collection and Insert a Document
db.books.insertOne({
    title: "MongoDB for Beginners",
    author: "Alice Johnson",
    year: 2023
})

-- 3. Verify the Insertion
db.books.find()