// Programmers: 134240_푸드 파이트 대회
package Programmers.Lv1.Pr134240;

public class Pr134240 {
    public String solution(int[] food) {
        StringBuilder answer = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < food.length; i++) {
            for (int j = 0; j < food[i]/2; j++) {
                sb.append(i);
            }
        }

        answer.append(sb);
        answer.append("0");
        answer.append(sb.reverse());

        return answer.toString();
    }

    public static void main(String[] args) {
        System.out.println(new Pr134240().solution(new int[]{1, 3, 4, 6}));
    }
}
