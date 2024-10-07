package BaekJoon.Silver.Pr1931;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Pr1931 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int[][] time = new int[N][2]; // [n][0] 회의 시작 시간, [n][1] 회의 끝 시간
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            time[i][0] = Integer.parseInt(st.nextToken());
            time[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(time, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] == o2[1]) {
                    return o1[0] - o2[0];
                }

                return o1[1] - o2[1];
            }
        }); // 종료시간이 같다면 시작시간을 기준으로 정렬
        // 1 3, 4 8, 8 8


        int prevEndTime = 0;
        int count = 0;
        for (int i = 0; i < N; i++) {
            if (prevEndTime <= time[i][0]) { // 이전 종료 시간보다 현재 회의의 시작시간이 더 늦다면
                prevEndTime = time[i][1];
                count ++;
            }
        }

        System.out.println(count);
    }
}

/***
 * 위와 같이 최대한 시간표를 많이 배정하고, 선택하는 문제를 '활동 선택 문제(Activity Selection problem)'라고 한다.
 * 종료시간을 기준으로 정렬을 함으로써 이를 해결할 수 있다. (종료시간이 같다면 시작시간을 기준으로 한번 더 비교)
 * https://st-lab.tistory.com/145
 */