package Algorithm;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] numArr = new int[]{9,6,7,3,5};

        for(int i = 0; i < numArr.length-1; i++){
            int idx = i;
            for(int j = i; j < numArr.length; j ++){
                if(numArr[j] < numArr[idx]){
                    idx = j;
                }
            }
            int tmp = numArr[i];
            numArr[i] = numArr[idx];
            numArr[idx] = tmp;
        }

        System.out.println(Arrays.toString(numArr));
    }
}
