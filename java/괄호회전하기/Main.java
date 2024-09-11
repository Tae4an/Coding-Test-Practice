package 괄호회전하기;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String s = "[](){}";
        System.out.println("Test Case:1 - "+s);
        System.out.println(solution(s));

        s = "}]()[{";
        System.out.println("Test Case:2 - "+s);
        System.out.println(solution(s));

        s = "[)(]";
        System.out.println("Test Case:3 - "+s);
        System.out.println(solution(s));

        s = "}}}";
        System.out.println("Test Case:4 - "+s);
        System.out.println(solution(s));

    }

    public static int solution(String s) {
        int cnt = 0;  // 올바른 괄호 문자열의 개수를 저장할 변수

        // 문자열의 모든 회전 경우를 검사
        for (int i = 0; i < s.length(); i++) {
            Stack<Character> stack = new Stack<>();  // 괄호를 저장할 스택
            boolean isValid = true;  // 현재 회전의 유효성 플래그

            // 현재 회전된 문자열의 각 문자 검사
            for (int j = 0; j < s.length(); j++) {
                // (i + j) % length로 회전된 위치의 문자 가져오기
                char c = s.charAt((i + j) % s.length());

                // 여는 괄호일 경우 스택에 push
                if (c == '(' || c == '[' || c == '{') {
                    stack.push(c);
                } else {
                    // 닫는 괄호인데 스택이 비어있으면 유효하지 않음
                    if (stack.isEmpty()) {
                        isValid = false;
                        break;
                    }

                    // 스택의 top과 현재 닫는 괄호 비교
                    char top = stack.pop();
                    // 괄호 쌍이 맞지 않으면 유효하지 않음
                    if ((c == ')' && top != '(') ||
                            (c == ']' && top != '[') ||
                            (c == '}' && top != '{')) {
                        isValid = false;
                        break;
                    }
                }
            }

            // 현재 회전이 유효하고 모든 괄호의 짝이 맞으면 (스택이 비어있으면) 카운트 증가
            if (isValid && stack.isEmpty()) {
                cnt++;
            }
        }

        // 올바른 괄호 문자열의 총 개수 반환
        return cnt;
    }
}