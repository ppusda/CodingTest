package Pr03.Pr06;

import java.util.Scanner;

public class Pr03_fa06 {
    private int solution(int num, int ctt, int[] numArr) {
        int max = 0, head = 0, tail = 0;

        int sum = 0;
        int chk = 0;

        while (head < num) {
            if (chk < ctt) {
                if (numArr[head] == 0) {
                    chk++;
                }
///////////////
                if (chk == ctt) {
                    if (sum > max) {
                        max = sum + chk;

                        if (numArr[head] == 0) {
                            sum += numArr[head++];
                            chk--;
                        } else {
                            sum += numArr[head++];
                        }
                        if (numArr[tail] == 0) {
                            sum -= numArr[tail++];
                            chk--;
                        } else {
                            sum -= numArr[tail++];
                        }
                    }
                }

                //////////
                sum += numArr[head++];
            } else {
                if (numArr[tail] == 0) {
                    chk--;
                }
                sum -= numArr[tail++];

                ///////////////

                if (chk == ctt) {
                    if (sum > max) {
                        max = sum + chk;

                        if (numArr[head] == 0) {
                            sum += numArr[head++];
                            chk--;
                        } else {
                            sum += numArr[head++];
                        }
                        if (numArr[tail] == 0) {
                            sum -= numArr[tail++];
                            chk--;
                        } else {
                            sum -= numArr[tail++];
                        }
                    }
                }

                //////////
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Pr03_fa06 pr = new Pr03_fa06();
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
