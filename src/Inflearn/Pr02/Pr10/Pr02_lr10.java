package Inflearn.Pr02.Pr10;


import java.util.Scanner;

public class Pr02_lr10 {
    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, 1, 0, -1};

    private int solution(int inputNumber, int[][] inputArr) {
        int answer = 0;

        for(int i = 0; i < inputNumber; i++){
            for (int j = 0; j < inputNumber; j++){
                boolean flag = true;
                for(int k = 0; k < 4; k++){
                    int nx = i + dx[k];
                    int ny = j + dy[k];

                    if(nx >= 0 && nx < inputNumber && ny >= 0 && ny < inputNumber && inputArr[nx][ny] >= inputArr[i][j] && inputArr[nx][ny] >= inputArr[i][j]){
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    answer++;
                }
            }
        }



        return answer;
    }

    public static void main(String[] args) {
        Pr02_lr10 pr = new Pr02_lr10();
        Scanner sc = new Scanner(System.in);

        int inputNumber = sc.nextInt();
        int[][] inputArr = new int[inputNumber][inputNumber];

        for(int i = 0; i < inputNumber; i++){
            for(int j = 0; j < inputNumber; j++){
                inputArr[i][j] = sc.nextInt();
            }
        }

        System.out.println(pr.solution(inputNumber, inputArr));
    }


    /***
     * 미리 계산할 값들을 배열에 넣어두고 활용하는 점은 나중에 써먹어 봐야겠다.
     */
}
