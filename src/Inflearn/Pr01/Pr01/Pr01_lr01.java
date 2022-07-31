package Inflearn.Pr01.Pr01;

import java.util.Scanner;

public class Pr01_lr01 {
    public int solution(String str, char t){
        int answer = 0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);

//        for (int i = 0; i < str.length(); i++){
//            if(str.charAt(i) == t){
//                answer++;
//            }
//        }

        for (char x : str.toCharArray()){
            if(x == t){
                answer++;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Pr01_lr01 lr01 = new Pr01_lr01();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);

        System.out.println(lr01.solution(str, c));
    }

    /**
     *  String
     *  str.charAt() 을 통해서 문자열을 하나씩 가져올 수 있다.
     *  바보 같이 배열에 넣을 필요 없음...
     *
     *  foreach를 이용해서
     *  .toCharArray()로 String을 배열로 만들어 하나씩 읽어올 수 있음.
     *
     */

}
