import numpy as np

mat=[] #Memoization

def knapsack(wt, val, W, n):
    if n==0 or W==0:
        return 0
    
    if mat[n][W] != -1:
        return mat[n][W]
    else:
        if wt[n-1] <= W:
            mat[n][W] = max((val[n-1] + knapsack(wt, val, W-wt[n-1], n-1)), knapsack(wt, val, W, n-1))
            return mat[n][W]
        elif wt[n-1] > W:
            mat[n][W] = knapsack(wt, val, W, n-1)
            return mat[n][W]

if __name__ == "__main__":
    wt = [1 , 3, 4, 5]  #weight of items
    val = [1, 4, 5, 7]  #values of items
    W = 7               #Capacity of bag
    
    mat = np.full((len(wt)+1, W+1), -1) #initialize matrix with -1 which indicates no values.
    
    profit = knapsack(wt, val, W, len(wt)) #maximum profit
    print(profit)