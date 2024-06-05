package Programmers.Lv2.Pr42885;

import java.util.Arrays;
import java.util.Collections;

public class Pr42885 {
    public int solution(int[] people, int limit) {
        Integer[] peopleArray = Arrays.stream(people).boxed().toArray(Integer[]::new);
        Arrays.sort(peopleArray, Collections.reverseOrder());

        int length = peopleArray.length;
        int last = length-1;
        int[] ch = new int[length];
        int answer = 0;

        for (int i = 0; i < length; i++) {
            int boat = 0;
            if (ch[i] == 1) {
                continue;
            }

            ch[i] = 1;
            boat += peopleArray[i];
            while (last > 0) {
                if (ch[last] == 0) {
                    if (boat+peopleArray[last] <= limit) {
                        ch[last --] = 1;
                    }
                    break;
                }
                last --;
            }
            answer ++;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(new Pr42885().solution(new int[] {70, 50, 80, 50}, 100));
    }
}
