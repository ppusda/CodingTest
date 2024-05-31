// Programmers: 42747_H-Index
package Programmers.Lv2.Pr42747;

import java.util.Arrays;

public class Pr42747 {
    public int solution(int[] citations) {
        Arrays.sort(citations);
        int size = citations.length;

        for (int i = 0; i < size; i++) {
            int h = size-i;
            if (citations[i] >= h) {
                return h;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        System.out.println(new Pr42747().solution(new int[] {3, 0, 6, 1, 5}));
    }
}


// 0 1 3 5 6
// 1 2 4 5 8 9 10