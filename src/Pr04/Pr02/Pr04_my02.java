package Pr04.Pr02;

import java.util.*;

public class Pr04_my02 {
    private String solution(String str1, String str2) {
        String answer = "";
        int max = 0;

        Map<Character, Integer> mapA = new HashMap<>();
        for(char x : str1.toCharArray()){
            mapA.put(x, mapA.getOrDefault(x, 0) + 1);

        }
        Map<Character, Integer> mapB = new HashMap<>();
        for(char x : str2.toCharArray()){
            mapB.put(x, mapB.getOrDefault(x, 0) + 1);
        }

        for (char value : mapA.keySet()) {
            if(mapA.get(value) == mapB.get(value)){
                answer = "YES";
            }else{
                answer = "NO";
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Pr04_my02 pr = new Pr04_my02();
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();

        System.out.println(pr.solution(str1, str2));
    }

}