package n의배수;

public class Main {
    public static void main(String[] args) {
        Main sol = new Main();
        int num =  98, n  = 3;
        int result = sol.solution(num,n);
        System.out.println(result);
    }
    public int solution(int num, int n) {
        return num%n ==0 ? 1:0;
    }
}
