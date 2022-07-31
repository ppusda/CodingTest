package Inflearn.Pr10.Pr03;

import java.util.Scanner;

public class Pr10_Pr03 {

    private static int[] dy;

    private int solution(int[] arr) {
        int answer = 0;
        dy = new int[arr.length];
        dy[0] = 1;
        for(int i = 1; i < arr.length; i++){
            int max = 0;
            for(int j = i - 1; j >= 0; j--){
                if(arr[j] < arr[i] && dy[j] > max){
                    max = dy[j];
                }
            }
            dy[i] = max + 1;
            answer = Math.max(answer, dy[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        Pr10_Pr03 pr = new Pr10_Pr03();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(pr.solution(arr));
    }
}
/***
 * dy[]
 * arr 배열에 담겨있는 인덱스 값을 기준으로,
 * dy 배열에서 몇번 연속으로 증가 시킬 수 있는지 확인한다.
 *  - 자기보다 낮은 인덱스 값들을 탐색하면서, 만약 더 큰값이 나오면,
 *    연속으로 증가하는 값을 충족하기에 기존 max값에 더하여 몇 번까지 추가되는지 출력할 수 있다.
 */