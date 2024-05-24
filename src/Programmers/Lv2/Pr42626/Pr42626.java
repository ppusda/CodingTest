// Programmers: 42626_더 맵게
package Programmers.Lv2.Pr42626;

import java.util.Arrays;

public class Pr42626 {
    public int solution(int[] scoville, int K) {
        int count = 0;
        while (true) {
            Arrays.sort(scoville);
            if (scoville[0] >= K) {
                break;
            }

            scoville[1] = scoville[0] + (scoville[1] * 2);
            scoville[0] = Integer.MAX_VALUE;
            count ++;
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(new Pr42626().solution(new int[] {1, 2, 3, 9, 10, 12}, 7));
    }
}

// 효율성을 통과할 수 없었음.
// 물론 -1, 0 출력에 대한 예외처리도 하지 않은 코드이기에, 해결이 필요했다.