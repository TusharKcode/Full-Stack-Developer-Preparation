class secondLargestNum:
    def largestNum(self, a):
        max1 = -float('inf')
        max2 = -float('inf')
        for num in a:
            if num > max1:
                max2 = max1
                max1 = num
            elif num > max2 and num != max1:
                max2 = num

        if max2 == -float('inf'):
            print("No second largest number found")
        else:
            print(f"Second largest number is: {max2}")

def main():
    numbers = []
    print("Enter numbers or 'e' to exit:")

    while True:
        userInputNum = input(f"# {len(numbers)}: ").strip()

        if userInputNum == "e":
            break

        try:
            num = int(userInputNum)
            numbers.append(num)
        except ValueError:
            print("Invalid value, Enter 'e' to exit")

    fsln = secondLargestNum()
    fsln.largestNum(numbers)

if __name__  == "__main__":
    main()



