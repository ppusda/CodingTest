package Pr04.Pr01;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Pr04_lr01 {
    private char solution(int num, String str) {
        char answer = 0;
        int max = 0;

        Map<Character, Integer> studentPick = new HashMap<>();
        for(char x : str.toCharArray()){
            studentPick.put(x, studentPick.getOrDefault(x, 0)+1);
        }

        for (char key : studentPick.keySet()) {
            if(studentPick.get(key) > max){
                max = studentPick.get(key);
                answer = key;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Pr04_lr01 pr = new Pr04_lr01();
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        String str = sc.next();

        System.out.println(pr.solution(num, str));
    }


    /**
     * map.getOrDefault()
     * 존재하지 않을 시 default 값을 설정할 수 있다.
     */
}
