// Programmers: 181920_카운트 업
package Programmers.Lv0.Pr181920;

import java.util.stream.IntStream;

public class Pr181920 {
    public int[] solution(int start_num, int end_num) {
        return IntStream.range(start_num, end_num + 1).toArray();
    }
}
