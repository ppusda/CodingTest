package BaekJoon.Pr2581;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Pr2581_Sol {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;    //소수의 합을 저장할 곳
        int min = 10000; // 소수들 중에서 최소값을 저장할곳 임의로 값을 일단 저장해두었다
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        for (int  i = M; i <= N; i++) { //소수 구하기

                boolean check = true;		// 소수인 경우 true , 아닌경우 false
                if (i == 1) {				//1은 소수가 아니라서 넘어간다
                    continue;
                }

                for (int j = 2; j <=Math.sqrt(i); j++) {
                if (i % j == 0) {
                    check = false;
                }

            }
            if (check) {	//소수일 때
                sum += i;	// 소수의 합을 누적시킨다
                if (min > i) {	//소수들 중에서 최솟값 구하기
                    min = i;
                }
            }
        }
        if (min == 10000) {		//소수 값 없을 시 에는 -1를 출력해준다
            System.out.println(-1);
        } else {
            System.out.println(sum);	//소수의 합
            System.out.println(min);	//소수들중의 최솟값
        }
    }

}
