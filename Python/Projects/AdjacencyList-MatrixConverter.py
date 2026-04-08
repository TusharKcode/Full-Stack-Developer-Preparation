def adjacency_list_to_matrix(adj_list):
    num_nodes = len(adj_list)
    
    matrix = [[0 for _ in range(num_nodes)] for _ in range(num_nodes)]
    

    for node, neighbors in adj_list.items():
        for neighbor in neighbors:
            matrix[node][neighbor] = 1
            
    for row in matrix:
        print(row)
    return matrix

adj_list = {0: [1, 2], 1: [2], 2: [0, 3], 3: [2]}
matrix = adjacency_list_to_matrix(adj_list)
print('')
adj_list = {0: [1], 1: [0]}
matrix = adjacency_list_to_matrix(adj_list)
print('')
adj_list = {0: [], 1: [], 2: []}
matrix = adjacency_list_to_matrix(adj_list)
