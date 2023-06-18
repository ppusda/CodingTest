package BaekJoon.Bronze.Pr2460;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Pr2460_Sol {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        st.nextToken();

        int max = Integer.parseInt(st.nextToken());
        int current = max;

        for (int i = 1; i <= 9; i++) {
            st = new StringTokenizer(br.readLine());
            int out = Integer.parseInt(st.nextToken());
            int in = Integer.parseInt(st.nextToken());

            current = current - out + in;
            max = Math.max(max, current);
        }

        System.out.print(max);
    }
}

// 14152 KB / 124 ms
// 확실히 BufferReader가 성능에 도움이 되는 것이 보인다. 향후는 Scanner 대신 BufferReader 사용하는 방향도 생각해봐야겠다.
