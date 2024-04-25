package Programmers.Lv0.Pr181854;

public class Pr181854 {
    public int[] solution(int[] arr, int n) {
        int size = arr.length;
        boolean even = size%2 == 0;
        int start = even ? 1 : 0;

        for (int i = start; i < size; i+=2) {
            arr[i] += n;
        }

        return arr;
    }
}
