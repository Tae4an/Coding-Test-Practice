def solution(str1, str2):
    if str1 in str2:
        return 1
    else:
        return 0

str1 = "abc"
str2 = "aabcc"
print(solution(str1,str2))