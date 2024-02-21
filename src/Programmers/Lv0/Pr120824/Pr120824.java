package Programmers.Lv0.Pr120824;

public class Pr120824 {
    public int[] solution(int[] num_list) {
        int even = 0;
        int odd = 0;

        for (int num : num_list) {
            if (num % 2 == 0) {
                even++;
                continue;
            }
            odd++;
        }

        return new int[] {even, odd};
    }
}
