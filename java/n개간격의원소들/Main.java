package n개간격의원소들;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Main sol = new Main();
        int[] num = {4, 2, 6, 1, 7, 6};
        int n =2;
        int[] result = sol.solution(num,n);
        System.out.println(Arrays.toString(result));
    }
    public int[] solution(int[] num_list, int n) {
        int[] temp = new int[(num_list.length + n - 1) / n];

        int index = 0;
        for (int i = 0; i < num_list.length; i += n) {
            temp[index++] = num_list[i];
        }

        return temp;
    }
}
