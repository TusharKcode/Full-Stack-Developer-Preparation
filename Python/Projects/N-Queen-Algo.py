def dfs_n_queens(n):
    if n < 1:
        return []

    def is_valid(state, col):
        row = len(state)
        for r, c in enumerate(state):
            if c == col or abs(r - row) == abs(c - col):
                return False
        return True

    solutions = []
    stack = [[]]

    while stack:
        current_state = stack.pop()

        if len(current_state) == n:
            solutions.append(current_state)
            continue
            
        for col in range(n - 1, -1, -1):
            if is_valid(current_state, col):
                stack.append(current_state + [col])
                
    return solutions

print(dfs_n_queens(1))
print('')
print(dfs_n_queens(2))
print('')
print(dfs_n_queens(3))
print('')
print(dfs_n_queens(4))
print('')
print(dfs_n_queens(5))