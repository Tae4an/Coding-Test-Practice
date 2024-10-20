package 문자리스트를문자열로변환하기;

public class Main {
    public static void main(String[] args) {
        String [] arr = {"a","b","c"};
        System.out.println(solution1(arr));
        System.out.println(solution2(arr));
    }

    public static String solution1(String[] arr) {
        return String.join("", arr);
    }

    public static String solution2(String[] arr) {
        StringBuilder result = new StringBuilder();
        for (String s : arr) {
            result.append(s);
        }
        return result.toString();
    }
}
