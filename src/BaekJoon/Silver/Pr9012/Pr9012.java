package BaekJoon.Silver.Pr9012;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Pr9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int size = Integer.parseInt(br.readLine());

        for(int i = 0; i < size; i++){
            Stack<Character> stack = new Stack<>();
            String input = br.readLine();
            for (char ch: input.toCharArray()) {
                if(stack.isEmpty()){
                    stack.push(ch);
                }else {
                    if (ch == ')' && stack.peek() == '(') {
                        stack.pop();
                    }else{
                        stack.push(ch);
                    }
                }
            }
            if(stack.isEmpty()) {
                sb.append("YES").append("\n");
            }else{
                sb.append("NO").append("\n");
            }
        }

        System.out.print(sb);
    }
}
