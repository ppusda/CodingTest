package Inflearn.Pr05.Pr06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pr05_my06 {
    private int solution(int tot, int cnt) {
        int answer = 0;

        List<Integer> totList = new ArrayList<>();
        for(int i = 1; i <= tot; i ++){
            totList.add(i);
        }

        int cntNum = 1;
        while(true){
            for (int j = 0; j < totList.size(); j++) {
                if(cnt != cntNum) {
                    cntNum ++;
                }else{
                    totList.remove(j);
                    j --;
                    cntNum = 1;
                }
            }
            if(totList.size() == 1){
                break;
            }
        }
        answer = totList.get(0);

        return answer;
    }

    public static void main(String[] args) {
        Pr05_my06 pr = new Pr05_my06();
        Scanner sc = new Scanner(System.in);

        int tot = sc.nextInt();
        int cnt = sc.nextInt();


        System.out.println(pr.solution(tot, cnt));
    }
}
