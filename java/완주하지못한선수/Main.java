package 완주하지못한선수;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        String[] participant1 = {"leo", "kiki", "eden"};
//        String[] completion1 = {"eden", "kiki"};
//        System.out.println(solution(participant1, completion1));
//
//        String[] participant2 = {"marina", "josipa", "nikola", "vinko", "filipa"};
//        String[] completion2 = {"josipa", "filipa", "marina", "nikola"};
//        System.out.println(solution(participant2, completion2));

        String[] participant3 = {"mislav", "stanko", "mislav", "ana"};
        String[] completion3 = {"stanko", "ana", "mislav"};
        System.out.println(solution(participant3, completion3));
    }

    public static String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);

        for (int i = 0; i < completion.length; i++) {
            if (!participant[i].equals(completion[i])) {
                return participant[i];
            }
        }
        return participant[participant.length - 1];
    }
}