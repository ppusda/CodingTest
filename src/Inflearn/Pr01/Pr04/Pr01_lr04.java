package Inflearn.Pr01.Pr04;

import java.util.ArrayList;
import java.util.Scanner;

public class Pr01_lr04 {
    private ArrayList<String> solution(int inputInt, String[] inputTextList) {
        ArrayList<String> answer = new ArrayList<>();
//        for(String x : inputTextList){
//            String tmp = new StringBuilder(x).reverse().toString();
//            answer.add(tmp);
//        }

        for(String x : inputTextList){
            char[] s = x.toCharArray();
            int lt = 0, rt = x.length()-1;
            while(lt < rt){
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt ++;
                rt --;
            }
            String tmp = String.valueOf(s);
            answer.add(tmp);
        }

        return answer;
    }

    public static void main(String[] args) {
        Pr01_lr04 pr = new Pr01_lr04();
        Scanner sc = new Scanner(System.in);

        int inputInt = sc.nextInt();
        String[] inputTextList = new String[inputInt];
        for(int i=0; i<inputInt; i++){
            inputTextList[i] = sc.next();
        }
        for(String x : pr.solution(inputInt, inputTextList)){
            System.out.println(x);
        }
    }

    /**
     * StringBuilder를 사용하여 reverse().toString()을 통해 뒤집어진 문자열을 반환받을 수 있다.
     *
     * Valueof는 Static으로 선언된 메서드
     *
     * ArrayList를 너무 안쓰려는 것도 잘못된 것 같다.
     * 오늘은 답안 중 하나가 내 것보다 느렸다...
     * 하지만 구현 난이도는 보다 간편한 것 같아 아직 갈 길이 먼게 느껴진다.
     *
     * */

}
