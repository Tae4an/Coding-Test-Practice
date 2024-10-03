package 글자이어붙여문자열만들기;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        String my_string = "cvsgiorszzzmrpaqpe";
        int[] index_list = {16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7};
        System.out.println(solution(my_string,index_list));
    }
    public static String solution(String my_string, int[] index_list) {
        // 결과를 저장할 StringBuilder 객체 생성
        StringBuilder result = new StringBuilder();

        // index_list의 각 인덱스에 대해 반복
        for (int index : index_list) {
            // my_string에서 해당 인덱스의 문자를 가져와 result에 추가
            result.append(my_string.charAt(index));
        }

        // 최종 결과를 문자열로 변환하여 반환
        return result.toString();

        // 좀 더 효율적인 방법
//        return IntStream.of(index_list)
//                // index_list 배열을 IntStream으로 변환
//                .mapToObj(my_string::charAt)
//                // 각 인덱스에 해당하는 my_string의 문자를 가져옴
//                // my_string::charAt은 index -> my_string.charAt(index)와 동일
//                .map(String::valueOf)
//                // 각 문자(char)를 문자열(String)로 변환
//                // String::valueOf는 ch -> String.valueOf(ch)와 동일
//                .collect(Collectors.joining());
//        // 모든 문자열을 하나의 문자열로 연결
    }
}
