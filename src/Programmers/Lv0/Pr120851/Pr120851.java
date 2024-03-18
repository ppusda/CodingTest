package Programmers.Lv0.Pr120851;

import java.util.Arrays;

public class Pr120851 {
    public int solution(String my_string) {
        return Arrays.stream(my_string.chars().toArray())
                .filter(Character::isDigit)
                .map(x -> Integer.parseInt(String.valueOf((char)x)))
                .sum();
    }
}
