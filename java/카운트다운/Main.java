package 카운트다운;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Main sol = new Main();
        int start_num = 10, end_num = 3;
        int[] result = sol.solution(start_num,end_num);
        System.out.println(Arrays.toString(result));
    }
    public int[] solution(int start_num, int end_num) {
        int[] result = new int[start_num - end_num+1];
        int cnt = 0;
        for (int i = start_num; i >= end_num ; i--) {
            result[cnt++] = i;
        }
        return result;
    }
    /*
         다른 사람 풀이
    public int[] solution(int start, int end) {
        return IntStream.rangeClosed(-start, -end).map(i -> -i).toArray();
    }
     */
}
