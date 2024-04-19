// Programmers: 142086_가장 가까운 같은 글자
package Programmers.Lv1.Pr142086;

public class Pr142086 {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];

        String letters = "";
        int index = 0;
        for (String letter : s.split("")) {
            if (letters.contains(letter)) {
                answer[index] = index - letters.lastIndexOf(letter);
            } else {
                answer[index] = -1;
            }

            letters += letter;
            index ++;
        }

        return answer;
    }
}
