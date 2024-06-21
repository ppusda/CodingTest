package LeetCode.Medium.Pr869;

import java.util.Arrays;

public class Pr869 {
    public boolean reorderedPowerOf2(int n) {
        char[] number = sortedDigits(n);

        for (int i = 0; i < 30; ++i) { // 30 이상은 수가 급격하게 커지기에 배제
            char[] powerOfTwo = sortedDigits(1 << i);
            if (Arrays.equals(number, powerOfTwo))
                return true;
        }
        return false;
    }

    private char[] sortedDigits(int n) {
        char[] digits = String.valueOf(n).toCharArray();
        Arrays.sort(digits);
        return digits;
    }

    public static void main(String[] args) {
        System.out.println(new Pr869().reorderedPowerOf2(1));
    }
}
