package 기사단원의무기;

import java.util.Arrays;

public class Lv1_2_0909 {
    public static void main(String[] args) {
        Lv1_2_0909 sol = new Lv1_2_0909();
        int number = 10, limit = 3, power = 2;
        int result = sol.solution(number, limit, power);
        System.out.println(result);
    }
    public int solution(int number, int limit, int power) {
        int sum = 0;

        for (int i = 1; i <= number; i++) {
            int divisors = countDivisors(i);

            if (divisors > limit) {
                sum += power;
            } else {
                sum += divisors;
            }
        }

        return sum;
    }
    /**
     * 이 메소드는 효율적인 알고리즘을 사용하여 O(√n) 시간 복잡도로 약수의 개수를 구함.
     *
     * @param num 약수의 개수를 구할 양의 정수
     * @return num의 약수 개수
     */
    private int countDivisors(int num) {
        int count = 0;

        // num의 제곱근까지만 반복
        for (int i = 1; i * i <= num; i++) {
            // i가 num의 약수인 경우
            if (num % i == 0) {
                if (i * i == num) {
                    // i가 num의 제곱근인 경우 (예: 16의 4)
                    // 이 경우 하나의 약수만 카운트
                    count++;
                } else {
                    // i가 num의 제곱근이 아닌 경우
                    // i와 num/i 모두 약수이므로 2개 카운트
                    // 예: 16의 경우, i가 2일 때 2와 8 모두 카운트
                    count += 2;
                }
            }
        }

        return count;
    }
}
