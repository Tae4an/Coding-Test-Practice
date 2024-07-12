public class Main {
    public int solution(String num_str) {
        int sum = 0;
        // 문자열의 각 문자에 대해 반복
        for (int i = 0; i < num_str.length(); i++) {
            // charAt(i)로 얻은 문자를 숫자로 변환하고 sum에 더함
            sum += num_str.charAt(i) - '0';
        }
        return sum;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution("123456789"));  // 출력: 45
        System.out.println(sol.solution("1000000"));    // 출력: 1
    }
}
