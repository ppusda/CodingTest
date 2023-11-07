package Programmers.Lv1.Pr131705;

public class Pr131705 {

    public static int solution(int[] number) {
        int answer = 0;

        for(int i = 0; i < number.length-2; i++) {
            for(int j = i+1; j < number.length-1; j++) {
                for(int k = j+1; k < number.length; k++) {
                    if(number[i] + number[j] + number[k] == 0) {
                        answer ++;
                    }
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = new int[1000];
        for(int i = 0 ; i < 1000; i++){
            int tmp = (int) Math.floor(Math.random() * 1000);
            if(i % 2 == 0) {
                arr[i] = -tmp;
            }else {
                arr[i] = tmp;
            }
        }

        long beforeTime = System.currentTimeMillis();

        System.out.println(solution(arr));

        long afterTime = System.currentTimeMillis();
        long secDiffTime = (afterTime - beforeTime);
        System.out.println("시간차이(ms) : "+secDiffTime);
    }
}
