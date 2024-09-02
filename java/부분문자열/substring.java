package 부분문자열;

public class substring {
    public static int solution(String str1, String str2) {
        if (str2.contains(str1)) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(solution("abc", "aabcc"));
        System.out.println(solution("tbt", "tbbttb"));
    }
}
