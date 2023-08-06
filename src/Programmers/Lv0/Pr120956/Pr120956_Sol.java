package Programmers.Lv0.Pr120956;

public class Pr120956_Sol {
    public static int solution(String[] babbling) {
        int answer = 0;
        for(int i=0; i<babbling.length; i++){
            if(babbling[i].matches("^(aya(?!aya)|ye(?!ye)|woo(?!woo)|ma(?!ma))+$")){
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new String[]{"ayaye", "uuuma", "ye", "yemawoo", "ayaa"}));
    }
}
