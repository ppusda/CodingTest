package Inflearn.Pr09.Pr04;

import java.util.*;

public class Pr09_my04 {

    private static int len, answer = 0;
    private static ArrayList<Schedule> schArr;

    private int solution() {
        int max = schArr.get(0).limit;
        int cnt = 1, idx = 0;
        PriorityQueue<Integer> pQueue = new PriorityQueue<>(Comparator.reverseOrder());

        int val = 0;
        while(cnt < schArr.get(0).limit) {
            val = schArr.get(idx).limit;
            if(max != val){
                answer += pQueue.poll();
                max = val;
                cnt ++;
            }else{
                pQueue.offer(schArr.get(idx).money);
                idx ++;
            }
        }

        answer += pQueue.poll();

        return answer;
    }

    public static void main(String[] args) {
        Pr09_my04 pr = new Pr09_my04();
        Scanner sc = new Scanner(System.in);

        len = sc.nextInt();
        schArr = new ArrayList<>();
        for(int i = 0; i < len; i++){
            schArr.add(new Schedule(sc.nextInt(), sc.nextInt()));
        }

        Collections.sort(schArr);
        System.out.println(pr.solution());
    }
}