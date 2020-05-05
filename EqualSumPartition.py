import numpy as np

arr = [1,5,11,5]    # Given Input array
W = sum(arr)/2      # W for knapsack

# Problem became similar to subsequent sum problem. Therefore, the rest of the approach will be similar.

if sum(arr)%2 != 0:
    print(False)
else:
    # Create bottoms up array
    t = np.full((len(arr) + 1, W + 1), False)

    # Base condition initialization
    for i in range (0, len(arr) + 1):
        for j in range (0 , W + 1):
            if i == 0:
                t[i][j] = False
            if j == 0:
                t[i][j] = True

    # Choice diagram logic

    for i in range(0, len(arr) + 1):
        for j in range(0, W + 1):
            if arr[i-1] <= j:
                t[i][j] = t[i-1][j - arr[i-1]] or t[i-1][j]
            else:
                t[i][j] = t[i-1][j]

    # Print answer
    print(t[len(arr)][W])
