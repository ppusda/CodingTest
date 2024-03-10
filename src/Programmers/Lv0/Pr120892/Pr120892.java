package Programmers.Lv0.Pr120892;

import java.util.stream.IntStream;

public class Pr120892 {
    public String solution(String cipher, int code) {
        StringBuilder sb = new StringBuilder();

        IntStream.range(0, cipher.length())
                .filter(n -> (n+1) % code == 0)
                .forEach(n -> sb.append(cipher.charAt(n)));

        return sb.toString();
    }
}
