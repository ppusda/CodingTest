package Algorithm;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] numArr = new int[]{5,3,4,1,2};

        for(int i = 0; i < numArr.length-1; i++){
            for(int j = 0; j < numArr.length-i-1; j ++){
                if(numArr[j] > numArr[j+1]){
                    int tmp = numArr[j];
                    numArr[j] = numArr[j+1];
                    numArr[j+1] = tmp;
                }
            }
        }

        System.out.println(Arrays.toString(numArr));
    }
}
