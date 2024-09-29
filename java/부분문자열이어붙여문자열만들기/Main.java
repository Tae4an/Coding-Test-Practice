package 부분문자열이어붙여문자열만들기;

public class Main {
    public static void main(String[] args) {
        String[] my_strings = {"progressive", "hamburger", "hammer", "ahocorasick"};
        int[][] parts = {{0, 4}, {1, 2}, {3, 5}, {7, 7}};

        String result = solution(my_strings, parts);
        System.out.println(result);
    }
    public static String solution(String[] my_strings, int[][] parts) {
        StringBuilder result = new StringBuilder();

        // 각 문자열에서 부분 문자열을 추출하여 결과에 이어 붙이기
        for (int i = 0; i < my_strings.length; i++) {
            int start = parts[i][0]; // 부분 문자열의 시작 인덱스
            int end = parts[i][1];   // 부분 문자열의 끝 인덱스

            // 부분 문자열을 추출하여 결과에 추가
            result.append(my_strings[i].substring(start, end + 1));
        }

        // 최종적으로 이어 붙인 문자열을 반환
        return result.toString();
    }
}
