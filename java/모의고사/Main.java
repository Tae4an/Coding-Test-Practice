package 모의고사;

import java.util.ArrayList;
import java.util.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] answers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(solution(answers)));
    }

    public static int[] solution(int[] answers) {
        int[][] giveUp = {
                {1, 2, 3, 4, 5},
                {2, 1, 2, 3, 2, 4, 2, 5},
                {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };
        int[] collect = new int[3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < answers.length; j++) {
                if (answers[j] == giveUp[i][j % giveUp[i].length]) {
                    collect[i]++;
                }
            }
        }
        int count = 0;
        int maxCollect = Arrays.stream(collect).max().getAsInt();

        for (int i = 0; i < 3; i++) {
            if (collect[i] == maxCollect) {
                count++;
            }
        }

        int[] result = new int[count];
        int index = 0;
        for (int i = 0; i < 3; i++) {
            if (collect[i] == maxCollect) {
                result[index++] = i + 1;
            }
        }
        return result;
    }
}
