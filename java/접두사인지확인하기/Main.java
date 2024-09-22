package 접두사인지확인하기;

public class Main {
    public static void main(String[] args) {
        String my_string = "banana", is_prefix = "ban";
        System.out.println(solution(my_string,is_prefix));

    }
    public static int solution(String my_string, String is_prefix) {
        if (is_prefix.length() > my_string.length()) {
            return 0;
        }

        String prefix = my_string.substring(0, is_prefix.length());

        if (prefix.equals(is_prefix)) {
            return 1;
        } else {
            return 0;
        }
    }
}
