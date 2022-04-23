package Pr02.Pr10;


import java.util.Scanner;

public class Pr02_my10 {
    private int solution(int useNumber, int[][] inputArr) {
        int answer = 0;

        for(int i = 1; i < useNumber-1; i++){
            for(int j = 1; j < useNumber-1; j++){
                int max = 0;
                for(int k = j - 1 ; k < j + 2; k++){
                    if(k == j){
                        continue;
                    }
                    if(max < inputArr[i][k]){
                        max = inputArr[i][k];
                    }
                }
                for(int p = i - 1 ; p < i + 2; p++){
                    if (p == i){
                        continue;
                    }
                    if(max < inputArr[p][j]){
                        max = inputArr[p][j];
                    }
                }
                if(max < inputArr[i][j]){
                    answer ++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Pr02_my10 pr = new Pr02_my10();
        Scanner sc = new Scanner(System.in);

        int inputNumber = sc.nextInt();
        int useNumber = inputNumber+2;
        int[][] inputArr = new int[useNumber][useNumber];

        for(int i = 1; i < useNumber-1; i++){
            for(int j = 1; j < useNumber-1; j++){
                inputArr[i][j] = sc.nextInt();
            }
        }

        System.out.println(pr.solution(useNumber, inputArr));
    }
}
