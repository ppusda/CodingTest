package Programmers.Lv1.Pr147355;

public class Pr147355_Sol {
    public int solution(String t, String p) {
        int pLength = p.length();
        long pValue = Long.parseLong(p);
        int answer = 0;
        for (int i = 0; i <= t.length() - pLength; i++) {
            long tValue = Long.parseLong(t.substring(i, i + pLength));
            if (tValue <= pValue)
                answer++;
        }
        return answer;
    }
}

// 굳이 투 포인터를 이용하지 않아도 위처럼 i를 기준으로 index를 정할 수 있을 것이다.