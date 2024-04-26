package Youtube.Greedy;

import java.util.stream.IntStream;

public class Pr1 {
    public int solution(int n, int k) {
        int result =0;
        while (true) {
            int target = (n/k) * k;
            result = n - target;
            n = target;

            if (n < k) {
                break;
            }

            result ++;
            n /= k;
        }

        return result += (n-1);
    }
}

// 최대한 나누기 수행
// https://www.youtube.com/watch?v=2zjoKjt97vQ