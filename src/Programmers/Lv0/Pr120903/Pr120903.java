package Programmers.Lv0.Pr120903;

import java.util.Arrays;

public class Pr120903 {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;

        for (String str1 : s1) {
            for (String str2 : s2){
                if (str1.equals(str2)) {
                    answer++;
                    break;
                }
            }
        }

        return answer;
    }
}

/*
     Set<String> set = new HashSet<>(Arrays.asList(s1));
     return (int)Arrays.stream(s2).filter(set::contains).count();
 */