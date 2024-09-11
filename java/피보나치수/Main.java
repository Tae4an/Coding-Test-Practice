package 피보나치수;

public class Main {
    public static void main(String[] args) {
        int n =  3;
        System.out.println(solution(n));
    }
    public static int solution(int n) {
        int[] fibonacci = new int[n+1];
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (int i = 2; i <= n; i++) {
            fibonacci[i] = (fibonacci[i-1] + fibonacci[i-2]) % 1234567;
        }
        return fibonacci[n];
    }
}
