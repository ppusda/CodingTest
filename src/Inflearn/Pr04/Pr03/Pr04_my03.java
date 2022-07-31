package Inflearn.Pr04.Pr03;

import java.util.*;

public class Pr04_my03 {
    private ArrayList<Integer> solution(Integer max, Integer cnt, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();

        int head = cnt-1, tail = 0;

        Map<Integer, Integer> tmpMap = new HashMap();

        for(int i = tail; i <= head; i++){
            tmpMap.put(arr[i], tmpMap.getOrDefault(arr[i], 0)+1);
        }

        while(head < max){
            answer.add(tmpMap.size());

            head++;
            if(head == max){
                break;
            }
            tmpMap.put(arr[head], tmpMap.getOrDefault(arr[head], 0)+1);
            if(tmpMap.get(arr[tail]) == 1){
                tmpMap.remove(arr[tail]);
            }else{
                tmpMap.put(arr[tail], tmpMap.get(arr[tail])-1);
            }
            tail++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Pr04_my03 pr = new Pr04_my03();
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