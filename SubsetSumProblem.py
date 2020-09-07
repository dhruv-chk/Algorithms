import numpy as np

arr = [2,3,7,8,10]
sum = 11

# Create bottoms up array
t = np.full((len(arr) + 1, sum + 1), False)

# Base condition initialization
for i in range (0, len(arr) + 1):
    for j in range (0 , sum + 1):
        if i == 0:
            t[i][j] = False
        if j == 0:
            t[i][j] = True

# Choice diagram logic

for i in range(0, len(arr) + 1):
    for j in range(0, sum + 1):
        if arr[i-1] <= j:
            t[i][j] = t[i-1][j - arr[i-1]] or t[i-1][j]
        else:
            t[i][j] = t[i-1][j]

# Print answer
print(t[len(arr)][sum])

