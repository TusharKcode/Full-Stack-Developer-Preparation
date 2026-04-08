def dfs(matrix, start_node):
    n = len(matrix)

    stack = [start_node]

    visited = []

    while stack:
        current_node = stack.pop()

        if current_node not in visited:
            visited.append(current_node)
        
            for neighbor in range(n -1, -1, -1):
        
                if matrix[current_node][neighbor] == 1 and neighbor not in visited:
                    stack.append(neighbor)

    return visited

print(dfs([[0, 1, 0, 0], [1, 0, 1, 0], [0, 1, 0, 1], [0, 0, 1, 0]], 1))
print('')
print(dfs([[0, 1, 0, 0], [1, 0, 1, 0], [0, 1, 0, 1], [0, 0, 1, 0]], 3))
print('')
print(dfs([[0, 1, 0, 0], [1, 0, 1, 0], [0, 1, 0, 0], [0, 0, 0, 0]], 3))
print('')
print(dfs([[0, 1, 0, 0], [1, 0, 0, 0], [0, 0, 0, 1], [0, 0, 1, 0]], 3))
print('')
print(dfs([[0, 1, 0, 0], [1, 0, 0, 0], [0, 0, 0, 1], [0, 0, 1, 0]], 0))
