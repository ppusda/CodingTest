package LeetCode.Medium.Pr2433;

public class Pr2433 {
    public int[] findArray(int[] pref) {
        int size = pref.length;
        int[] answer = new int[size];

        answer[0] = pref[0];
        for (int i = 1; i < size; i++) {
            answer[i] = pref[i] ^ pref[i-1];
        }

        return answer;
    }
}
