package 할인행사;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] want = {"banana", "apple", "rice", "pork", "pot"};
        int[] number = {3, 2, 2, 2, 1};
        String[] discount = {"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"};
        System.out.println(solution(want, number, discount));
    }

    public static int solution(String[] want, int[] number, String[] discount) {
        int result = 0;
        int totalDays = discount.length - 9;

        for (int i = 0; i < totalDays; i++) {
            int[] temp = new int[want.length];
            for (int j = i; j < i + 10; j++) {
                for (int k = 0; k < want.length; k++) {
                    if (want[k].equals(discount[j])) {
                        temp[k]++;
                        break;
                    }
                }
            }
            if (Arrays.equals(temp, number)) {
                result++;
            }
        }
        return result;
    }
}
