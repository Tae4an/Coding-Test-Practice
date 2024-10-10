package 수조작하기1;

class Main {
    public static void main(String[] args) {
        int n = 0;
        String control = "wsdawsdassw";
        System.out.println(solution(n,control));
    }
    public static int solution(int n, String control) {
        for (char c : control.toCharArray()) {
            switch (c) {
                case 'w' -> n += 1;
                case 's' -> n -= 1;
                case 'd' -> n += 10;
                case 'a' -> n -= 10;
            }
        }
        return n;
    }
}