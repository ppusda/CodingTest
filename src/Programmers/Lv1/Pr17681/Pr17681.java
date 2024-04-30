package Programmers.Lv1.Pr17681;

public class Pr17681 {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] map = new String[n];

        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            String arr1Crypto = String.format("%0"+n+"d", Long.parseLong(Long.toBinaryString(arr1[i])));
            String arr2Crypto = String.format("%0"+n+"d", Long.parseLong(Long.toBinaryString(arr2[i])));

            for (int j = 0; j < n; j++) {
                if (arr1Crypto.charAt(j) == '1') {
                    sb.append("#");
                    continue;
                }

                if (arr2Crypto.charAt(j) == '1') {
                    sb.append("#");
                    continue;
                }

                sb.append(" ");
            }

            map[i] = sb.toString();
        }

        return map;
    }

    public static void main(String[] args) {
        new Pr17681().solution(5, new int[] {9, 20, 28, 18, 11}, new int[] {30, 1, 21, 17, 28});
    }
}
