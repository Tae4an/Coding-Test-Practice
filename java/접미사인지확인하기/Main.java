package 접미사인지확인하기;

public class Main {
    public static void main(String[] args) {
        String[][] testCases = {
                {"banana", "ana"},
                {"banana", "nan"},
                {"banana", "wxyz"},
                {"banana", "abanana"}
        };

        for (String[] testCase : testCases) {
            String myString = testCase[0];
            String isSuffix = testCase[1];
            int result = solution(myString, isSuffix);
            System.out.println("my_string: \"" + myString + "\", is_suffix: \"" + isSuffix + "\", result: " + result);
        }
    }
    public static int solution(String my_string, String is_suffix) {
        return my_string.endsWith(is_suffix) ? 1 : 0;
    }
}
