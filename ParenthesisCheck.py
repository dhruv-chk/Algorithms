def ParenthesisCheck(s):
    p = []
    paren = {"}":"{", "]":"[", ")":"("}
    
    for char in s:
        if char in paren.values():
            p.append(char)
        elif char in paren.keys():
            if len(p) == 0:
                return False
            if  paren.get(char) == p[-1]:
                p.pop(-1)
            else:
                return False
            
    if len(p) == 0:
        return True
    else:
        return False

if __name__ == "__main__":
    strs = ["(])", "()"]

    for s in strs:
        print(ParenthesisCheck(s))