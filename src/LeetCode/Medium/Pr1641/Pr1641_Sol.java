package LeetCode.Medium.Pr1641;

public class Pr1641_Sol {
    public int countVowelStrings(int n) {
        return (n + 4) * (n + 3) * (n + 2) * (n + 1) / 24;
    }

    public static void main(String[] args) {
        System.out.println(new Pr1641_Sol().countVowelStrings(3));
    }
}
