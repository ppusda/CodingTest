package Inflearn.Pr06.Pr09;

import java.util.Arrays;
import java.util.Scanner;

public class Pr06_my09 {

    private int solution(int arrLength, int target, int[] arr) {
        int answer = 0;

        int lt = Arrays.stream(arr).max().getAsInt();
        int rt = Arrays.stream(arr).sum();

        while(lt <= rt){
            int mid = (int)((lt + rt) / 2);

            int add = 0;
            int cnt = 1;
            for(int x : arr){
                if (add+x > mid){
                    cnt ++;
                    add = x;
                }else{
                    add += x;
                }
            }

            if(cnt <= target){
                answer = mid;
                rt = mid - 1;
            }else {
                lt = mid + 1;
            }
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

/***
 * 실패한 코드... 왜인지 모르겠다.
 *
 */