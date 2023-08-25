package Programmers.Lv1.Pr12916;

public class Pr12916 {
    boolean solution(String s) {
        boolean answer = true;
        int check = 0;

        s = s.toLowerCase();
        for(char ch: s.toCharArray()) {
            if(ch == 'p') {
                check ++;
            } else if (ch == 'y') {
                check --;
            }
        }

        if(check != 0) {
            answer = false;
        }

        return answer;
    }
}
