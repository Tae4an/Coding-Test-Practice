package 카펫;

import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int brown = 8, yellow = 1;
        System.out.println(Arrays.toString(solution(brown, yellow)));
    }
    public static int[] solution(int brown, int yellow) {
        int totalGrids = brown + yellow;

        for (int h = 3; h <= (int) Math.sqrt(totalGrids); h++) {
            if (totalGrids % h == 0) {
                int w = totalGrids / h;

                if ((w - 2) * (h - 2) == yellow) {
                    return new int[]{w, h};
                }
            }
        }

        return new int[]{-1, -1};
    }
}
