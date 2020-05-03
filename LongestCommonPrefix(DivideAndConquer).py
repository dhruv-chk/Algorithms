def commonPrefix(left, right):
    if left == None or right == None:
        return ""
    minlen = min(len(left), len(right))
    for i in range(0, minlen):
        if left[i] != right[i]:
            return left[0,i]

def LongestCommonPrefix(strs, l, r):
    if l == r:
        return strs[l]
    else:
        mid = (l+r)//2
        leftLCP = LongestCommonPrefix(strs, l, mid)
        rightLCP = LongestCommonPrefix(strs, mid + 1, r)
        return commonPrefix(leftLCP, rightLCP)

if __name__ == "__main__":
    strs = ["flowers", "flow", "flight"]
    prefix = ""
    if strs == None or len(strs) == 0:
        print(prefix)
    else:
        prefix = LongestCommonPrefix(strs, 0, len(strs)-1)

    print(prefix)
