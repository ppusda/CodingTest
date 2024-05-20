package Programmers.Lv2.Pr42577;

import java.util.Arrays;

public class Pr42577 {
    public boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);

        for (int i = 0; i < phone_book.length - 1; i++) {
            if (phone_book[i + 1].startsWith(phone_book[i])) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(new Pr42577().solution(new String[] {"119", "97674223", "1195524421"}));
    }
}
// String 정렬을 이용하여 사전 순으로 배치
// ex) "119", "97674223", "1195524421"
// => "1195524421", "119", "97674223"
// 이후 인접한 원소 끼리 비교 (i+1이 i의 접두어인지 검사)
