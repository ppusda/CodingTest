package Pr05.Pr07;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Pr05_my07 {
    private String solution(String chk, String tot) {
        String answer = "NO";
        Queue<Character> totQueue = new LinkedList<>();
        for (char t : tot.toCharArray()) {
            totQueue.offer(t);
        }


        int cnt = 0;
        int index = 0;

        while(cnt < tot.length()){
            if(index == chk.length()){
                answer = "YES";
                break;
            }else if(totQueue.isEmpty()){
                break;
            }
            if(totQueue.poll() == chk.charAt(index)){
                index ++;
            }else{
                cnt ++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Pr05_my07 pr = new Pr05_my07();
        Scanner sc = new Scanner(System.in);

        String chk = sc.nextLine();
        String tot = sc.nextLine();

        System.out.println(pr.solution(chk, tot));
    }
}
