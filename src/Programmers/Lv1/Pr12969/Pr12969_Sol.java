package Programmers.Lv1.Pr12969;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Pr12969_Sol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        IntStream.range(0, a).forEach(s -> sb.append("*"));
        IntStream.range(0, b).forEach(s -> System.out.println(sb.toString()));
    }
}
// IntStream을 이용한 코드
