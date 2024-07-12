def solution(num_str):
    # 각 자리의 숫자를 순회하며 int로 변환한 후 합을 구함
    return sum(int(char) for char in num_str)

print(solution("123456789"))  # 출력: 45
print(solution("1000000"))    # 출력: 1
