package Pr04.Pr01;

import java.util.*;

public class Pr04_my01 {
    private char solution(int num, String str) {
        char answer = 0;
        int max = 0;

        Map<Character, Integer> studentPick = new HashMap<>();
        for(char x : str.toCharArray()){
            if(!studentPick.containsKey(x)){
                studentPick.put(x, 0);
            }else{
                studentPick.put(x, studentPick.get(x) + 1);
            }
        }

        for (char value : studentPick.keySet()) {
            if(studentPick.get(value) > max){
                max = studentPick.get(value);
                answer = value;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Pr04_my01 pr = new Pr04_my01();
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        String str = sc.next();

        System.out.println(pr.solution(num, str));
    }

}