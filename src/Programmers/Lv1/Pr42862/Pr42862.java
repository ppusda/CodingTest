// Programmers: 42862_체육복
package Programmers.Lv1.Pr42862;

public class Pr42862 {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] students = new int[n];
        int answer = 0;

        for (int l : lost) {
            students[l-1] --;
        }

        for (int r : reserve) {
            students[r-1] ++;
        }

        for (int i = 0; i < students.length; i++) {
            if (students[i] == -1) {
                if (i > 0 && students[i-1] == 1) {
                    students[i-1]--;
                    students[i]++;
                    continue;
                }

                if (i+1 < students.length &&students[i+1] == 1) {
                    students[i+1]--;
                    students[i] ++;
                }
            }
        }

        for(int i : students) {
            if(i >= 0) answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(new Pr42862().solution(5, new int[] {3, 5}, new int[] {2, 4}));
    }
}
