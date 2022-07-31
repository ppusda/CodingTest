package Inflearn.Pr01.Pr05;

import java.util.Scanner;

public class Pr01_lr05 {
    private String solution(String inputText) {
        String answer = "";
        char[] s = inputText.toCharArray();
        int lt = 0, rt = inputText.length()-1;

        while(lt<rt){
            if(!Character.isAlphabetic(s[lt])){
                lt ++;
            }else if(!Character.isAlphabetic(s[rt])){
                rt --;
            }else{
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(s);

        return answer;
    }

    public static void main(String[] args) {
        Pr01_lr05 pr = new Pr01_lr05();
        Scanner sc = new Scanner(System.in);

        String inputText = sc.next();

        System.out.println(pr.solution(inputText));
    }

    /**
     * Character.isAlphabetic() 을 이용해 알파벳 찾을 수 있음
     * char 형식으로 넘길 수 있어서 코드양이 줄어들었다.
     *
     * 앞으로는 형식도 좀 더 생각해보자.
     */
}
