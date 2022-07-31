package Inflearn.Pr01.Pr04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pr01_my04 {
    private List solution(int inputInt, List inputTextList) {
        String answer = "";
        int cnt = 0;

        List reverseTextList = new ArrayList();

        // new StringBuilder().reverse()

        while (cnt < inputInt){
            String tmpText = "";
            String reverseText = inputTextList.get(cnt).toString();
            char[] reverseArray = reverseText.toCharArray();
            for(int j = reverseArray.length-1; 0 <= j; j--){
                tmpText += reverseArray[j];
            }
            reverseTextList.add(tmpText);
            cnt++;
        }

        return reverseTextList;
    }

    public static void main(String[] args) {
        Pr01_my04 pr = new Pr01_my04();
        Scanner sc = new Scanner(System.in);

        List inputTextList = new ArrayList();

        int inputInt = sc.nextInt();
        for(int i = 0; i < inputInt; i++){
            inputTextList.add(sc.next());
        }

        for(Object str : pr.solution(inputInt, inputTextList)){
            System.out.println(str);
        }
    }
}
