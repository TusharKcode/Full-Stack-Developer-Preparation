from sqlalchemy import ForeignKey, create_engine, String, select
from sqlalchemy.orm import DeclarativeBase, Mapped, Session, mapped_column

engine = create_engine("sqlite:///app.db")

class Base(DeclarativeBase):
    pass

class Student(Base):
    __tablename__ = "students"
    id: Mapped[int] = mapped_column(primary_key=True)
    name: Mapped[str] = mapped_column(String(100))
    email: Mapped[str] = mapped_column(String(150), unique=True)
    age: Mapped[int] 

    def __repr__(self):
        return f"ID: {self.id} | Name: {self.name} | Email: {self.email} | Age: {self.age}"

class Course(Base):
    __tablename__ = "courses"
    id: Mapped[int] = mapped_column(primary_key=True)
    name: Mapped[str] = mapped_column(String(100))

class Enrollment(Base):
    __tablename__ = "enrollments"
    id: Mapped[int] = mapped_column(primary_key=True)
    student_id: Mapped[int] = mapped_column(ForeignKey("students.id"))
    course_id: Mapped[int] = mapped_column(ForeignKey("courses.id"))

Base.metadata.create_all(engine)

def create_student(name, email, age):
    student = Student(
        name=name,
        email=email,
        age=age
    )
    with Session(engine) as session:
        session.add(student)
        session.commit()

def get_students():
    with Session(engine) as session:
        statement = select(Student)
        return session.scalars(statement).all()

def get_student_by_id(student_id):
    with Session(engine) as session:
        return session.get(Student, student_id)

def get_student_courses():
    with Session(engine) as session:
        statement = (
            select(Student.name.label("student_name"), Course.name.label("course_name"))
            .join(Enrollment, Student.id == Enrollment.student_id)
            .join(Course, Course.id == Enrollment.course_id)
        )
        return session.execute(statement).all()

def update_student_age(student_id, new_age):
    with Session(engine) as session:
        student = session.get(Student, student_id)
    
        if student:
            student.age = new_age
            session.commit()

def delete_student(student_id):
    with Session(engine) as session:
        student = session.get(Student, student_id)

        if student:
            session.delete(student)
            session.commit()