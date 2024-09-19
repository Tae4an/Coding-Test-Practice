package 배열만들기1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Main {
    public static void main(String[] args) {
        int n = 3, k = 7;
        System.out.println(Arrays.toString(solution(n, k)));
    }
    public static int[] solution(int n, int k) {
        List<Integer> result = new ArrayList<>();
        
        for (int i = k; i <= n; i += k) {
            result.add(i);
        }
        
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}