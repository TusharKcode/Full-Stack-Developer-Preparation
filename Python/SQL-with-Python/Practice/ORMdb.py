"""SQL Alchemy ORM Database"""

from sqlalchemy import create_engine, String, select
from sqlalchemy.orm import DeclarativeBase, Mapped, Session, mapped_column

engine = create_engine("sqlite:///users.db")

class Base(DeclarativeBase):
    pass

class User(Base):
    __tablename__ = "users"
    id: Mapped[int] = mapped_column(primary_key=True)
    name: Mapped[str] = mapped_column(String(100))
    email: Mapped[str] = mapped_column(String(150), unique=True)
    age: Mapped[int]

Base.metadata.create_all(engine)

def create_user(name, email, age):
    user = User(
        name=name,
        email=email,
        age=age
    )

    with Session(engine) as session:
        session.add(user)
        session.commit()

def get_users():
    with Session(engine) as session:
        statement = select(User)
        return session.scalars(statement).all()

def get_user_by_id(user_id):
    with Session(engine) as session:
        return session.get(User, user_id)