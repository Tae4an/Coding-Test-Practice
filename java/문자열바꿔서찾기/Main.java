package 문자열바꿔서찾기;
public class Main {
    public static void main(String[] args) {
        // 테스트 케이스 1
        String myString1 = "ABBAA";
        String pat1 = "AABB";
        System.out.println("Test case 1: " + solution(myString1, pat1));

        // 테스트 케이스 2
        String myString2 = "ABAB";
        String pat2 = "ABAB";
        System.out.println("Test case 2: " + solution(myString2, pat2));
    }
    public static int solution(String myString, String pat) {
        // 1. 문자열의 A와 B를 서로 바꾸기
        StringBuilder swapped = new StringBuilder();

        for (char c : myString.toCharArray()) {
            if (c == 'A') {
                swapped.append('B');
            } else {
                swapped.append('A');
            }
        }
        // 2. 바뀐 문자열에 pat이 포함되어 있는지 확인
        return swapped.toString().contains(pat) ? 1 : 0;
    }
}