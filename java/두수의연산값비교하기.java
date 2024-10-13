class Solution {
    public int solution(int a, int b) {

        int concatenated = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        
        int multiplied = 2 * a * b;
        
        return Math.max(concatenated, multiplied);
    }
}
