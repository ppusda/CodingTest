package BaekJoon.Bronze.Pr5598;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Pr5598_Sol {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Character, Character> map=new HashMap<>();
        for(char c='A';c<='Z';c++) {
            int next=(int)c+3;
            if(next>(int)'Z') {
                next-=(int)'Z';
                next+=(int)'A'-1;
            }
            map.put((char)next,c);
        }
        char[] data=br.readLine().toCharArray();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<data.length;i++) {
            sb.append(map.get(data[i]));
        }
        System.out.println(sb);
    }
}
