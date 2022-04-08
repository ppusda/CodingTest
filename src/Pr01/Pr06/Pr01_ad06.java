package Pr01.Pr06;

import java.util.*;
import java.util.stream.Collectors;

public class Pr01_ad06 {
    private String solution(String inputText) {
        String answer = "";

        char[] inputTextArray = inputText.toCharArray();
        Set<Character> chkTextSet = new LinkedHashSet<>();

        for(char x : inputTextArray){
            if(!chkTextSet.contains(x)){
                chkTextSet.add(x);
            }
        }

        answer = chkTextSet.stream()
                .map(Object::toString)
                .collect(Collectors.joining("")).toString();

        return answer;
    }

    public static void main(String[] args) {
        Pr01_ad06 pr = new Pr01_ad06();
        Scanner sc = new Scanner(System.in);

        String inputText = sc.next();

        System.out.println(pr.solution(inputText));
    }
    /**
     * Set을 이용한 중복제거를 해보았다.
     * LinkedHashSet을 통해서 순서를 잃지 않도록 하였다.
     */
}