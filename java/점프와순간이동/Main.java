package 점프와순간이동;

public class Main {
    public static void main(String[] args) {
        System.out.println(solution(6));
    }
    public static int solution(int n) {
        int battery = 0, temp;
        while(n > 0) temp = n%2==0 ? n/=2 : n-- | battery++;
        return battery;
    }
}
