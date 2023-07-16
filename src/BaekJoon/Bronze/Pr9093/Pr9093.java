package BaekJoon.Bronze.Pr9093;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pr9093 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();
        int size = Integer.parseInt(br.readLine());

        for(int i = 0; i < size; i++){
            String str = br.readLine();
            String[] splitArr = str.split(" ");
            for(String splStr: splitArr) {
                StringBuilder sb = new StringBuilder(splStr);
                answer.append(sb.reverse());
                answer.append(" ");
            }
            answer.append("\n");
        }

        System.out.print(answer);
    }
}

// 출력 값과 완전히 동일하게 하려니 오답으로 되었다...
// 맨 끝 띄어쓰기 제거, 맨 마지막 \n 제거..ㅠ
