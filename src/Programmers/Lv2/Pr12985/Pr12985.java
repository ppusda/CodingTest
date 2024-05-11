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

// 왜 (a + 1)을 하는가?
// - 짝수의 경우 다음 라운드의 숫자가 계산되지만, 홀수의 경우 다음 라운드의 숫자를 계산할 수 없기 때문

// 왜 (a + 1) / 2 == (b + 1) / 2 인 경우가 답인가?
// - 예제 처럼 4, 7인 경우에도 계속 나누다 보면, => 2, 4 => 1, 2 와 같이 변하게 되고 결국 1, 1이 된다.