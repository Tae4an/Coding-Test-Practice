package 짝지어제거하기;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String s = "baabaa";
        System.out.println(solution(s));
    }

    public static int solution(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            Character c1 = !stack.isEmpty() && stack.peek() == c ? stack.pop() : stack.push(c);
        }
        return !stack.isEmpty() ? 0 : 1;
    }
}
