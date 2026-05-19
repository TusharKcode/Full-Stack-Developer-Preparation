import { createBlog } from "@/app/services/blogs"

const NewBlog = () => {
    return(
        <div>
            <h2>Create Notes</h2>
            <form action={createBlog}>
                <div>
                    <label>
                        Title
                        <input type="text" name="title" required/>
                    </label>
                </div>

                <div>
                    <label>
                        Author
                        <input type="text" name="author" required/>
                    </label>
                </div>

                <div>
                    <label>
                        Link
                        <input type="url" name="url" required/>
                    </label>
                </div>

                <div>
                    <label>
                        Likes
                        <input type="number" name="likes" min="0" defaultValue="0" required/>
                    </label>
                </div>

                <button type="submit">Create</button>
            </form>
        </div>
    )
}

export default NewBlog