package Programmers.Lv0.Pr120839;

import java.util.HashMap;
import java.util.Map;

public class Pr120839 {
    public String solution(String rsp) {
        StringBuilder sb = new StringBuilder();
        Map<Character, Character> rspMap = new HashMap<>();
        rspMap.put('2', '0');
        rspMap.put('0', '5');
        rspMap.put('5', '2');

        for (char target: rsp.toCharArray()) {
            sb.append(rspMap.get(target));
        }

        return sb.toString();
    }
}

// return Arrays.stream(rsp.split("")).map(s -> s.equals("2") ? "0" : s.equals("0") ? "5" : "2").collect(Collectors.joining());
// stream + 삼항연산자... ㅋㅋㅋㅋㅋㅋㅋㅋ
