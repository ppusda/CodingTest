package Inflearn.Pr02.Pr11;

import java.util.Scanner;

public class Pr02_lr11 {
    private int solution(int inputNumber, int[][] inputArr) {
        int answer = 0, max = 0;

        for(int i = 1; i <= inputNumber; i++){
            int cnt = 0;
            for(int j = 1; j <= inputNumber; j++){
                for(int k = 1; k <= 5; k++){
                    if(inputArr[i][k] == inputArr[j][k]){
                        cnt ++;
                        break;
                    }
                }
            }
            if(cnt > max){
                max = cnt;
                answer = i;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Pr02_lr11 pr = new Pr02_lr11();
        Scanner sc = new Scanner(System.in);

        int inputNumber = sc.nextInt();
        int[][] inputArr = new int[inputNumber+1][6];

        for(int i = 1; i <= inputNumber; i++){
            for(int j = 1; j <= 5; j++){
                inputArr[i][j] = sc.nextInt();
            }
        }

        System.out.println(pr.solution(inputNumber, inputArr));
    }

    /**
     * 각 학생과 다음 학생의 학년을 각각 매칭하여 비교한다.
     * 만약, 한번이라도 같은 값이 나왔다면 break를 통해서 멈추어 중복을 없앤다.
     * (횟수가 아니라 학생 수로 카운트를 하기 때문에.)
     *
     * 처음으로 못 푼 문제...
     * 접근 방식 자체에서 문제가 되었다.
     * 다음 부터는 잘 안풀리면 좀 더 여러방면에서 바라볼 수 있도록 해야겠다.
     */
}
