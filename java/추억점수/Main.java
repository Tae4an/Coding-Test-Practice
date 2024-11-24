package 추억점수;

public class Main {
    public static int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        
        for(int i = 0; i < photo.length; i++) {
            for(String person : photo[i]) {
                for(int j = 0; j < name.length; j++) {
                    if(name[j].equals(person)) {
                        answer[i] += yearning[j];
                        break;
                    }
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        // 테스트 케이스 1
        String[] name1 = {"may", "kein", "kain", "radi"};
        int[] yearning1 = {5, 10, 1, 3};
        String[][] photo1 = {
            {"may", "kein", "kain", "radi"},
            {"may", "kein", "brin", "deny"},
            {"kon", "kain", "may", "coni"}
        };
        
        // 테스트 케이스 2
        String[] name2 = {"kali", "mari", "don"};
        int[] yearning2 = {11, 1, 55};
        String[][] photo2 = {
            {"kali", "mari", "don"},
            {"pony", "tom", "teddy"},
            {"con", "mona", "don"}
        };

        // 테스트 결과 출력
        System.out.println("테스트 케이스 1 결과:");
        printArray(solution(name1, yearning1, photo1));  // [19, 15, 6] 예상
        
        System.out.println("\n테스트 케이스 2 결과:");
        printArray(solution(name2, yearning2, photo2));  // [67, 0, 55] 예상
    }
    
    // 배열 출력을 위한 헬퍼 메서드
    public static void printArray(int[] arr) {
        System.out.print("[");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if(i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
}