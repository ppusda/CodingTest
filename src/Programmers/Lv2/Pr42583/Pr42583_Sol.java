package Programmers.Lv2.Pr42583;

import java.util.LinkedList;
import java.util.Queue;

public class Pr42583_Sol {

    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> queue = new LinkedList<>();
        int tot = 0;
        int time = 0;

        for(int i = 0; i < truck_weights.length; i++) {
            int truck = truck_weights[i];

            while (true) {
                if(queue.isEmpty()) {
                    queue.add(truck);
                    tot += truck;
                    ++time;
                    break;
                } else if (queue.size() == bridge_length) {
                    tot -= queue.poll();
                } else {
                    if (tot + truck <= weight) {
                        queue.add(truck);
                        tot += truck;
                        ++time;
                        break;
                    } else {
                        queue.add(0);
                        ++time;
                    }
                }
            }
        }
        return time + bridge_length;
    }

    public static void main(String[] args) {
        int[] truck_weights = {7, 4, 5, 6};
        System.out.print(solution(2, 10, truck_weights));
    }
}

/**
 *  실제로 각 트럭들이 다리를 건너는 시간을 구함. (다리 길이와 관계 없이)
 *  7 4 5 6 => 6
 *  10 => 1
 *  10 10 10 10 10 10 10 10 10 10 => 10
 *
 *  이는 queue (다리) 위에 실제 트럭이 있는지 없는지를 확인하며 진행 됨. (무게도 따지고)
 */