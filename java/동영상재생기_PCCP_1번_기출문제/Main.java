package 동영상재생기_PCCP_1번_기출문제;

public class Main {
    public static void main(String[] args) {
//        String v = "34:33", p = "13:00", op_s = "00:55", op_e = "02:55";
//        String [] c = {"next", "prev"};
//        System.out.println(solution(v,p,op_s,op_e,c));

//        String v = "10:55", p = "00:05", op_s = "00:15", op_e = "06:55";
//        String [] c = {"prev","next", "next"};
//        System.out.println(solution(v,p,op_s,op_e,c));

        String v = "07:22", p = "04:05", op_s = "00:15", op_e = "04:07";
        String[] c = {"next"};
        System.out.println(solution(v, p, op_s, op_e, c));
    }

    public static String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int convertV_len = timeConvert(video_len);
        int convertPos = timeConvert(pos);
        int convertOpStart = timeConvert(op_start);
        int convertOpEnd = timeConvert(op_end);

        for (int i = 0; i < commands.length; i++) {
            if (commands[i].equals("next")) {
                if (convertOpStart <= convertPos && convertPos <= convertOpEnd) {
                    convertPos = convertOpEnd;
                }
                if (convertPos + 10 > convertV_len) {
                    convertPos = convertV_len;
                } else {
                    convertPos += 10;
                }
            }
            if (commands[i].equals("prev")) {
                if (convertPos - 10 < 0) {
                    convertPos = 0;
                } else {
                    convertPos -= 10;
                }
            }
            if (convertOpStart <= convertPos && convertPos <= convertOpEnd) {
                convertPos = convertOpEnd;
            }
        }
        return stringConvert(convertPos);
    }

    public static int timeConvert(String time) {
        String[] times = time.split(":");
        return Integer.parseInt(times[0]) * 60 + Integer.parseInt(times[1]);
    }
    public static String stringConvert(int time) {
        int m = time / 60;
        int r_m = time % 60;
        return String.format("%02d:%02d", m, r_m);
    }
}
