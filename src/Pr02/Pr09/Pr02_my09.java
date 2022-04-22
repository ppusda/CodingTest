package Pr02.Pr09;

import java.util.*;

public class Pr02_my09 {
    private int solution(int inputNumber, int[][] inputArr) {
        int answer = 0;
        List<Integer> numList = new ArrayList<>();

        int diagonalSum = 0;
        int backDiagonalSum = 0;

        for(int i = 0; i < inputNumber; i++){
            int verticalSum = 0;
            int horizontalSum = 0;
            for (int j = 0; j < inputNumber; j++){
                verticalSum += inputArr[i][j];
                horizontalSum += inputArr[j][i];
            }
            numList.add(verticalSum);
            numList.add(horizontalSum);

            diagonalSum += inputArr[i][i];
            backDiagonalSum += inputArr[i][inputNumber-1-i];
        }

        numList.add(diagonalSum);
        numList.add(backDiagonalSum);

        answer = numList.stream().mapToInt(x -> x).max().orElseThrow(NoSuchElementException::new);

        return answer;
    }

    public static void main(String[] args) {
        Pr02_my09 pr = new Pr02_my09();
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

}