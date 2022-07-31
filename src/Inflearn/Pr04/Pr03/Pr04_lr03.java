package Inflearn.Pr04.Pr03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Pr04_lr03 {
    private ArrayList<Integer> solution(Integer max, Integer cnt, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();

        int tail = 0;

        Map<Integer, Integer> tmpMap = new HashMap();

        for(int i = tail; i < cnt-1; i++){
            tmpMap.put(arr[i], tmpMap.getOrDefault(arr[i], 0)+1);
        }

        for(int head = cnt-1; head < max; head++){
            tmpMap.put(arr[head], tmpMap.getOrDefault(arr[head], 0)+1);
            answer.add(tmpMap.size());

            tmpMap.put(arr[tail], tmpMap.get(arr[tail])-1);
            if(tmpMap.get(arr[tail]) == 0){
                tmpMap.remove(arr[tail]);
            }
            tail++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Pr04_lr03 pr = new Pr04_lr03();
        Scanner sc = new Scanner(System.in);

        int max = sc.nextInt();
        int cnt = sc.nextInt();
        int[] arr = new int[max];
        for(int i = 0; i < max; i++){
            arr[i] = sc.nextInt();
        }

        for (int num : pr.solution(max, cnt, arr)) {
            System.out.print(num + " ");
        }
    }

}