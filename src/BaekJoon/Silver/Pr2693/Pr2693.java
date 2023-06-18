package BaekJoon.Silver.Pr2693;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Pr2693 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine());
        ArrayList<int[]> tcList = new ArrayList<>();

        for(int i = 0; i < tc; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] tmp = new int[10];
            for(int j = 0; j < 10; j++){
                tmp[j] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(tmp);
            tcList.add(tmp);
        }

        for (int[] tmp: tcList) {
            System.out.println(tmp[tmp.length-3]);
        }

    }
}
