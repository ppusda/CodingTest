package BaekJoon.Bronze.Pr2444;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pr2444 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int chk = 0;

        int tmp = 1; // * / 증가해야됨
        int tmp_toggle = 1;

        int val = n-1; // 공백 / 줄어들어야함
        int val_toggle = -1;

        for (int i = 1; i <= n*2; i++){
            if(i >= n && chk == 0){
                tmp_toggle *= -1;
                val_toggle *= -1;
                chk = 1;
            }

            for(int j = val; j > 0; j--){
                sb.append(" ");
            }
            val += val_toggle;
            for(int k = 0; k < 2*tmp-1; k++){
                sb.append("*");
            }
            tmp += tmp_toggle;
            sb.append("\n");
        }

        System.out.print(sb);
    }
}
// 4 3 2 1 2 3 4