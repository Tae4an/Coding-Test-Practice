package 예산;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] d = {1,3,2,5,4};
        int budget = 9;
        System.out.println(solution(d,budget));
    }
    public static int solution(int[] d, int budget) {
        int count = 0, sum = 0;
        Arrays.sort(d);
        for (int i = 0; i < d.length; i++) {
            sum+= d[i];
            if (sum>budget)break;
            count++;
        }
        return count;
    }
}
