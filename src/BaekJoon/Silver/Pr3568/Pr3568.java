package BaekJoon.Silver.Pr3568;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pr3568 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");
        String base = str[0];


        StringBuilder answer = new StringBuilder();
        for (int i = 1; i < str.length; i++) {
            answer.append(base);

            if (i == str.length-1) {
                str[i] = str[i].replace(";", "");
            } else {
                str[i] = str[i].replace(",", "");
            }

            StringBuilder variable = new StringBuilder(); // 변수명
            StringBuilder type = new StringBuilder(); // 타입
            for (int j = 0; j < str[i].length(); j++) {
                char temp = str[i].charAt(j);
                if (Character.isAlphabetic(temp)) {
                    variable.append(temp);
                    continue;
                }

                type.append(temp);
            }

            answer.append(type.reverse().toString().replace("][", "[]")) // 뒤집어진 부분 수정
                    .append(" ")
                    .append(variable)
                    .append(";")
                    .append("\n");
        }

        System.out.println(answer);
    }
}
