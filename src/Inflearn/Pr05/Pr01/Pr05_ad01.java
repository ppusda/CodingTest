package Inflearn.Pr05.Pr01;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Pr05_ad01 {
    private String solution(String str) {
        String answer = "NO";
        Map<Character, Integer> strMap = new HashMap<>();

        for(char x : str.toCharArray()){
            if(x == '('){
                strMap.put(x, strMap.getOrDefault(x, 0)+1);
            }else{
                if(strMap.getOrDefault('(', 0) == 0){
                    return answer;
                }
                strMap.put('(', strMap.get('(')-1);
            }
        }

        answer = "YES";

        return answer;
    }

    public static void main(String[] args) {
        Pr05_ad01 pr = new Pr05_ad01();
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        System.out.print(pr.solution(str));

    }
}
