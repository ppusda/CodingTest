package BaekJoon.Silver.Pr2504;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Pr2504 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int tmp = 1;
        int res = 0;
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < input.length(); i++){
            char val = input.charAt(i);
            if(val == '(' || val == '['){
                stack.add(val);
                tmp *= (val=='(')? 2: 3;
            }else {
                if(stack.isEmpty()) {
                    res = 0;
                    break;
                }else {
                    char ch = stack.pop();
                    if(val == ')') {
                        if(ch != '(') {
                            res = 0;
                            break;
                        }else {
                            if(input.charAt(i-1) == '(')
                                res += tmp;
                            tmp /= 2;
                        }
                    }else {
                        if(ch != '[') {
                            res = 0;
                            break;
                        }else {
                            if(input.charAt(i-1) == '[')
                                res += tmp;
                            tmp /= 3;
                        }
                    }
                }
            }
        }

        System.out.println(res);

    }
}

// (()[[]])([])
/**
 *  2 * ( 2 + 3 * 3 ) + 2 * (3)
 *
 * ( tmp = 2, res = 0
 * ( tmp = 4, res = 0
 * ) tmp = 2, res = 4 // 분배법칙으로 인한 2 * 2
 * [ tmp = 6, res = 4
 * [ tmp = 18, res = 4
 * ] tmp = 6, res = 22 // 분배법칙으로 인한 2 * 3 * 3
 * ] tmp = 2, res = 22
 * ) tmp = 1, res = 22
 * ( tmp = 2, res = 22
 * [ tmp = 6, res = 22
 * ] tmp = 2, res = 28 // 분배법칙으로 인한 2 * 3
 * ) tmp = 1, res = 28
 *
 * res = 28
 *
 * 분배법칙을 이용한 문제...
 * ( *= 2, [ *= 3 를 기본으로 계산하여 (), [] 와 같이 닫히는 시점이 분배법칙으로써 나눠지는 시점이다.
 * 그 시점에만 res에 더해주고, 그렇지 않을 때는 다시 나누기를 함으로써 분배법칙이 이루어질 수 있도록 되어있는 코드가 되었다.
 *
 */