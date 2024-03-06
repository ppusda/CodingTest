package Programmers.Lv0.Pr120825;

public class Pr120825_Sol {
    public String solution(String my_string, int n) {
        StringBuilder sb = new StringBuilder();
        for(char c : my_string.toCharArray()){
            sb.append((c + "").repeat(n));
        }
        return sb.toString();
    }
}
