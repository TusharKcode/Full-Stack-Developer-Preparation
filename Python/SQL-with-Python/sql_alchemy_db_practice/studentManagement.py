from sqlalchemy.orm import Session
from studentManagementDatabase import (
    Base, Course, Enrollment, Student, 
    create_student, get_students, get_student_by_id, 
    update_student_age, delete_student,
    engine, get_student_courses,
)

Base.metadata.drop_all(engine)
Base.metadata.create_all(engine)

create_student("Alice Smith", "alice@example.com", 20)
create_student("Bob Jones", "bob@example.com", 22)
create_student("Charlie Brown", "charlie@example.com", 21)
create_student("Diana Prince", "diana@example.com", 23)
create_student("Ethan Hunt", "ethan@example.com", 24)

all_students = get_students()
print("All Students:\n", all_students)

student = get_student_by_id(3)
print("Find student by ID (3)\n")
if student:
    print(f"ID: {student.id} | Name: {student.name} | Email: {student.email} | Age: {student.age}")

update_student_age(2, 25)
print("\n--- Updated Age for Student ID 2 ---")
updated_student = get_student_by_id(2)
if updated_student:
    print(f"ID: {updated_student.id} | Name: {updated_student.name} | Age: {updated_student.age}")

delete_student(4)
print("\nDelete student with ID 4\n")

final_students = get_students()
print("List of Final Students:\n", final_students)

# -----------------------------------------------------

print("\n" + "=" * 40)
print("--- JOIN PRACTICE: ENROLLMENTS ---")
print("=" * 40)

with Session(engine) as session:
    ash = Student(name="Ash", email="ash@example.com", age=22)
    john = Student(name="John", email="john@example.com", age=24)
    session.add_all([ash, john])
    session.commit()

    python_course = Course(name="Python")
    db_course = Course(name="Database")
    java_course = Course(name="Java")
    session.add_all([python_course, db_course, java_course])
    session.commit()

    session.add_all([
        Enrollment(student_id=ash.id, course_id=python_course.id),
        Enrollment(student_id=ash.id, course_id=db_course.id),
        Enrollment(student_id=john.id, course_id=java_course.id)
    ])
    session.commit()

enrollment_results = get_student_courses()

print(f"\n{'Student Name':<12} | {'Course Name'}")
print("-" * 28)
for row in enrollment_results:
    print(f"{row.student_name:<12} | {row.course_name}")