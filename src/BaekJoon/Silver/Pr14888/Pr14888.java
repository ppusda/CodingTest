package BaekJoon.Silver.Pr14888;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Pr14888 {

    public static int[] arr;
    public static int[] arrOperation;
    public static int length;
    public static int max = Integer.MIN_VALUE;
    public static int min = Integer.MAX_VALUE;

    public static void dfs(int num, int idx) {
        if(idx == length) { // 재귀탐색을 진행할 때 idx(깊이)가 length와 같아진다면,
            max = Math.max(num, max); // 최대 값
            min = Math.min(num, min); // 최소 값
            return; // 을 구하고 return을 통해 돌아가도록 한다.
        }

        for(int i = 0; i < 4; i++) {
            if (arrOperation[i] > 0) {

                arrOperation[i]--;

                switch (i) {
                    case 0:
                        dfs(num + arr[idx], idx + 1); // 0 이면 +, 누적 값 + 현재 값을 해주고 idx + 1 을 통해 인덱스를 증가시켜준다.
                        break;
                    case 1:
                        dfs(num - arr[idx], idx + 1); // 0 이면 -, 누적 값 - 현재 값을 해주고 idx + 1 을 통해 인덱스를 증가시켜준다.
                        break;
                    case 2:
                        dfs(num * arr[idx], idx + 1); // 0 이면 *, 누적 값 * 현재 값을 해주고 idx + 1 을 통해 인덱스를 증가시켜준다.
                        break;
                    case 3:
                        dfs(num / arr[idx], idx + 1); // 0 이면 /, 누적 값 / 현재 값을 해주고 idx + 1 을 통해 인덱스를 증가시켜준다.
                        break;
                }

                arrOperation[i]++; // dfs가 끝나고 나오면 해당 Operation 사용이 끝난 것이므로 다시 증가시켜줘야 한다.
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        length = Integer.parseInt(br.readLine());
        arr = new int[length];

        StringTokenizer st_arr = new StringTokenizer(br.readLine());
        for(int i = 0; i < length; i++){
            arr[i] = Integer.parseInt(st_arr.nextToken());
        }

        arrOperation = new int[4];
        StringTokenizer stOperation = new StringTokenizer(br.readLine());
        for(int i = 0; i < 4; i ++){
            arrOperation[i] = Integer.parseInt(stOperation.nextToken());
        }

        dfs(arr[0], 1);
        System.out.println(max);
        System.out.println(min);
    }
}

/**
 *  참고 - https://st-lab.tistory.com/121
 *  DFS 감을 다 잃어서 풀지를 못할 거 같아 참고하면서 공부하는 식으로 진행하였다.
 *  
 *  입력 값
 *  length = 3
 *  arr = 3 4 5
 *  arrOperation = 1 0 1 0
 *  으로 설명 진행
 *  
 *  dfs(arr[0], 1) / (3, 1)
 *   - arrOperation[0] = 1 / +의 값이 1 이므로 감소시켜주고 재귀 탐색을 시작한다.
 *   - dfs(3 + 4, 2)
 *      - arrOperation[2] = 1 / *의 값이 1 이므로 감소시켜주고 재귀 탐색을 시작한다.
 *      - dfs(7 * 5, 3)
 *         - idx == length 조건을 만족하기 때문에 max, min 값을 등록한다.
 *         - max = 35 / min = 35
 *      - dfs(7 * 5, 3)가 끝났으므로 operation[2] 의 값을 다시 증가 시켜준다.
 *      - arrOperation[3] 까지 확인 결과 0이었므로, 함수 종료
 *   - dfs(3 + 4, 2)가 끝났으므로 operation[2] 의 값을 다시 증가 시켜준다.
 *   - arrOperation[2] = 1 / *의 값이 1 이므로 감소시켜주고 재귀 탐색을 시작한다.
 *   - dfs(3 * 4, 2) 
 *      - arrOperation[0] = 1 / +의 값이 1 이므로 감소시켜주고 재귀 탐색을 시작한다.
 *      - dfs(7 + 5, 3)
 *         - idx == length 조건을 만족하기 때문에 max, min 값을 등록한다.
 *         - max = 35 / min = 17
 *      - dfs(7 + 5, 3)이 끝났으므로 operation[0]의 값을 다시 증가 시켜준다.
 *      - arrOperation[4] 까지의 값이 0이었므로, 함수 종료
 *    - dfs(3 * 4, 2) 가 끝났으므로 operation[2]의 값을 다시 증가 시켜준다.
 *    - arrOperation[4] 까지의 값이 0이었므로, 함수 종료
 *   
 *   max = 35 / min = 17 출력
 *
 *
 */