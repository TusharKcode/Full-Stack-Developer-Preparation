const blogs = [
    { 
        id: 1, 
        title: "Next.js utilizes React Server Components", 
        author: "Dan Abramov", 
        url: "https://example.com/nextjs-rsc", 
        likes: 124 
    },
    { 
        id: 2, 
        title: "Next.js is built on top of React", 
        author: "Lee Robinson", 
        url: "https://example.com/nextjs-react-foundation", 
        likes: 89 
    },
    {
        id: 3,
        title: "Next.js supports both static and dynamic rendering",
        author: "Sarah Drasner",
        url: "https://example.com/nextjs-rendering-modes",
        likes: 215
    }
]

let nextId = 4

export const getBlogs = () => {
    return blogs
}

export const addBlog = (title: string, author: string, url: string, likes: number) => {
    blogs.push({id: nextId++, title, author, url, likes})
}