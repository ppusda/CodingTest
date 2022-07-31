package Inflearn.Pr05.Pr08;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Patient {
    int id;
    int priority;

    public Patient(int id, int priority) {
        this.id = id;
        this.priority = priority;
    }
}

public class Pr05_lr08 {
    private int solution(int patient, int goal, int[] priorityArr) {
        int answer = 1;
        Queue<Patient> patientQueue = new LinkedList<>();
        for(int i = 0; i < patient; i++){
            patientQueue.offer(new Patient(i, priorityArr[i]));
        }
        while(!patientQueue.isEmpty()){
            Patient tmp = patientQueue.poll();
            for (Patient x : patientQueue) {
                if(x.priority > tmp.priority){
                    patientQueue.offer(tmp);
                    tmp = null;
                    break;
                }
            }
            if(tmp != null){
                if(tmp.id == goal){
                    return answer;
                }else{
                    answer ++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Pr05_lr08 pr = new Pr05_lr08();
        Scanner sc = new Scanner(System.in);

        int patient = sc.nextInt();
        int goal = sc.nextInt();

        int[] priorityArr = new int[patient];
        for (int i = 0; i < patient; i++){
            priorityArr[i] = sc.nextInt();
        }

        System.out.println(pr.solution(patient, goal, priorityArr));
    }
}

/**
 * 도저히 감이 안와서 결국엔 강의를 보게되었다.
 *
 * class 를 만들어 값을 처리할 줄을 생각도 못했다.
 * 또한 Queue도 iter를 이용해서 값을 가져올 수 있을지를 생각하지 못했다.
 *
 * 앞으로는 이런 부분들을 좀 더 생각해보고 코드를 작성할 수 있도록 해야겠다.
 */