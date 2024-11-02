package 특정한문자를대문자로바꾸기;

public class Main {
    public static void main(String[] args) {
        String my_string = "programmers", alp = "p";
        System.out.println(solution(my_string,alp));
    }
    public static String solution(String my_string, String alp) {
        return my_string.replace(alp, alp.toUpperCase());
    }
}
