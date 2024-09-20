package 예상대진표;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int N = 8, A = 4, B = 7;
        System.out.println(solution(N, A, B));
    }

    public static int solution(int n, int a, int b) {
        int round = 0;
        while (a != b) {
            a = (a + 1) / 2;
            b = (b + 1) / 2;
            round++;
        }
        return round;
    }
}
