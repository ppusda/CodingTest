package Inflearn.Pr05.Pr03;

import java.util.Scanner;
import java.util.Stack;

public class Pr05_lr03 {
    private Integer solution(int[][]boardArr, int[] programArr) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for(int pos : programArr){
            for(int i = 0; i < boardArr.length; i++){
                if(boardArr[i][pos-1] != 0){
                    int tmp = boardArr[i][pos-1];
                    boardArr[i][pos-1] = 0;
                    if(!stack.isEmpty() && tmp == stack.peek()){
                        answer += 2;
                        stack.pop();
                    }else {
                        stack.push(tmp);
                    }
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Pr05_lr03 pr = new Pr05_lr03();
        Scanner sc = new Scanner(System.in);

        int boardNum = sc.nextInt();
        int[][] boardArray = new int[boardNum][boardNum];
        for(int i = 0; i < boardNum; i++){
            for(int j = 0; j < boardNum; j++){
                boardArray[i][j] = sc.nextInt();
            }
        }

        int programNum = sc.nextInt();
        int[] programArray = new int[programNum];
        for(int k = 0; k < programNum; k++){
            programArray[k] = sc.nextInt();
        }

        System.out.println(pr.solution(boardArray, programArray));
    }

}

