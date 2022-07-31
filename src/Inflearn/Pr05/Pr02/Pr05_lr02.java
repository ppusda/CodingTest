package Inflearn.Pr05.Pr02;

import java.util.Scanner;
import java.util.Stack;

public class Pr05_lr02 {
    private String solution(String str) {
        String answer = "";
        Stack<Character> strStack = new Stack<>();

        for(char x : str.toCharArray()){
            if(x == ')'){
                while(strStack.pop() != '(');
            }else{
                strStack.push(x);
            }
        }

        for (char x : strStack) {
            answer += x;
        }

        return answer;
    }

    public static void main(String[] args) {
        Pr05_lr02 pr = new Pr05_lr02();
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        System.out.print(pr.solution(str));

    }
}
/**
 * stack에는 여러 메서드가 있다.
 * peek - 최상단요소 출력
 * size - 길이 출력
 * get - 인덱스로 접근 가능
 */
