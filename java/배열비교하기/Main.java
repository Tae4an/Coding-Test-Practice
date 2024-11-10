package 배열비교하기;

public class Main {
    public static int solution(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length)
            return arr1.length > arr2.length ? 1 : -1;

        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum1 += arr1[i];
            sum2 += arr2[i];
        }
        return sum1 == sum2 ? 0 : (sum1 > sum2 ? 1 : -1);
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{49, 13}, new int[]{70, 11, 2}));        // -1
        System.out.println(solution(new int[]{100, 17, 84, 1}, new int[]{55, 12, 65, 36}));  // 1
        System.out.println(solution(new int[]{1, 2, 3, 4, 5}, new int[]{3, 3, 3, 3, 3}));    // 0
    }
}