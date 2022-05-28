package Pr06.Pr09;

import java.util.Arrays;
import java.util.Scanner;

public class Pr06_my09 {

    private int solution(int arrLength, int target, int[] arr) {
        int answer = 0;

        int lt = Arrays.stream(arr).max().getAsInt();
        int rt = Arrays.stream(arr).sum();

        while(rt - lt > 0){
            int mid = (int)((lt + rt) / 2);

            int add = 0;
            int cnt = 0;
            for(int i = 0; i < arrLength;){
                if(add < mid){
                    add += arr[i++];
                }else {
                    i --;
                    cnt ++;
                    add = 0;
                }
            }
            if(add >= mid){
                cnt ++;
            }

            if(cnt <= target){
                rt = mid - 1;
            }else {
                lt = mid + 1;
            }
            answer = mid;
        }

        return answer;
    }

    public static void main(String[] args) {
        Pr06_my09 pr = new Pr06_my09();
        Scanner sc = new Scanner(System.in);

        int arrLength = sc.nextInt();
        int target = sc.nextInt();
        int[] arr = new int[arrLength];
        for(int i = 0; i < arrLength; i ++){
            arr[i] = sc.nextInt();
        }

        System.out.println(pr.solution(arrLength, target, arr));
    }
}