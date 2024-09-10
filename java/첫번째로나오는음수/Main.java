package 첫번째로나오는음수;


public class Main {
    public static void main(String[] args) {
        Main sol = new Main();
        int[] num_list = {12, 4, 15, 46, 38, -2, 15};
        int result = sol.solution(num_list);
        System.out.println(result);
    }
    public int solution(int[] num_list) {
        for (int i = 0; i < num_list.length; i++) {
            if(num_list[i] < 0) return i;
        }
        return -1;
    }
}
