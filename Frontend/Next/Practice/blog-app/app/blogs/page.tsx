import { getBlogs } from "../actions/blogs"

const Blogs =() => {
    const blogs = getBlogs()
    return (
        <div>
            <h2>Notes</h2>
            <ul>
                {blogs.map(blog => (
                    <li key={blog.id} style={{ marginBottom: '1.5rem' }}>
                        <h3>{blog.title}</h3>
                        <p>
                            <strong>Author:</strong> {blog.author}
                        </p>
                        <p>
                            <strong>Link:</strong> <a href={blog.url} target="_blank" rel="noopener noreferrer">{blog.url}</a>
                        </p>
                        <p>
                            <strong>Likes:</strong> {blog.likes}
                        </p>
                    </li>
                ))}
            </ul>
        </div>
    )
}

export default Blogs