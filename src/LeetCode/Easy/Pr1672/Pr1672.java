package LeetCode.Easy.Pr1672;

public class Pr1672 {
    public int maximumWealth(int[][] accounts) {
        int answer = Integer.MIN_VALUE;
        for(int i = 0 ; i < accounts.length ; i++){ // row
            int sum = 0;
            for(int j = 0 ; j < accounts[i].length ;  j++){
                sum += accounts[i][j];
            }
            if(sum > answer){
                answer = sum ;
            }
        }

        return answer;
    }
}
