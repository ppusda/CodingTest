package Programmers.Lv1.Pr12919;

public class Pr12919 {
    public String solution(String[] seoul) {
        int cnt = 0;
        for(String str: seoul) {
            if(str.contains("Kim")) {
                return "김서방은 " + cnt + "에 있다";
            }
            cnt++;
        }
        return "김서방은 없다";
    }
}
