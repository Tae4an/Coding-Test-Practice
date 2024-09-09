package 올바른괄호;


import java.util.Stack;

public class Lv2_1_0909 {
    public static void main(String[] args) {
        Lv2_1_0909 sol = new Lv2_1_0909();
        String s = "(())";
        boolean result = sol.solution(s);
        System.out.println(result);
    }
    public boolean solution(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
