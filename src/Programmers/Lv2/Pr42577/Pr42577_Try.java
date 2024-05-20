package Programmers.Lv2.Pr42577;

import java.util.HashSet;
import java.util.Set;

public class Pr42577_Try {
    public boolean solution(String[] phone_book) {
        Set<String> hashSet = new HashSet<>();

        for (String phone : phone_book) {
            for (int i = 1; i < phone.length(); i++) {
                hashSet.add(phone.substring(0, i)); // 모든 접두어 set에 추가
            }
        }

        for (String phone : phone_book) {
            if (hashSet.contains(phone)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(new Pr42577_Try().solution(new String[] {"119", "97674223", "1195524421"}));
    }
}
// 해시로 풀어보기, 효율성 실패..
// 모든 접두어를 추가하는 방면에서 문제가 있는 것 같음.

