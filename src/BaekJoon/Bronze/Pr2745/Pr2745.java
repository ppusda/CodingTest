package BaekJoon.Bronze.Pr2745;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Pr2745 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        String n = st.nextToken();
        int b = Integer.parseInt(st.nextToken());

        int tmp = 1;
        int sum = 0;

        for(int i = n.length()-1 ; i >= 0; i--){
            char C = n.charAt(i);

            if ('A' <= C && C <= 'Z') {
                sum += (C - 'A' + 10) * tmp; // A~Z 사이일 경우
            } else {
                sum += (C - '0') * tmp; // 숫자일 경우
            }
            tmp *= b; // 자리 수 이동
        }


        System.out.println(sum);
    }
}
