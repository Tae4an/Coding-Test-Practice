package 개인정보수집유효기간;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String today = "2022.05.19";
        String[] terms = {"A 6", "B 12", "C 3"};
        String[] privacies = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};
        System.out.println(Arrays.toString(solution(today, terms, privacies)));

    }

    public static int[] solution(String today, String[] terms, String[] privacies) {
        ArrayList<Integer> results = new ArrayList<>();
        String[][] t = new String[terms.length][2];
        String[] p;

        for (int i = 0; i < terms.length; i++) t[i] = terms[i].split(" ");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
        LocalDate todayDate = LocalDate.parse(today, formatter);

        for (int i = 0; i < privacies.length; i++) {
            p = privacies[i].split(" ");
            for (int j = 0; j < t.length; j++) {
                if (t[j][0].equals(p[1])) {
                    LocalDate date1 = LocalDate.parse(p[0], formatter);
                    LocalDate date2 = date1.plusMonths(Long.parseLong(t[j][1]));

                    if (todayDate.isEqual(date2) || todayDate.isAfter(date2)) {
                        results.add(i + 1);
                    }
                    break;
                }
            }
        }
        return results.stream().mapToInt(Integer::intValue).toArray();
    }
}
