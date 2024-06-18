package LeetCode.Medium.Pr1529;

public class Pr1529 {
    public int minFlips(final String target) {
        final char[] array = target.toCharArray();

        int count = 0;
        char prev = '0';

        for (char c : array) {
            if (prev != c) count++;
            prev = c;
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(new Pr1529().minFlips("10111"));
    }
}
