# 내 풀이
def solution(num_list, n):
    answer = 0
    
    for i in num_list:
        if i == n:
            answer = 1;
            return answer

    return answer

num_list = [1,2,3,4,5]
n = 6
print(solution(num_list, n))

# 다른 사람 풀이
# 1--------------------------
def solution(num_list, n):
    return int(n in num_list)

# 2--------------------------
def solution(num_list, n):
    if n in num_list: return 1
    return 0