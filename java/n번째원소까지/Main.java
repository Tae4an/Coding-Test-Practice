package n번째원소까지;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Main sol = new Main();
        int[] num_list = {2,1,6};
        int n = 1;
        int[] result = sol.solution(num_list,n);
        System.out.println(Arrays.toString(result));
    }
    public int[] solution(int[] num_list, int n) {
        return Arrays.copyOfRange(num_list,0,n);
    }
}
