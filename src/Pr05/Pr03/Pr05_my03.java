package Pr05.Pr03;

import java.util.Scanner;
import java.util.Stack;

public class Pr05_my03 {
    private Integer solution(int[][]boardArr, int[] programArr) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        int stt = 0;

        for(int i = 0; i < programArr.length; i++){
            int selectNum = programArr[i]-1;
            for(int j = 0; j < boardArr[selectNum].length; j++){
                int pickNum = boardArr[j][selectNum];
                if(pickNum != 0){
                    if(stt == 1 && stack.peek() == pickNum ){
                        stack.pop();
                        answer ++;
                    }else{
                        stack.push(pickNum);
                        stt = 1;
                    }
                    boardArr[j][selectNum] = 0;
                    break;
                }
            }
        }

        return answer*2;
    }

    public static void main(String[] args) {
        Pr05_my03 pr = new Pr05_my03();
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

