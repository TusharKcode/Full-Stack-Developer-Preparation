# INHERITANCE - Single Inheritance
class Animal:
    def __init__(self, name):
        self.name = name

    def sound(self):
        return f'{self.name} makes a sound.'

class Dog(Animal):
    bark = 'woof! woof!! woof!!!'

    # Override sound() to use bark class variable
    def sound(self):
        return f'{self.name} barks {self.bark}'

jack = Dog('Jack')
print(jack.sound())  # Jack barks woof! woof!! woof!!!

class Animal:
    def __init__(self, name):
        self.name = name

    def sound(self):
        return f'{self.name} makes a sound'

class Dog(Animal):
    bark = 'woof! woof!! woof!!!'

    # Call Animal.sound(), then append bark
    def sound(self):
        base = super().sound()
        return f'{base}, then {self.name} barks {self.bark}'

jack = Dog('Jack')
print(jack.sound())  # Jack makes a sound, then Jack barks woof! woof!! woof!!!


# Multiple Inheritance

class Walker:
    def walk(self):
        return 'I can walk on land'

class Swimmer:
    def swim(self):
        return 'I can swim in water'

# Amphibian inherits from both Walker and Swimmer
class Amphibian(Walker, Swimmer):
    def __init__(self, name):
        self.name = name

    def introduce(self):
        return f"I'm {self.name} the frog. {self.walk()} and {self.swim()}."

frog = Amphibian('Freddy')
print(frog.introduce())
# Output: I'm Freddy the frog. I can walk on land and I can swim in water.


# POLYMORPHISM
class Twitter:
    def __init__(self, content):
        self.content = content

    def post(self):
        return f"🐦 Tweet: '{self.content}' (280 chars max)"

class Instagram:
    def __init__(self, content):
        self.content = content

    def post(self):
        return f"📸 Instagram Post: '{self.content}' + ✨ filters"

class LinkedIn:
    def __init__(self, content):
        self.content = content

    def post(self):
        return f"💼 LinkedIn Article: '{self.content}' (Professional Mode)"

def start(social_media):
    print(social_media.post())  # Calls .post() on any object

# Instances
tweet = Twitter('Just learned Python polymorphism!')
photo = Instagram('Sunset vibes 🌅')
article = LinkedIn('Why OOP matters in 2024')

# The polymorphic calls - same function, different outputs
start(tweet) # 🐦 Tweet: 'Just learned Python polymorphism!' (280 chars max)
start(photo) # 📸 Instagram Post: 'Sunset vibes 🌅' + ✨ filters
start(article) # 💼 LinkedIn Article: 'Why OOP matters in 2024' (Professional Mode)

# Inheritance-based polymorphism
class Animal:
    def speak(self):
        return 'Some generic sound'

class Cat(Animal):
    def speak(self):
        return 'A cat meow'

class Dog(Animal):
    def speak(self):
        return 'A dog barks woof woof'

class Monkey(Animal):
    def speak(self):
        return 'A monkey ooh ooh aah aah ooh ooh aah aah'
    
print(Cat().speak()) # A cat meow
print(Dog().speak()) # A dog barks woof woof
print(Monkey().speak()) # A monkey ooh ooh aah aah ooh ooh aah aah
print(Animal().speak()) # Some generic sound


# ABSTRACTION
from abc import ABC, abstractmethod

class Animal(ABC): # Inherits from abstract base class
    @abstractmethod # Abstract method decorator
    def make_sound(self):  # The method subclasses must override
        pass

# Concrete class that will override the abstract method
class Dog(Animal):
    def make_sound(self):
        print('Woof!')

# Another concrete class that will override the abstract method
class Cat(Animal):
    def make_sound(self):
        print('Meow!')

# Another concrete class that will override the abstract method
class Monkey(Animal):
    def make_sound(self):
        print('Ooh ooh aah aah!')

# Create instances of each concrete class
animals = [Dog(), Cat(), Monkey()]

# Loop through the instances to call the make_sound method
for animal in animals:
    animal.make_sound()

# Output:
# Woof!
# Meow!
# Ooh ooh aah aah!