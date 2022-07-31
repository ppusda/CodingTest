package Inflearn.Pr06.Pr08;

import java.util.Arrays;
import java.util.Scanner;

public class Pr06_lr08 {

    private int solution(int arrLength, int target, int[] arr) {
        int answer = 0;

        int start = 0;
        int end = arrLength-1;

        Arrays.sort(arr);

        while(start <= end) {
            int mid = (int)(end + start)/2;
            if(arr[mid] == target){
                answer = mid + 1;
                break;
            }
            if (arr[mid] > target){
                end = mid - 1;
            }else {
                start = mid + 1;
            }

        }
        return answer;
    }

    public static void main(String[] args) {
        Pr06_lr08 pr = new Pr06_lr08();
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