package Pr10.Pr04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Brick implements Comparable<Brick>{
    int width, height, weight;

    public Brick(int width, int height, int weight) {
        this.width = width;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Brick o) {
        return o.width - this.width;
    }
}

public class Pr10_my04 {

    private static ArrayList<Brick> bArr = new ArrayList<>();
    private static int[] dy;
    private static int answer = 0;

    private void solution() {
        dy[0] = bArr.get(0).height;
        answer = dy[0];

        for(int i = 1; i < bArr.size(); i++){
            int max = 0;
            for (int j = i-1; j >= 0; j--){
                if(bArr.get(i).weight < bArr.get(j).weight && max < dy[j]){
                    max = dy[j];
                }
            }
            dy[i] = max + bArr.get(i).height;
            answer = Math.max(dy[i], answer);
        }

    }

    public static void main(String[] args) {
        Pr10_my04 pr = new Pr10_my04();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        dy = new int[n];
        for(int i = 0; i < n; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            bArr.add(new Brick(a, b, c));
        }

        Collections.sort(bArr);
        pr.solution();

        System.out.println(answer);
    }
}
