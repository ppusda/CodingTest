package BaekJoon.Bronze.Pr9093;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Pr9093_Sol {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());  //n 입력받기
        StringBuilder answer = new StringBuilder();  //최종 출력할 StringBuilder
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens()) {
                StringBuilder sb = new StringBuilder(st.nextToken());
                answer.append(sb.reverse() + " ");  //각 단어를 뒤집고 answer에 붙이기
            }
            answer.append("\n");
        }
        System.out.print(answer);
    }
}
