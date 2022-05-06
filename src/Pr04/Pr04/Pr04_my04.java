package Pr04.Pr04;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Pr04_my04 {
    private int solution(String str, String compare) {
        int answer = 0;
        char[] strArr = str.toCharArray();
        char[] compareArr = compare.toCharArray();
        int cnt = 0;

        Map<Character, Integer> compareMap = new HashMap();
        for(char x : compareArr){
            compareMap.put(x, compareMap.getOrDefault(x, 0)+1);
        }

        Map<Character, Integer> strMap = new HashMap();
        for(int i = 0; i < compare.length(); i++ ){
            strMap.put(strArr[i], strMap.getOrDefault(strArr[i], 0)+1);
        }

        if(compareMap.equals(strMap)){
            answer ++;
        }

        int head = compareMap.size(), tail = 0;

        while (head < strArr.length){
            strMap.put(strArr[head], strMap.getOrDefault(strArr[head], 0)+1);

            strMap.put(strArr[tail], strMap.get(strArr[tail])-1);
            if(strMap.get(strArr[tail]) == 0){
                strMap.remove(strArr[tail]);
            }

            if(compareMap.equals(strMap)){
                answer ++;
            }

            head++;
            tail++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Pr04_my04 pr = new Pr04_my04();
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String compare = sc.nextLine();

        System.out.print(pr.solution(str, compare));

    }
}

/***
 *
 * AGSDEGEWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyz
 * WetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabt
 *
 * 위 테스트 코드 결과 180이 나와야하지만
 * 0이 나와서 계속 실패함. 이유를 모르겠다.
 */