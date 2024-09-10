package PCCE기출문제8번닉네임규칙;

// 디버깅 문제
public class Lv1_1_0909 {
    public static void main(String[] args) {
        Lv1_1_0909 sol = new Lv1_1_0909();
        String nickname = "GO";
        String result = sol.solution(nickname);
        System.out.println(result);
    }
    public String solution(String nickname) {
        String answer = "";
        for(int i=0; i<nickname.length(); i++){
            if(nickname.charAt(i) == 'l'){
                answer += "I";
            }
            else if(nickname.charAt(i) == 'w'){
                answer += "vv";
            }
            else if(nickname.charAt(i) == 'W'){
                answer += "VV";
            }
            else if(nickname.charAt(i) == 'O'){
                answer += "0";
            }
            else{
                answer += nickname.charAt(i);
            }
        }
        while(answer.length() < 4){ // 이 부분 while 문으로 수정
            answer += "o";
        }
        if(answer.length() > 8){
            answer = answer.substring(0, 8);
        }
        return answer;
    }
}
