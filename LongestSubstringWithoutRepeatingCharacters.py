# Question link - https://leetcode.com/problems/longest-substring-without-repeating-characters/

s = "abcabcbb"

i = 0 
j = 0
res = 0

hash_set = set()

while j<len(s):
    if s[j] not in hash_set:
        hash_set.add(s[j])
        j += 1
        res = max(len(hash_set), res)
    else:
        hash_set.discard(s[i])
        i += 1

print(res)