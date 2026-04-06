def square_root_bisection(number, tolerance = 1e-7, maximum = 100):
    if number < 0:
        raise ValueError('Square root of negative number is not defined in real numbers')
    
    if number == 0 or number == 1:
        print(f'The square root of {number} is {number}')
        return number

    low = 0
    high = max(1, number)

    for i in range(maximum):
        mid = (low + high) / 2
        square = mid ** 2

        if abs(high - low) <= tolerance:
            root = mid
            print(f'The square root of {number} is approximately {root}')
            return root
        
        if square < number:
            low = mid
        else: 
            high = mid

    print(f'Failed to converge within {maximum} iterations')
    return None

print("--- Test 7: 0 ---")
square_root_bisection(0)

# Test 9: Should print "The square root of 0.001 is approximately..."
print("\n--- Test 9: 0.001 ---")
square_root_bisection(0.001, 1e-7, 50)

# Test 11: Should print "The square root of 0.25 is approximately..."
print("\n--- Test 11: 0.25 ---")
square_root_bisection(0.25, 1e-7, 50)

# Test 15: Should print "The square root of 81 is approximately..."
print("\n--- Test 15: 81 ---")
square_root_bisection(81, 1e-3, 50)

# Test 17: Should print "The square root of 225 is approximately..."
print("\n--- Test 17: 225 (tol 1e-3) ---")
square_root_bisection(225, 1e-3, 100)

# Test 23: Failure Case
print("\n--- Test 23: 225 with 10 iterations ---")
square_root_bisection(225, 1e-7, 10)