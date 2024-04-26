package Youtube.Greedy;

import java.util.Arrays;

public class Pr3 {
    public int solution(int n, int[] numberArray) {
        Arrays.sort(numberArray);

        int result = 0;
        int target = 0;

        for (int number: numberArray) {
            target ++;
            if (target >= number) {
                result ++;
                target = 0;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(new Pr3().solution(5, new int[]{2,3,1,2,2}));
    }
}

// 정렬 후 작은 숫자 부터 그룹핑
// https://www.youtube.com/watch?v=2zjoKjt97vQ