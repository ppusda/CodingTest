package LeetCode.Easy.Pr13;

import java.util.Objects;

public class Pr13 {
    public int romanToInt(String s) {
        int answer = 0;
        String[] strings = s.split("");

        for (int i = 0; i < strings.length; i++) {
            switch (strings[i]) {
                case "M":
                    answer += 1000;
                    break;
                case "D":
                    answer += 500;
                    break;
                case "C":
                    if (i+1 < strings.length) {
                        if (strings[i+1].equals("M")) {
                            answer += 900;
                            i++;
                            break;
                        }

                        if (strings[i+1].equals("D")) {
                            answer += 400;
                            i++;
                            break;
                        }
                    }
                    answer += 100;
                    break;
                case "L":
                    answer += 50;
                    break;
                case "X":
                    if (i+1 < strings.length) {
                        if (strings[i+1].equals("C")) {
                            answer += 90;
                            i++;
                            break;
                        }
                        if (strings[i+1].equals("L")) {
                            answer += 40;
                            i++;
                            break;
                        }
                    }
                    answer += 10;
                    break;
                case "V":
                    answer += 5;
                    break;
                case "I":
                    if (i+1 < strings.length) {
                        if (strings[i+1].equals("X")) {
                            answer += 9;
                            i++;
                            break;
                        }
                        if (strings[i+1].equals("V")) {
                            answer += 4;
                            i++;
                            break;
                        }
                    }
                    answer += 1;
                    break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(new Pr13().romanToInt("MCMXCIV"));
    }
}
