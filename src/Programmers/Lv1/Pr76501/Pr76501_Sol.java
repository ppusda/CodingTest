package Programmers.Lv1.Pr76501;

public class Pr76501_Sol {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i=0; i<signs.length; i++)
            answer += absolutes[i] * (signs[i]? 1: -1);
        return answer;
    }
} // 삼항연산자와 1/-1을 곱해 양수/음수를 결정하는 것이 인상적이었다.
