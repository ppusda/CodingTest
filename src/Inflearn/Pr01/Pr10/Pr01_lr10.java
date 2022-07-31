package Inflearn.Pr01.Pr10;

import java.util.Scanner;

public class Pr01_lr10 {
    private int[] solution(String inputText, char text) {
        int[] answer=new int[inputText.length()];
        int p=1000;
        for(int i=0; i<inputText.length(); i++){
            if(inputText.charAt(i)==text){
                p=0;
                answer[i]=p;
            }
            else{
                p++;
                answer[i]=p;
            }
        }
        p=1000;
        for(int i=inputText.length()-1; i>=0; i--){
            if(inputText.charAt(i)==text) p=0;
            else{
                p++;
                answer[i]=Math.min(answer[i], p);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Pr01_lr10 pr = new Pr01_lr10();
        Scanner sc = new Scanner(System.in);

        String inputText = sc.next();
        char text = sc.next().charAt(0);

        for (int x : pr.solution(inputText, text)){
            System.out.print(x + " ");
        }
    }
}
/**
 * 앞에서 한번 검사
 * 뒤에서 한번 검사
 */