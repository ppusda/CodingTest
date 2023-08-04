package Programmers.Lv2.Pr12946;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pr12946 {
    public static List<int[]> arr = new ArrayList<>();

    public static int[][] solution(int n) {
        move(n, 1, 2, 3);
        int[][] answer = arr.stream().toArray(int[][]:: new);

        return answer;
    }

    public static void move(int cnt, int start, int mid, int end) {
        if (cnt == 0) { // 재귀가 끝나는 지점 (블록 0번은 없음)
            return;
        }
        move(cnt-1, start, end, mid);
        arr.add(new int[]{start, end}); // 3번 지점에 블록 적재
        move(cnt-1, mid, start, end);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(solution(3)));
    }
}

/**
 *  하노이의 탑은 대표적인 재귀 문제이다.
 *  이를 해결하기 위해서는 아래와 같은 과정을 이해하는 것이 필요하다.
 *
 *  1. (3, 1, 2, 3) / start = 1, end = 3 / {1, 3} / 등록 4
 *    1-1. (2, 1, 3, 2) / start = 1, end = 2 / {1, 2} / 등록 2
 *      1-1-1. (1, 1, 2, 3) / start = 1, end = 3 / {1, 3} / 등록 1
 *        1-1-1-1. cnt == 0 이므로 return;
 *      1-1-2. (1, 3, 1, 2) / start = 3, end = 2 / {3, 2}  / 등록 3
 *        1-1-2-1. cnt == 0 이므로 return;
 *    1-2. (2, 2, 1, 3) / {2, 3} / 등록 6
 *      1-2-1. (1, 2, 3, 1) / {2, 1} / 등록 5
 *        1-2-1-1. cnt == 0 이므로 return
 *      1-2-2. (1, 1, 2, 3) / {1, 3} / 등록 7
 *        1-2-2-1. cnt == 0 이므로 return
 *
 *  [[1, 3], [1, 2], [3, 2], [1, 3], [2, 1], [2, 3], [1, 3]]
 *
 *  1, 2, 3 의 타워 있다고 가정할 때,
 *  블록 n개, 1 (출발점) => 3 (도착지) 는  블록 n-1개, 1 (출발점) => 2 (경유점) + 블록 n-1개, 2 (경유점) => 3 (도착점) 의 규칙을 가진다.
 *
 *  이렇게 되는 이유는 예를들어 블록이 3개일 때,
 *  위의 2개는 무조건 B에 경유해야하는 상황이 생기기 때문이다.
 *
 *  그러므로 아래 조건식을 잘 기억해두어야겠다.
 *  move(n, start, mid, end) {
 *      if(n == 0){
 *          return;
 *      }
 *      move(n-1, start, end, mid);
 *      hanoi(n, start, end);      // 위에서는 출력을 위해 arr에 저장하는 방식을 이용한 것 뿐이다. 헷갈리지 말자.
 *      move(n-1, mid, start, end);
 *  }
 */

// https://hojunking.tistory.com/123
// https://shoark7.github.io/programming/algorithm/tower-of-hanoi

