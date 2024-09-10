package 괄호회전하기;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String s = "[](){}";
        System.out.println(solution(s));
    }

    public static int solution(String s) {
        int cnt = 0;

        for (int i = 0; i < s.length(); i++) {
            Stack<Character> stack = new Stack<>();
            boolean isValid = true;

            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt((i + j) % s.length());
                if (c == '(' || c == '[' || c == '{') {
                    stack.push(c);
                } else {
                    if (stack.isEmpty()) {
                        isValid = false;
                        break;
                    }
                    char top = stack.pop();
                    if ((c == ')' && top != '(') ||
                            (c == ']' && top != '[') ||
                            (c == '}' && top != '{')) {
                        isValid = false;
                        break;
                    }
                }
            }
            if (isValid && stack.isEmpty()) {
                cnt++;
            }
        }
        return cnt;
    }
}