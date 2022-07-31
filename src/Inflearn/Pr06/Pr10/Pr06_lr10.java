package Inflearn.Pr06.Pr10;

import java.util.Arrays;
import java.util.Scanner;

public class Pr06_lr10 {

    public int count(int[] arr, int mid){
        int cnt = 1;
        int ep = arr[0];

        for(int i = 1; i < arr.length; i++){
            if(arr[i] - ep >= mid){
                cnt ++;
                ep = arr[i];
            }
        }
        return cnt;
    }

    private int solution(int arrLength, int target, int[] arr) {
        int answer = 0;

        Arrays.sort(arr);

        int lt = 1;
        int rt = arr[arrLength-1];

        while (lt <= rt) {
            int mid = (int)((lt + rt) / 2);
            if (count(arr, mid) >= target) {
                answer = mid;
                lt = mid + 1;
            } else {
                rt = mid - 1;
            }
        }
        return answer;
    }

    public static void main (String[] args){
        Pr06_lr10 pr = new Pr06_lr10();
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

/***
 *  적절한 거리를 이분검색으로 찾는 문제이다.
 *
 *  count에서는 첫번째 요소에서의 각 거리를 잰다.
 *  (무조건 한 마리를 넣고 시작하는 것, 맨 왼쪽에 한 마리를 넣는것은 항상 이득이기 때문)
 *
 *  ep 는 최근 계산했던 배열의 요소이다.
 *  설정한 거리 mid보다 크거나 같게되면 (조건에 부합하게되면 = 두 말의 거리가 적절한 거리만큼이 되는 때에)
 *  ep를 변경하여 두번째 마구간과 다음 마구간의 거리를 비교하게 되는 것이다.
 *
 *  arr[i] - ep 는 거리계산식이다.
 *  이로인해서 이분검색으로 찾은 적절한거리 mid 보다 크거나 같은 거리로 count된 것이 설정한 N값 이라면,
 *  정답 조건 충족하게 된다.
 *
 *  그렇다 하더라도 최고의 효율을 가지는 요소를 찾아야하기 때문에
 *  lr >= rt (이분 검색을 통한 조건) 를 통해서 계속된 검색을 이어나가게 된다.
 *
 */
