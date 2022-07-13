package Pr09.Pr04;

import java.util.*;


class Schedule implements Comparable<Schedule>{
    int money, limit;

    public Schedule(int attendTime, int leaveTime) {
        this.money = attendTime;
        this.limit = leaveTime;
    }

    @Override
    public int compareTo(Schedule o) {
        return o.limit - this.limit;
    }
}

public class Pr09_lr04 {

    private static int len, answer = 0;
    private static ArrayList<Schedule> schArr;

    private int solution() {
        PriorityQueue<Integer> pQueue = new PriorityQueue<>(Comparator.reverseOrder());
        int j = 0, max = schArr.get(0).limit + 1;
        for(int i = max; i >= 1; i--){
            for(; j < len; j++){
                if(schArr.get(j).limit < i){
                    break;
                }
                pQueue.offer(schArr.get(j).money);
            }
            if(!pQueue.isEmpty()){
                answer += pQueue.poll();
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Pr09_lr04 pr = new Pr09_lr04();
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