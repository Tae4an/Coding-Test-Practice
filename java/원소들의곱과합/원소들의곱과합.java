package 원소들의곱과합;

class Solution {
    public int solution(int[] num_list) {
        int sum = 0;
        int product = 1;
        
        for (int num : num_list) {
            sum += num;
            product *= num;
        }
        
        int squareOfSum = sum * sum;
        
        return (product < squareOfSum) ? 1 : 0;
    }
}
