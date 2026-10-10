import database

def main():
    database.create_table()

    print("======== Adding Tasks ========")
    database.create_task("Learn Python", "Study SQL", status="pending", priority="high")
    database.create_task("Practice SQL", "CRUD practice", status="completed", priority="medium")
    database.create_task("Learn FastAPI", "API Development", status="pending", priority="high")

    print("\n======== All Tasks ========")
    database.print_tasks(database.get_tasks())

    print("\n======== Fetching Tasks by ID ========")
    print(database.get_task_by_id(1))

    print("\n======== Update Tasks Status ========")
    database.update_task_status(1, "completed")
    print("Updated Task 1 status to completed")

    print("\n======== Deleting Task ========")
    database.delete_task(2)
    print("Deleted Task 2")

    print("\n======== Final Tasks List ========")
    database.print_tasks(database.get_tasks())

if __name__ == "__main__":
    main()