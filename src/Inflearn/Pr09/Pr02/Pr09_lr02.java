package Inflearn.Pr09.Pr02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Meeting implements Comparable<Meeting>{
    int start, end;

    public Meeting(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public int compareTo(Meeting o) {
        return this.start - o.start;
    }
}

public class Pr09_lr02 {

    private static ArrayList<Meeting> meetArr;
    private static int len, answer = 0;

    private int solution() {
        int currentEnd = 0;
        for (Meeting meeting : meetArr) {
            if(meeting.start >= currentEnd){
                answer++;
                currentEnd = meeting.end;
            }
        }
        
        return answer;
    }

    public static void main(String[] args) {
        Pr09_lr02 pr = new Pr09_lr02();
        Scanner sc = new Scanner(System.in);

        meetArr = new ArrayList<>();

        len = sc.nextInt();
        for (int i = 0; i < len; i ++){
            meetArr.add(new Meeting(sc.nextInt(), sc.nextInt()));
        }

        Collections.sort(meetArr);
        System.out.println(pr.solution());
    }
}

/**
 *  if(currentEnd > meeting.end){
 *                 currentEnd = meeting.end;
 * }
 * 비교 부분은 굳이 필요하지 않다.
 *
 */