package LeetCode.Easy.Pr1221;

public class Pr1221_Sol {
    public int balancedStringSplit(String s) {
        int count = 0;
        int chr = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'R') chr++; else chr--; // rCheck만 두고 증감
            if (chr == 0) count++;
        }
        return count;
    }
}
