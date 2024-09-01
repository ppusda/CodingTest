package BaekJoon.Gold.Pr1759;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Pr1759_Sol {

    private static int L, C;
    private static char[] letters;
    private static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        L = Integer.parseInt(input[0]);
        C = Integer.parseInt(input[1]);

        letters = new char[C];
        visited = new boolean[C];

        String[] letterInput = br.readLine().split(" ");
        for (int i = 0; i < C; i++) {
            letters[i] = letterInput[i].charAt(0);
        }

        Arrays.sort(letters);  // 알파벳을 사전순으로 정렬

        // 조합 생성
        generatePassword(0, 0);
    }

    private static void generatePassword(int start, int depth) {
        if (depth == L) {
            int vowelCount = 0;
            int consonantCount = 0;
            StringBuilder password = new StringBuilder();

            for (int i = 0; i < C; i++) {
                if (visited[i]) {
                    password.append(letters[i]);
                    if (isVowel(letters[i])) {
                        vowelCount++;
                    } else {
                        consonantCount++;
                    }
                }
            }

            // 최소 한 개의 모음과 최소 두 개의 자음을 포함하는 경우에만 출력
            if (vowelCount >= 1 && consonantCount >= 2) {
                System.out.println(password.toString());
            }

            return;
        }

        for (int i = start; i < C; i++) {
            visited[i] = true;
            generatePassword(i + 1, depth + 1);
            visited[i] = false;
        }
    }

    private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
