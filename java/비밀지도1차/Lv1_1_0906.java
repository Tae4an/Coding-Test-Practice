package 비밀지도1차;

import java.util.Arrays;
import java.util.Scanner;

public class Lv1_1_0906 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Lv1_1_0906 sol = new Lv1_1_0906();
        int n2 = 6;
        int[] arr3 = {46, 33, 33, 22, 31, 50};
        int[] arr4 = {27, 56, 19, 14, 14, 10};
        String[] result = sol.solution(n2,arr3,arr4);

        System.out.println(Arrays.toString(result));
    }
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] result = new String[n];

        for (int i = 0; i < n; i++) {
            int temp = arr1[i] | arr2[i];

            String s = Integer.toBinaryString(temp);

            s = String.format("%" + n + "s", s).replace(' ', '0');

            result[i] = s.replace('1', '#').replace('0', ' ');
        }

        return result;
    }
}
