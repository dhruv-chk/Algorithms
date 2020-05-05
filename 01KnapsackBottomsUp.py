import numpy as np

wt = [1 , 3, 4, 5]  #weight of items
val = [1, 4, 5, 7]  #values of items
W = 7               #Capacity of bag

# Initialize bottoms up matrix
mat = np.full((len(wt)+1, W+1), 0) 

# Choice diagram logic
for i in range(1, len(wt) + 1):
    for j in range(1, W+1):
        if wt[i-1] <= j:
            mat[i][j] = max((val[i-1] + mat[i-1][j-wt[i-1]]), mat[i-1][j])
        else:
            mat[i][j] = mat[i-1][j]

# Final answer
print(mat[len(wt)][W])