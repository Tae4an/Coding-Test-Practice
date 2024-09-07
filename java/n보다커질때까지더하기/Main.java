package n보다커질때까지더하기;

public class Main {
    public static void main(String[] args) {
        Main sol = new Main();
        int [] numbers = {34, 5, 71, 29, 100, 34};
        int n = 123;

        int result = sol.solution(numbers,n);
        System.out.println(result);
    }
    public int solution(int[] numbers, int n) {
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            if(result > n ){
                return result;
            }
            result += numbers[i];
        }
        return result;
    }
}
