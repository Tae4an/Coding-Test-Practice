package 달리기경주;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        String[] p = {"mumu", "soe", "poe", "kai", "mine"}, c = {"kai", "kai", "mine", "mine"};
        System.out.println(Arrays.toString(solution(p, c)));
    }
    public static String[] solution(String[] players, String[] callings) {
        Map<String, Integer> pRank = new HashMap<>();

        for (int i = 0; i < players.length; i++) pRank.put(players[i], i);

        for (String calling : callings) {
            int currRank = pRank.get(calling);
            if (currRank > 0) {
                String frontPlayer = players[currRank - 1];
                players[currRank - 1] = calling;
                players[currRank] = frontPlayer;

                pRank.put(calling, currRank - 1);
                pRank.put(frontPlayer, currRank);
            }
        }
        return players;
    }

}
