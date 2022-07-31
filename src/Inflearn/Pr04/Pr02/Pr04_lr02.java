package Inflearn.Pr04.Pr02;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Pr04_lr02 {
    private String solution(String str1, String str2) {
        String answer = "YES";

        Map<Character, Integer> map = new HashMap<>();
        for(char x : str1.toCharArray()){
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        for(char x : str2.toCharArray()){
            if(!map.containsKey(x) || map.get(x) == 0){
                answer = "NO";
                break;
            }else{
                map.put(x, map.get(x) - 1);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Pr04_lr02 pr = new Pr04_lr02();
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();

        System.out.println(pr.solution(str1, str2));
    }
}

/**
 * 기존 map에서 빼면서 확인하는 방법
 * 나중에 써먹을 수 있을 것 같다.
 */