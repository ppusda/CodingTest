package Inflearn.Pr05.Pr05;

import java.util.Scanner;
import java.util.Stack;

public class Pr05_my05 {
    private int solution(String str) {
        int answer = 0;

        Stack<Character> stack =  new Stack<>();
        int chk = 0;
        for(char x : str.toCharArray()){
            if(x == '('){
                stack.push(x);
                chk = 0;
            }else{
                stack.pop();
                if(stack.size() == 0 && chk == 0){
                    continue;
                }else{
                    if(chk == 1){
                        answer += chk;
                    }else{
                        answer += stack.size();
                    }
                }
                chk = 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Pr05_my05 pr = new Pr05_my05();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();


        System.out.println(pr.solution(str));
    }
}
