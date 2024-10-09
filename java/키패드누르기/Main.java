package 키패드누르기;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        System.out.println(solution(numbers,"right"));
    }
    public static String solution(int[] numbers, String hand) {
        StringBuilder result = new StringBuilder();
        int left = 10, right = 12;

        for (int n : numbers) {
            if (n == 1 || n == 4 || n == 7) {
                result.append("L");
                left = n;
            } else if (n == 3 || n == 6 || n == 9) {
                result.append("R");
                right = n;
            } else {
                int leftDist = getDistance(left, n);
                int rightDist = getDistance(right, n);

                if (leftDist < rightDist || (leftDist == rightDist && hand.equals("left"))) {
                    result.append("L");
                    left = n;
                } else {
                    result.append("R");
                    right = n;
                }
            }
        }
        return result.toString();
    }


    // 키패드 상의 두 숫자 사이의 거리 계산
    private static int getDistance(int from, int to) {
        int[] fromPos = getPosition(from);
        int[] toPos = getPosition(to);
        return Math.abs(fromPos[0] - toPos[0]) + Math.abs(fromPos[1] - toPos[1]);
    }

    // 키패드 상의 숫자 위치 반환
    private static int[] getPosition(int num) {
        num = (num == 0) ? 11 : num;
        return new int[] {(num - 1) / 3, (num - 1) % 3};
    }
}
