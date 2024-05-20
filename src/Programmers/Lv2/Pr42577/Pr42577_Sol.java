package Programmers.Lv2.Pr42577;

import java.util.HashMap;

public class Pr42577_Sol {
    public boolean solution(String[] phone_book) {
        // 해시맵을 사용하여 전화번호 저장
        HashMap<String, Integer> phoneMap = new HashMap<>();

        // 전화번호를 해시맵에 추가
        for (String phone : phone_book) {
            phoneMap.put(phone, 1);
        }

        // 각 전화번호에 대해 접두어가 해시맵에 존재하는지 확인
        for (String phone : phone_book) {
            // 각 전화번호의 접두어를 점검
            for (int i = 1; i < phone.length(); i++) {
                // 접두어가 해시맵에 존재하면 false 반환
                if (phoneMap.containsKey(phone.substring(0, i))) {
                    return false;
                }
            }
        }

        // 접두어 관계가 없으면 true 반환
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new Pr42577_Sol().solution(new String[] {"119", "97674223", "1195524421"}));
    }
}
// 해시 풀이

