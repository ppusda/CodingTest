package Programmers.Lv0.Pr120893;

public class Pr120893 {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();

        for(char ch: my_string.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                sb.append(Character.toLowerCase(ch));
                continue;
            }
            sb.append(Character.toUpperCase(ch));
        }
        return sb.toString();
    }
}
// return myString.chars().mapToObj(operand -> String.valueOf((char) (Character.isLowerCase(operand) ? Character.toUpperCase(operand) : Character.toLowerCase(operand)))).collect(Collectors.joining());
// 재밌는 stream ㅋㅋ 성능과 가독성은 없다...
