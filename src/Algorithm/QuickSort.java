package Algorithm;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] array = new int[] {4, 8, 2, 5, 7, 6, 3, 9, 1};
        int n = array.length;

        new QuickSort().quickSort(array, 0, n-1);
        System.out.println(Arrays.toString(array));
    }

    private void quickSort(int[] array, int left, int right) {
        if (left < right) {
            int partitioned = partition(array, left, right);

            quickSort(array, left, partitioned-1);
            quickSort(array, partitioned+1, right);
        }
    }

    private int partition(int[] array, int left, int right) {
        int low = left+1;
        int high = right;
        int pivot = array[left];

        while (low <= high) {
            while (low < right && array[low] < pivot) {
                low++;
            }

            while (high > left && array[high] > pivot) {
                high--;
            }

            if (low<high) {
                int tmp = array[low];
                array[low] = array[high];
                array[high] = tmp;
            }else {
                break;
            }
        }

        int tmp = array[left];
        array[left] = array[high];
        array[high] = tmp;

        return high;
    }
}
