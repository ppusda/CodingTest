package Inflearn.Pr03.Pr06;

import java.util.Scanner;

public class Pr03_lr06 {
    private int solution(int num, int ctt, int[] numArr) {
        int answer = 0, cnt = 0, lt = 0;
        for(int rt = 0; rt < num; rt ++){
            if(numArr[rt] == 0){
                cnt ++;
            }
            while(cnt > ctt){
                if(numArr[lt] == 0){
                    cnt --;
                }
                lt ++;
            }
            answer = Math.max(answer, rt - lt + 1);
        }

        return answer;
    }

    public static void main(String[] args) {
        Pr03_lr06 pr = new Pr03_lr06();
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int ctt = sc.nextInt();
        int[] numArr = new int[num];
        for(int i = 0; i < num; i++){
            numArr[i] = sc.nextInt();
        }

        System.out.println(pr.solution(num, ctt, numArr));
    }
}
/**
 * 엄청난 코드차이..
 * rt는 1로 바꾸는 부분을 카운팅해 올리고
 * 반대로 lt는 그걸 낮추면서 (rt - lt +1) 과 같은 식으로 길이를 구한다.
 * 위 같은 식을 알 수 없다면 많이 힘들거 같다.
 */
