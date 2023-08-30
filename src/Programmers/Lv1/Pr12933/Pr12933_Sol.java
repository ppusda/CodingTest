package Programmers.Lv1.Pr12933;

import java.util.Arrays;

public class Pr12933_Sol {
    public long solution(long n) {
        String[] list = String.valueOf(n).split("");
        Arrays.sort(list);

        StringBuilder sb = new StringBuilder();
        for (String aList : list) sb.append(aList);

        return Long.parseLong(sb.reverse().toString());
    }
}
// 내가 하려던 방법인데 Split으로 나눠서 sort 돌리는 방식으로도 정상적으로 된다는 걸 몰랐다.

/*
    String res = "";
    public int reverseInt(int n){
        res = "";
        Integer.toString(n).chars().sorted().forEach(c -> res = Character.valueOf((char)c) + res);
        return Integer.parseInt(res);
    }
 * // lambda를 이용하면 위와 같이 풀 수 있다...