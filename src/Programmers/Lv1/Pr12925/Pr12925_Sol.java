package Programmers.Lv1.Pr12925;

public class Pr12925_Sol {
    public int getStrToInt(String str) {
        boolean Sign = true;
        int result = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '-')
                Sign = false;
            else if(ch !='+')
                result = result * 10 + (ch - '0');
        }
        return Sign?1:-1 * result;
    }

}

// 함수만 이용하는게 아니라 너무 간단하다면 위처럼 풀어 작성하는 것도 고려해보자