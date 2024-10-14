package 햄버거만들기;

public class Main {
    public static void main(String[] args) {
        int[] ingredient = {2, 1, 1, 2, 3, 1, 2, 3, 1};
        System.out.println(solution(ingredient));
    }
    public static int solution(int[] ingredient) {
        StringBuilder sb = new StringBuilder();
        int count = 0;

        for (int i : ingredient) {
            sb.append(i);
            if (sb.length() > 3 && sb.substring(sb.length() - 4).equals("1231")) {
                count++;
                sb.setLength(sb.length() - 4);
            }
        }
        return count;
    }
}
