package Programmers.Lv1.Pr86491;

public class Pr86491 {
    public static int solution(int[][] sizes) {
        int min = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;

        for(int[] size : sizes) {
            int vertical = size[0];
            int horizontal = size[1];

            if(vertical > horizontal) {
                max = Math.max(max, vertical);
                min = Math.max(min, horizontal);
            } else {
                max = Math.max(max, horizontal);
                min = Math.max(min, vertical);
            }
        }

        return min * max;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[][] {{60, 50}, {30, 70}, {60, 30}, {80, 40}}));
    }
}
