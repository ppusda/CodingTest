package Pr01.Pr11;

import java.util.Scanner;

public class Pr01_my11 {
    private String solution(String inputText) {
        StringBuilder answer = new StringBuilder();

        int cnt = 1;
        char[] charArray = inputText.toCharArray();

        for(int i = 0; i < inputText.length(); i ++){
            if(i == inputText.length()-1){
                if(charArray[i] == charArray[i-1]){
                    answer.append(charArray[i]).append(cnt);
                }else{
                    answer.append(charArray[i]);
                }
                break;
            }
            if(charArray[i] == charArray[i+1]){
                cnt ++;
            }else{
                if(cnt > 1){
                    answer.append(charArray[i]).append(cnt);
                }else{
                    answer.append(charArray[i]);
                }

                cnt = 1;
            }
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        Pr01_my11 pr = new Pr01_my11();
        Scanner sc = new Scanner(System.in);

        String inputText = sc.next();

        System.out.println(pr.solution(inputText));
    }

    /**
     * 같은 매커니즘인데 코드양이 엄청 차이난다.
     * 앞으로는 좀 더 간결화하는 것에도 신경을 써보는게 좋을 것 같다.
     */
}
