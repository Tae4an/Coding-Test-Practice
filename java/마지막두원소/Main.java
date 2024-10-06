package 마지막두원소;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        // 테스트 케이스 1
        int[] test1 = {2, 1, 6};
        System.out.println("Test 1: " + Arrays.toString(solution(test1)));
        
        // 테스트 케이스 2
        int[] test2 = {5, 2, 1, 7, 5};
        System.out.println("Test 2: " + Arrays.toString(solution(test2)));
        
        // 추가 테스트 케이스
        int[] test3 = {4, 4, 4, 4};
        System.out.println("Test 3: " + Arrays.toString(solution(test3)));
    }
    public static int[] solution(int[] num_list) {
        int length = num_list.length;
        int[] result = Arrays.copyOf(num_list, length + 1);

        if (num_list[length - 1] > num_list[length - 2]) {
            result[length] = num_list[length - 1] - num_list[length - 2];
        } else {
            result[length] = num_list[length - 1] * 2;
        }

        return result;
    }
}