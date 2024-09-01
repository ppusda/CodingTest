package BaekJoon.Gold.Pr1759;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Pr1759_Fail {

    private static int L, C, MAX_VOWELS;
    private static ArrayList<String> vowels, consonants; // 모음, 자음
    private static boolean[] checkVowels, checkConsonants;
    private static PriorityQueue<String> pq;
    private static PriorityQueue<String> answer = new PriorityQueue<>();


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        L = Integer.parseInt(st.nextToken()); // 출력 최대 길이
        C = Integer.parseInt(st.nextToken()); // 주어지는 문자의 개수

        vowels = new ArrayList<>();
        consonants = new ArrayList<>();

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < C; i++) {
            String str = st.nextToken();
            if (str.equals("a") || str.equals("e") || str.equals("i") ||
                    str.equals("o") || str.equals("u")) {
                vowels.add(str);
            } else {
                consonants.add(str);
            }
        }

        MAX_VOWELS = L-2;
        checkVowels = new boolean[vowels.size()];
        checkConsonants = new boolean[consonants.size()];
        for (int i = 1; i < MAX_VOWELS; i++) {
            if (vowels.size() < i) {
                break;
            }
            DFS(0, 0, i);
        }

        while(!answer.isEmpty()) {
            System.out.println(answer.poll());
        }
    }

    private static void DFS(int depth, int index, int end) {
        if (depth == end) {
            pq = new PriorityQueue<>();
            permutation(0, 0, L-end);

            StringBuilder sb = new StringBuilder();
            while (!pq.isEmpty()) {
                sb.append(pq.poll());
            }

            for (int i = 0; i < vowels.size(); i++) {
                if (checkVowels[i]) {
                    pq.add(vowels.get(i));
                }
            }

            answer.add(sb.toString());
            return;
        }

        for (int i = index; i < vowels.size(); i++) {
            checkVowels[i] = true;
            DFS(depth+1, i+1, end);
            checkVowels[i] = false;
        }
    }

    private static void permutation(int depth, int index, int end) {
        if (depth == end) {
            for (int i = 0; i < consonants.size(); i++) {
                if (checkConsonants[i]) {
                    pq.add(consonants.get(i));
                }
            }
            return;
        }

        for (int i = index; i < consonants.size(); i++) {
            if (!checkConsonants[i]) {
                checkConsonants[i] = true;
                permutation(depth+1, i+1, end);
                checkConsonants[i] = false;
            }
        }
    }
}
