package 핸드폰번호가리기;

public class Main {
    public static void main(String[] args) {
        String phone_number = "01033334444";
        System.out.println(solution(phone_number));
    }
    public static String solution(String phone_number) {
        String s = phone_number.substring(phone_number.length() - 4);
        String temp = "*".repeat(phone_number.length() - 4);
        return temp + s;
    }
}
