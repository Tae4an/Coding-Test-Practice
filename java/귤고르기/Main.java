package 귤고르기;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int k  = 6;
        int[] tangerine = {1, 3, 2, 5, 4, 5, 2, 3};
        System.out.println(solution(k,tangerine));

    }
    public static int solution(int k, int[] tangerine) {
        int result = 0, sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : tangerine) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        List<Integer> count = new ArrayList<>(map.values());
        count.sort(Collections.reverseOrder());

        for (int c : count) {
            sum += c;
            result++;
            if (sum >= k) return result;
        }
        return -1;
    }
}
