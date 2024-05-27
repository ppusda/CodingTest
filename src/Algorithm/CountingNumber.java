package Algorithm;

public class CountingNumber {

    private static int max = 10000;

    public static void main(String[] args) {
        System.out.println(countNumber(8));
    }

    private static int countNumber(int n) {
        int count = 0;

        for (int i = 1; i <= max; i++) {
            int target = i;
            while (target > 0) {
                if (target % 10 == n) count++;
                target /= 10;
            }
        }

        return count;
    }

}
