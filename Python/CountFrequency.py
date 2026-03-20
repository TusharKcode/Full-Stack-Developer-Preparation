class Frequency:
    def __init__(self, sentence):
        self.sentence = sentence
        print("User Input is sentence: " + sentence)
        self.counter()
        
    def counter(self):
        frequency = {}
        for char in self.sentence:
            frequency[char] = frequency.get(char, 0) + 1

        print("\n Character frequency: ")

        for char, count in sorted(frequency.items()):
            print(f" '{char}' : {count}")

if __name__ == "__main__":
    userInput = input("Enter sentence: ")
    Frequency(userInput)
