import java.util.Scanner;
import java.util.stream.IntStream;

public class test {
    private int solution(int num, int target, int[] arr) {
        int start = 0, end = 0;
        int sum = 0, cnt = 0;

        while(end < num){
            if(sum > target){
                cnt ++;
                sum -= arr[start];
                start ++;
            }else{
                sum += arr[end];
                end ++;
            }
        }
        if(sum > target) {
            cnt++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        test pr = new test();

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int target = sc.nextInt();
        int[] arr = new int[num];
        for(int i = 0; i < num; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(pr.solution(num, target, arr));
    }
}
