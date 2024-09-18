package 문자열뒤의n글자;

public class Main {
    public static void main(String[] args) {
        String my_string = "ProgrammerS123";
        int n = 11;
        System.out.println(solution(my_string,n));
    }
    public static String solution(String my_string, int n) {
        String answer = my_string.substring(my_string.length() - n, my_string.length());

        return answer;
    }

}
