package 정수찾기;

public class find_integer {
    public static void main(String[] args) {
        int[] num_list = {1,2,3,4,5};
        int n = 3;

        System.out.println(solution(num_list,n));

    }
    // 내 풀이
    public static int solution(int[] num_list, int n) {
        int answer = 0;
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] == n){
                answer = 1;
                return answer;
            }
        }
        return answer;
    }

    /** 다른 사람 풀이
     * 1---------------------------------------
     public int solution(int[] numList, int n) {
     return IntStream.of(numList).anyMatch(num -> num == n) ? 1 : 0;
     }
     * ---------------------------------------
     public int solution(int[] num_list, int n) {
     for (int num : num_list)
     if (num == n)
     return 1;
     return 0;
     }
     **/
}
