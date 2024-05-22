package Programmers.Lv2.Pr42586;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pr42586_Imp {
    public int[] solution(int[] progresses, int[] speeds) {
        int size = progresses.length;
        int[] times = new int[size];

        for (int i = 0; i < size; i++) {
            int remainProcess = 100 - progresses[i];
            int time = (int) Math.ceil((double) remainProcess/speeds[i]);
            times[i] = time;
        }

        List<Integer> arrayList = new ArrayList<>();
        int count = 1;
        int time = times[0];
        for (int i = 1; i < size; i++) {
            if (time >= times[i]) {
                count ++;
                continue;
            }
            arrayList.add(count);
            count = 1;
            time = times[i];
        }
        arrayList.add(count);

        return arrayList.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        System.out.println(
                Arrays.toString(new Pr42586_Imp().solution(new int[]{90, 90, 90, 90}, new int[]{30, 1, 1, 1})));
    }
}
