package Programmers.Lv2.Pr42746;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Number implements Comparable<Number> {
    public String n;

    public Number(String n) {
        this.n = n;
    }

    @Override
    public int compareTo(Number number) {
        String order1 = this.n + number.n;
        String order2 = number.n + this.n;
        return order2.compareTo(order1); // 내림차순 정렬, 오름차순은 비교 순서를 변경
    }
}

public class Pr42746 {
    public String solution(int[] numbers) {
        List<Number> arrayList = new ArrayList<>();
        for (int number: numbers) {
            arrayList.add(new Number(String.valueOf(number)));
        }

        Collections.sort(arrayList);

        if (arrayList.get(0).n.equals("0")) {
            return "0";
        }

        StringBuilder answer = new StringBuilder();
        for (Number number: arrayList) {
            answer.append(number.n);
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        System.out.println(new Pr42746().solution(new int[] {3, 30, 34, 5, 9}));
    }
}
