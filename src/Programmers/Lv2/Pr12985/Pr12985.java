package Programmers.Lv2.Pr12985;

public class Pr12985 {
    public int solution(int n, int a, int b) {
        int count = 0;

        while (a != b) {
            a = (a + 1) / 2;
            b = (b + 1) / 2;
            count++;
        }

        return count;
    }
}

// 간단하게 a와 b의 다음 라운드에서의 숫자를 계산하여 같은 경우가 정답