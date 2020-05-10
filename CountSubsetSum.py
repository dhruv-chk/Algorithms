import numpy as np

arr = [2,3,5,6,8,10]
sum = 10

# Create bottoms up array
t = np.full((len(arr) + 1, sum + 1), 0)

# Base condition initialization
for i in range (0, len(arr) + 1):
    for j in range (0 , sum + 1):
        if i == 0:
            t[i][j] = 0
        if j == 0:
            t[i][j] = 1
            
# Choice diagram logic

for i in range(0, len(arr) + 1):
    for j in range(0, sum + 1):
        if arr[i-1] <= j:
            t[i][j] = t[i-1][j - arr[i-1]] + t[i-1][j]
        else:
            t[i][j] = t[i-1][j]

# Print answer
print(t[len(arr)][sum])


