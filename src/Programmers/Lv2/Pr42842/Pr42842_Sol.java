package Programmers.Lv2.Pr42842;

public class Pr42842_Sol {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int mul = brown + yellow;
        int add = (brown + 4) / 2;

        for(int i=1; i<=mul; i++) {
            int j=mul/i;
            if(i*j==mul) { // i*j가 mul이 아니면 배수가 아니므로 pass
                if(i+j==add) {
                    answer[0] = j; // i는 1부터 시작하고, 가로가 세로보다 크거나 같음
                    answer[1] = i;
                    break;
                }
            }
        }
        return answer;
    }
}
// j 를 구할 때 mul에서 i를 나눈값을 활용하는 것이 인상적이다.
//