package Inflearn.Pr05.Pr04;

import java.util.Scanner;
import java.util.Stack;

public class Pr05_lr04 {
    private int solution(String str) {
        int answer = 0;

        Stack<Integer> stack =  new Stack<>();

        for(char x : str.toCharArray()){
            if(!Character.isDigit(x)){
                int n1 = stack.pop();
                int n2 = stack.pop();
                int sum = 0;
                if(x == '+'){
                    sum = n1 + n2;
                }else if(x == '*'){
                    sum = n1 * n2;
                }else if(x == '-'){
                    sum = n1 - n2;
                }else if(x == '/'){
                    sum = n1 / n2;
                }
                sum = Math.abs(sum);
                stack.push(sum);
            }else{
                stack.push(stack.push(x-48));
            }
        }

        answer = Math.abs(stack.pop());

        return answer;
    }

    public static void main(String[] args) {
        Pr05_lr04 pr = new Pr05_lr04();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();


        System.out.println(pr.solution(str));
    }
}
