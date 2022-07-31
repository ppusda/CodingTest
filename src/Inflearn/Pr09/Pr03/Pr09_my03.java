package Inflearn.Pr09.Pr03;

import java.util.*;

class Schedule implements Comparable<Schedule>{
    int time;
    char state;

    public Schedule(int time, char state) {
        this.time = time;
        this.state = state;
    }

    @Override
    public int compareTo(Schedule o) {
        if(this.time == o.time){
            return this.state - o.state;
        }else{
            return this.time - o.time;
        }
    }
}

public class Pr09_my03 {

    private static int len, answer = 0;
    private static ArrayList<Schedule> attArr;

    private int solution() {
        int cnt = 0;
        for (Schedule schedule : attArr) {
            if(Objects.equals(schedule.state, 's')){
                cnt ++;
            }else{
                cnt --;
            }
            answer = Math.max(answer, cnt);
        }

        return answer;
    }

    public static void main(String[] args) {
        Pr09_my03 pr = new Pr09_my03();
        Scanner sc = new Scanner(System.in);

        len = sc.nextInt();
        attArr = new ArrayList<>();
        for(int i = 0; i < len; i++){
            attArr.add(new Schedule(sc.nextInt(), 's'));
            attArr.add(new Schedule(sc.nextInt(), 'e'));
        }

        Collections.sort(attArr);
        System.out.println(pr.solution());
    }
}

/***
 * 1차원적으로만 생각하지 말자.
 * 그리디는 최선의 결과를 산출해야만 한다.
 * 어느 방식이 적절한지 생각을 많이 해보자.
 */