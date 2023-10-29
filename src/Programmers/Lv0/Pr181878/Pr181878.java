package Programmers.Lv0.Pr181878;

public class Pr181878 {
    public int solution(String myString, String pat) {
        return myString.toLowerCase().contains(pat.toLowerCase()) ? 1:0;
    }
}
