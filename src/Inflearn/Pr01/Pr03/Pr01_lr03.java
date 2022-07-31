package Inflearn.Pr01.Pr03;

import java.util.Scanner;

public class Pr01_lr03 {
    private String solution(String inputText) {
        String answer = "";
        int min = 0;
//        int pos;
//
//        while(((pos = inputText.indexOf(' ')) != -1)){
//            String tmp = inputText.substring(0, pos);
//            int len = tmp.length();
//            if (len > min){
//                min = len;
//                answer = tmp;
//            }
//            inputText = inputText.substring(pos+1);
//        }
//        if(inputText.length()>min) {
//            answer = inputText;
//        }
        String[] inputArray = inputText.split(" ");;

        for(String x : inputArray){
            int len = x.length();
            if(len > min){
                min = len;
                answer = x;
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        Pr01_lr03 pr = new Pr01_lr03();
        Scanner sc = new Scanner(System.in);

        String inputText = sc.nextLine();

        System.out.println((pr.solution(inputText)));
    }
}

/**
 * 놀랍게도 substring을 이용하는 복잡한 코드가 실행시간이 가장 빨랐다.
 * 가장 작은 숫자 [Integer.MIN_VALUE]를 두고 비교하며 저장하는 건 좋은 방법인것 같다.
 * 내건 항상 좀 느린편이니 신경써서 코드를 작성해야겠다.
 */