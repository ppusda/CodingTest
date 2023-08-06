package Programmers.Lv0.Pr120956;

public class Pr120956 {
    public static String[] strArr = new String[]{"aya", "ye", "woo", "ma"};

    public static int solution(String[] babbling) {
        int answer = 0;

        for(String str: babbling){
            String tmp = str;
            int cnt = 0;
            while(cnt < strArr.length) {
                if(tmp.contains(strArr[cnt])) {
                    tmp = tmp.replace(strArr[cnt], "1");
                }
                cnt++;
                if(tmp.matches("[0-9]+")) {
                    answer ++;
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new String[]{"ayaye", "uuuma", "ye", "yemawoo", "ayaa"}));
    }
}
