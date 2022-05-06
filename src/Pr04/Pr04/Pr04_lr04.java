package Pr04.Pr04;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Pr04_lr04 {
    private int solution(String str, String compare) {
        int answer = 0;

        Map<Character, Integer> strMap = new HashMap();
        Map<Character, Integer> compareMap = new HashMap();

        for(char x : compare.toCharArray()){
            compareMap.put(x, compareMap.getOrDefault(x, 0)+1);
        }

        for(int i = 0; i < compare.length() - 1; i++ ){
            strMap.put(str.charAt(i), strMap.getOrDefault(str.charAt(i), 0)+1);
        }

        int tail = 0;
        for(int head = compare.length()-1; head < str.length(); head++){
            strMap.put(str.charAt(head), strMap.getOrDefault(str.charAt(head), 0)+1);

            if(strMap.equals(compareMap)){
                answer++;
            }
            strMap.put(str.charAt(tail), strMap.get(str.charAt(tail))-1);
            if(strMap.get(str.charAt(tail)) == 0){
                strMap.remove(str.charAt(tail));
            }
            tail++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Pr04_lr04 pr = new Pr04_lr04();
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String compare = sc.nextLine();

        System.out.print(pr.solution(str, compare));

    }
}
