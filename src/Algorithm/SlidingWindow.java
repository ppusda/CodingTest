package Algorithm;

public class SlidingWindow {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 7, 4, 1};
        int len = 3;
        int answer, sum = 0;

        for(int i = 0; i < len; i++){ // sum의 초기 값 설정
            sum += arr[i];
        }
        answer = sum;

        for(int i = len; i < arr.length; i++){
            sum += arr[i] - arr[i-len]; // arr[i]는 window의 다음 숫자, arr[i-len]은 window의 첫번째 숫자
            if(sum > answer) {
                answer = sum;
            }
        }

        System.out.println(answer);
    }
}
