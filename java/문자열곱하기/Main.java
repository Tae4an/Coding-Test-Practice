package 문자열곱하기;

public class Main {
    public static String solution(String my_string, int k) {
        return my_string.repeat(k);
    }

    public static void main(String[] args) {
        // 테스트 케이스
        String[] testStrings = {"string", "love"};
        int[] testK = {3, 10};

        for (int i = 0; i < testStrings.length; i++) {
            String result = solution(testStrings[i], testK[i]);
            System.out.println("Input: my_string = \"" + testStrings[i] + "\", k = " + testK[i]);
            System.out.println("Output: \"" + result + "\"");
            System.out.println();
        }
    }
}