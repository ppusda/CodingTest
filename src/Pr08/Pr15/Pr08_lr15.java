package Pr08.Pr15;

import java.util.ArrayList;
import java.util.Scanner;

class Point {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Pr08_lr15 {
    private static int answer = Integer.MAX_VALUE, arrLen, maxPizzaShop;
    private static int[][] board;
    private static int[] combi;
    private static ArrayList<Point> pizzaShop, house;

    private void DFS(int L, int start) { // Combination
        if(L == maxPizzaShop){
            int sum = 0;
            for (Point i : house) {
                int dis = Integer.MAX_VALUE;
                for (int h : combi) {
                    dis = Math.min(Math.abs(i.x - pizzaShop.get(h).x) + Math.abs(i.y - pizzaShop.get(h).y), dis);
                }
                sum += dis;
            }
            if(answer > sum){
                answer = sum;
            }
        }else{
            for(int i = start; i < pizzaShop.size(); i++){
                combi[L] = i;
                DFS(L + 1, i + 1);
            }
        }
    }

    public static void main(String[] args) {
        Pr08_lr15 pr = new Pr08_lr15();
        Scanner sc = new Scanner(System.in);

        arrLen = sc.nextInt();
        maxPizzaShop = sc.nextInt();
        board = new int[arrLen][arrLen];
        combi = new int[maxPizzaShop];
        pizzaShop = new ArrayList<>();
        house = new ArrayList<>();

        for(int i = 0; i < arrLen; i++){
            for(int j = 0; j < arrLen; j++){
                board[i][j] = sc.nextInt();
                if(board[i][j] == 1){
                    house.add(new Point(i, j));
                }else if(board[i][j] == 2){
                    pizzaShop.add(new Point(i, j));
                }
            }
        }

        pr.DFS(0, 0);
        System.out.println(answer);
    }
}