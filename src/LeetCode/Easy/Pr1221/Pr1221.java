package LeetCode.Easy.Pr1221;

public class Pr1221 {
    public int balancedStringSplit(String s) {
        int answer = 0;
        int rCount = 0;
        int lCount = 0;

        for (char ch : s.toCharArray()) {
            if (ch == 'R') {
                rCount ++;
            } else {
                lCount ++;
            }

            if (rCount == lCount && rCount != 0 && lCount != 0) {
                answer ++;
                rCount = 0;
                lCount = 0;
            }
        }

        return answer;
    }
}
