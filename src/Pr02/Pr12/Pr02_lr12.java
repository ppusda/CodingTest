package Pr02.Pr12;

import java.util.*;

public class Pr02_lr12 {
    private int solution(int student, int exam, int[][] inputArr) {
        int answer = 0;

        for(int i = 1; i <= student; i++){
            for(int j = 1; j <= student; j++){
                int cnt = 0;
                for(int k = 0; k < exam; k++){
                    int pi = 0, pj = 0;
                    for(int s = 0; s < student; s++){
                        if(inputArr[k][s] == i){
                            pi = s;
                        }
                        if(inputArr[k][s] == j){
                            pj = s;
                        }
                    }
                    if(pi < pj){
                        cnt ++;
                    }
                }
                if(cnt == exam){
                    answer++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Pr02_lr12 pr = new Pr02_lr12();
        Scanner sc = new Scanner(System.in);

        int student = sc.nextInt();
        int exam = sc.nextInt();
        int[][] inputArr = new int[exam][student];

        for(int i = 0; i < exam; i++){
            for(int j = 0; j < student; j++){
                inputArr[i][j] = sc.nextInt();
            }
        }

        System.out.println(pr.solution(student, exam, inputArr));
    }

    /**
     * 각 경우의 수 (i, j) 에 따라서 k, s를 통해서 각 테스트 에서 해당 경우의 수가 있는지 확인함.
     */
}
