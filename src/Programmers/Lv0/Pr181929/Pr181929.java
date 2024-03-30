// Programmers: 181929_원소들의 곱과 합
package Programmers.Lv0.Pr181929;

public class Pr181929 {
    public int solution(int[] num_list) {
        int sum = 0;
        int mul = 1;

        for (int n : num_list) {
            mul *= n;
            sum += n;
        }

        return mul < Math.pow(sum, 2) ? 1 : 0;
    }
}
