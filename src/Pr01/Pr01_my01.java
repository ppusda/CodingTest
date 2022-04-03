package Pr01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pr01_my01 {
    public static int solution(String inputString, String inputChk){
        int cnt = 0;
        int chk = 0;

        List inputList = new ArrayList();

        while (cnt < inputString.length()){
            inputList.add(inputString.substring(cnt, cnt+1));
            cnt ++;
        }

        for (int i = 0; i < inputList.size(); i++){
            String inputStringUpper = ((String)inputList.get(i)).toUpperCase();
            String inputChkUpper = inputChk.toUpperCase();
            if(inputStringUpper.equals((inputChkUpper))){
                chk ++;
            }
        }
        return chk;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String inputString = in.next();
        String inputCheck = in.next();

        int chk = solution(inputString, inputCheck);

        System.out.println(chk);
    }
}