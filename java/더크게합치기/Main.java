package 더크게합치기;

public class Main {
    public static void main(String[] args) {
        int a = 9, b = 91;
        System.out.println(solution(a,b));
    }
    public static int solution(int a, int b) {
        int num1 = Integer.parseInt("" + a + b);
        int num2 = Integer.parseInt("" + b + a);

        int result = num1 > num2 ? num1 : num2;
        return result;
    }
}
