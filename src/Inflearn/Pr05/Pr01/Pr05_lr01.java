package Inflearn.Pr05.Pr01;

import java.util.Scanner;
import java.util.Stack;

public class Pr05_lr01 {
    private String solution(String str) {
        String answer = "YES";
        Stack<Character> stack = new Stack<>();

        for(char x : str.toCharArray()){
            if(x == '('){
                stack.push(x);
            }else{
                if(stack.empty()){
                    answer = "NO";
                    return answer;
                }
                stack.pop();
            }
        }
        if(!stack.isEmpty()){
            answer = "NO";
        }

        return answer;
    }

    public static void main(String[] args) {
        Pr05_lr01 pr = new Pr05_lr01();
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        System.out.print(pr.solution(str));

    }
}

/**
 * Java에 Stack이 있는지 몰랐다..
 * push는 값을 밀어넣는 것
 * pop은 하나씩 없애는 것
 *
 * LIFO 구조이기 때문에 최상단에 쌓이고 없앤다.
 */
