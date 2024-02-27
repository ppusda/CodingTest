package Programmers.Lv0.Pr120906;

public class Pr120906 {
    public int solution(int n) {
        int answer = 0;
        String[] strs = String.valueOf(n).split("");

        for (String str : strs) {
            answer += Integer.parseInt(str);
        }

        return answer;
    }
}
// return Arrays.stream(String.valueOf(n).split("")).mapToInt(Integer::parseInt).sum();