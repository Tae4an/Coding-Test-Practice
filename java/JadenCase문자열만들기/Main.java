package JadenCase문자열만들기;

public class Main {
    public static void main(String[] args) {
        String s = "3people unFollowed me";
        System.out.println(solution(s));
    }
    public static String solution(String s) {
        StringBuilder answer = new StringBuilder();
        boolean isNewWord = true;

        for (char c : s.toCharArray()) {
            if (c == ' ') {
                answer.append(c);
                isNewWord = true;
            } else if (isNewWord) {
                answer.append(Character.toUpperCase(c));
                isNewWord = false;
            } else {
                answer.append(Character.toLowerCase(c));
            }
        }

        return answer.toString();
    }
}
