package Pr06.Pr08;

import java.util.*;

public class Pr06_my08 {

    private int solution(int arrLength, int target, int[] arr) {
        int answer = 0;

        int start = 0;
        int mid = ((int)arrLength/2);
        int end = arrLength;
        Arrays.sort(arr);

        while(end - start >= 0) {
            if (arr[mid] > target){
                end = mid;
            }else if(arr[mid] < target){
                start = mid;
            }else{
                answer = mid + 1;
                break;
            }
            mid = (int)(end + start)/2;
        }
        return answer;
    }

    public static void main(String[] args) {
        Pr06_my08 pr = new Pr06_my08();
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