package 명예의전당;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Lv1_2_0906 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Lv1_2_0906 sol = new Lv1_2_0906();
        int[] score = {10, 100, 20, 150, 1, 100, 200};
        int k = 3;
        int[] result = sol.solution(k, score);

        System.out.println(Arrays.toString(result));
    }

    public int[] solution(int k, int[] score) {
        int[] result = new int[score.length];
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int i = 0; i < score.length; i++) {
            queue.offer(score[i]);
            if (queue.size() > k) {
                queue.poll();
            }
            result[i] = queue.peek();
        }

        return result;
    }
}
