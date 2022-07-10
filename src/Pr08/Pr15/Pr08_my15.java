package Pr08.Pr15;

import java.util.*;



public class Pr08_my15 {
    private static int answer = Integer.MAX_VALUE, arrLen, maxPizzaShop;
    private static int[][] board;
    private static int[] combi;
    private static ArrayList<Point> pizzaShop, house;

    private void DFS(int L, int start) { // Combination
        if(L == maxPizzaShop){
            int sum = 0;
            for (int i : combi) {
                Point p = pizzaShop.get(i);
                int dis = Integer.MAX_VALUE;
                for (Point h : house) {
                    dis = Math.min(Math.abs(p.x - h.x) + Math.abs(p.y - h.y), dis);
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
        Pr08_my15 pr = new Pr08_my15();
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

/**
 * 순서를 잘 못 생각했다.
 * 경우의 수를 하나가지고 돌려 보는게 아니라,
 * 집 하나 씩 경우의 수를 돌렸어야 했다.
 *
 */