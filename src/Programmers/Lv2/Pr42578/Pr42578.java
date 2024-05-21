package Programmers.Lv2.Pr42578;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Pr42578 {
    public int solution(String[][] clothes) {
        Map<String, ArrayList<String>> clothesMap = new HashMap<>();
        int answer = 1;

        for (String[] clothe: clothes) {
            String name = clothe[0];
            String type = clothe[1];

            if (!clothesMap.containsKey(type)) {
                clothesMap.put(type, new ArrayList<>());
            }

            clothesMap.get(type).add(name);
        }

        if (clothesMap.keySet().size() == 1) {
            return clothes.length;
        }

        for (ArrayList arrayList : clothesMap.values()) {
            answer *= arrayList.size()+1;
        }

        return answer-1;
    }

    public static void main(String[] args) {
        System.out.println(new Pr42578().solution(new String[][] {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}}));
    }
}
