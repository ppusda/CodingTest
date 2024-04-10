// Programmers: 181926_수 조작하기 1
package Programmers.Lv0.Pr181926;

public class Pr181926 {
    public int solution(int n, String control) {
        for (String str: control.split("")) {
            switch (str) {
                case "w" -> n++;
                case "s" -> n--;
                case "d" -> n += 10;
                case "a" -> n -= 10;
            }
        }

        return n;
    }
}
