package Inflearn.Pr01.Pr07;

import java.util.Scanner;

public class Pr01_my07 {
    private String solution(String inputText) {
        String answer = "";

        String tmp = new StringBuilder(inputText).reverse().toString();
        if(tmp.equalsIgnoreCase(inputText)){
            answer = "YES";
        }else{
            answer = "NO";
        }

        return answer;
    }

    public static void main(String[] args) {
        Pr01_my07 pr = new Pr01_my07();
        Scanner sc = new Scanner(System.in);

        String inputText = sc.next();

        System.out.println(pr.solution(inputText));
    }
    /**
     * String tmp = new StringBuilder(inputText).reverse().toString().toUpperCase();
     *         if(tmp.equals(inputText.toUpperCase())){
     *             answer = "YES";
     *         }else{
     *             answer = "NO";
     *         }
     *
     *         return answer;
     *  각 변수에 toUppercase를 해주지 않아도 equalsIngnoreCase() 를 통해서 비교하면 된다.
     */
}
