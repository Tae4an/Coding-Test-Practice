package 공원산책;

public class Main {
    public static int[] solution(String[] park, String[] routes) {
        int x = 0, y = 0;
        int h = park.length, w = park[0].length();
        
        // 시작점 찾기
        for(int i = 0; i < h; i++) {
            if(park[i].contains("S")) {
                x = i;
                y = park[i].indexOf("S");
                break;
            }
        }
        
        for(String route : routes) {
            String[] cmd = route.split(" ");
            int n = Integer.parseInt(cmd[1]);
            int dx = 0, dy = 0;
            
            switch(cmd[0]) {
                case "N": dx = -1; break;
                case "S": dx = 1; break;
                case "W": dy = -1; break;
                case "E": dy = 1; break;
            }
            
            int nx = x, ny = y;
            boolean valid = true;
            
            for(int i = 0; i < n; i++) {
                nx += dx;
                ny += dy;
                if(nx < 0 || nx >= h || ny < 0 || ny >= w || park[nx].charAt(ny) == 'X') {
                    valid = false;
                    break;
                }
            }
            
            if(valid) {
                x = nx;
                y = ny;
            }
        }
        
        return new int[]{x, y};
    }

    public static void main(String[] args) {
        String[] park = {"SOO","OOO","OOO"};
        String[] routes = {"E 2","S 2","W 1"};
        int[] result = solution(park, routes);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
        
        park = new String[]{"SOO","OXX","OOO"};
        result = solution(park, routes);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
        
        park = new String[]{"OSO","OOO","OXO","OOO"};
        routes = new String[]{"E 2","S 3","W 1"};
        result = solution(park, routes);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
}