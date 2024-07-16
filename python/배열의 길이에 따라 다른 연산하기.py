def solution(arr, n):
    # 배열의 길이가 홀수인지 짝수인지 확인
    is_odd_length = len(arr) % 2 == 1
    
    # 배열을 순회하며 조건에 맞는 인덱스에 n을 더하기
    for i in range(len(arr)):
        if is_odd_length and i % 2 == 0:  # 배열 길이가 홀수이면 짝수 인덱스에 n을 더함
            arr[i] += n
        elif not is_odd_length and i % 2 == 1:  # 배열 길이가 짝수이면 홀수 인덱스에 n을 더함
            arr[i] += n
    
    return arr

print(solution([49, 12, 100, 276, 33], 27))  
print(solution([444, 555, 666, 777], 100)) 
