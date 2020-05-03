import sys

def isCommonPrefix(strs, l):
    str1 = strs[0][:l]
    for i in range(1, len(strs)):
        if strs[i][:l] != str1:
            return False

    return True

if __name__ == "__main__":
    strs = ["flowers", "flow", "flight"]
    prefix = ""

    if strs == None or len(strs) == 0:
        print(prefix)
    
    minlen = sys.maxint

    for s in strs:
        minlen = min(minlen, len(s))
    
    low = 1
    high = minlen

    while low <= high:
        mid = (low+high)//2
        if isCommonPrefix(strs, mid):
            low = mid + 1
        else:
            high = mid-1
    
    print(strs[0][: ((low + high) // 2)])