package Inflearn.Pr05.Pr04;

import java.util.Scanner;
import java.util.Stack;

public class Pr05_my04 {
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
                stack.push(Integer.parseInt(String.valueOf(x)));
            }
        }

        answer = Math.abs(stack.pop());

        return answer;
    }

    public static void main(String[] args) {
        Pr05_my04 pr = new Pr05_my04();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();


        System.out.println(pr.solution(str));
    }
}
