package 배열의원소만큼추가하기;

import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int num : arr) {
            for (int i = 0; i < num; i++) {
                list.add(num);
            }
        }
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}