package Pr05.Pr07;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Pr05_lr07 {
    private String solution(String chk, String tot) {
        String answer = "YES";
        Queue<Character> chkQueue = new LinkedList<>();

        for (char t : chk.toCharArray()) {
            chkQueue.offer(t);
        }

        for (char c : tot.toCharArray()) {
            if(chkQueue.contains(c)){
                if(c!=chkQueue.poll()){
                    return "NO";
                }
            }
        }
        if(!chkQueue.isEmpty()){
            return "NO";
        }

        return answer;
    }

    public static void main(String[] args) {
        Pr05_lr07 pr = new Pr05_lr07();
        Scanner sc = new Scanner(System.in);

        String chk = sc.nextLine();
        String tot = sc.nextLine();

        System.out.println(pr.solution(chk, tot));
    }
}
