package 다트게임1차;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Main sol = new Main();
        String s = "1D2S#10S";
        int result = sol.solution(s);
        System.out.println(result);
    }
    public static int solution(String dartResult) {
        int cnt = 0;
        int[] temp = new int[3];
        for (int i = 1; i < dartResult.length(); i++) {
            if('S' == dartResult.charAt(i)){
                if (i > 1 && isNum(dartResult.charAt(i-2))){
                    temp[cnt++] = (int) Math.pow(10,1);
                }else
                    temp[cnt++] = (int) Math.pow(Integer.parseInt(String.valueOf(dartResult.charAt(i-1))),1);
            }else if('D' == dartResult.charAt(i)){
                if (i > 1 && isNum(dartResult.charAt(i-2))){
                    temp[cnt++] = (int) Math.pow(10,2);
                }else
                    temp[cnt++] = (int) Math.pow(Integer.parseInt(String.valueOf(dartResult.charAt(i-1))),2);
            }else if('T' == dartResult.charAt(i)){
                if (i > 1 && isNum(dartResult.charAt(i-2))){
                    temp[cnt++] = (int) Math.pow(10,3);
                }else
                    temp[cnt++] = (int) Math.pow(Integer.parseInt(String.valueOf(dartResult.charAt(i-1))),3);
            }
            if ('#' == dartResult.charAt(i)) {
                temp[cnt-1] *= -1;
            }
            if ('*' == dartResult.charAt(i)) {
                if (i < 3){
                    temp[0] *= 2;
                }else {
                    temp[cnt-1] *= 2;
                    temp[cnt-2] *= 2;
                }
            }

        }
        return Arrays.stream(temp).sum();
    }
    public static boolean isNum(char c) {
        return '0' <= c && c <= '9';
    }
}
