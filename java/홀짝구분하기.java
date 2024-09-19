import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        String result = (n % 2 == 0) ? n + " is even" : n + " is odd";
        System.out.println(result);
        
        scanner.close();
    }
}
