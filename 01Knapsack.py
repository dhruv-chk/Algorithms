
def knapsack(wt, val, W, n):
    if n==0 or W==0:
        return 0
    
    if wt[n-1] <= W:
        return max((val[n-1] + knapsack(wt, val, W-wt[n-1], n-1)), knapsack(wt, val, W, n-1))
    elif wt[n-1] > W:
        return knapsack(wt, val, W, n-1)

if __name__ == "__main__":
    wt = [1 , 3, 4, 5]  #weight of items
    val = [1, 4, 5, 7]  #values of items
    W = 7               #Capacity of bag

    profit = knapsack(wt, val, W, len(wt)) #maximum profit
    print(profit)