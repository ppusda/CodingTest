package Pr06.Pr09;

import java.util.Arrays;
import java.util.Scanner;

public class Pr06_lr09 {

    public int count(int[] arr, int capacity){
        int cnt = 1;
        int sum = 0;

        for(int x : arr){
            if (sum+x > capacity){
                cnt ++;
                sum = x;
            }else{
                sum += x;
            }
        }
        return cnt;
    }

    private int solution(int arrLength, int target, int[] arr) {
        int answer = 0;

        int lt = Arrays.stream(arr).max().getAsInt();
        int rt = Arrays.stream(arr).sum();

        while (lt <= rt) {
            int mid = (int) ((lt + rt) / 2);

            if (count(arr, mid) <= target) {
                answer = mid;
                rt = mid - 1;
            } else {
                lt = mid + 1;
            }
        }
            return answer;
    }

    public static void main (String[] args){
        Pr06_lr09 pr = new Pr06_lr09();
        Scanner sc = new Scanner(System.in);

        int arrLength = sc.nextInt();
        int target = sc.nextInt();
        int[] arr = new int[arrLength];
        for (int i = 0; i < arrLength; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(pr.solution(arrLength, target, arr));
    }
}
/**
 * 배열 순서에 의미가 있기에 sort를 통해서 진행했으면 안됬다.
 *
 * stream을 적극 활용하자.
 *
 * 코드 자체는 잘짰는데 접근하는 부분에서 잘못되었다.
 * (의미가 담긴 배열이었기에 문제가 됨)
 *
 * 이런 부분도 잘 생각해서 코드를 작성해야겠다.
 *
 */
