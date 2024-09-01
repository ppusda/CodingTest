package BaekJoon.Gold.Pr1759;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Pr1759 {

    private static int L, C;

    private static String[] letters;
    private static boolean[] check;

    private static StringBuilder answer = new StringBuilder();


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        L = Integer.parseInt(st.nextToken()); // 출력 최대 길이
        C = Integer.parseInt(st.nextToken()); // 주어지는 문자의 개수

        letters = new String[C];
        check = new boolean[C];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < C; i++) {
            letters[i] = st.nextToken();;
        }

        Arrays.sort(letters); // DFS 내에서 배치 시 사전 순으로 배치 되도록 letters를 정렬

        DFS(0, 0);
        System.out.println(answer);
    }

    private static void DFS(int depth, int index) {
        if (depth == L) {
            int vowelCount = 0;
            int consonantCount = 0;

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < C; i++) {
                if (check[i]) {
                    sb.append(letters[i]);
                    if (isVowel(letters[i])) {
                        vowelCount++;
                    } else {
                        consonantCount++;
                    }
                }
            }

            if (vowelCount >= 1 && consonantCount >= 2) {
                answer.append(sb);
                answer.append("\n");
            }

            return;
        }

        for (int i = index; i < letters.length; i++) {
            check[i] = true;
            DFS(depth+1, i+1);
            check[i] = false;
        }
    }

    private static boolean isVowel(String c) {
        return c.equals("a") || c.equals("e") || c.equals("i") || c.equals("o") || c.equals("u");
    }
}
