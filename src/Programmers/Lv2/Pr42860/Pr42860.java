package Programmers.Lv2.Pr42860;
public class Pr42860 {
    public int solution(String name) {
        int count = 0;
        int length = name.length();
        int move = length-1; // 순서대로 가는 이동 수
        char[] chars = name.toCharArray();
        for (int i = 0; i < length; i++) { // 65 ~ 90, 총 26개
            if (chars[i] != 'A') {
                count += Math.min(chars[i]-'A', 'Z'-chars[i]+1); // +1은 A->Z로 이동
            }

            int next = i+1;
            while (next < length && chars[next] == 'A') {
                next ++;
            }
            move = Math.min(move, i*2+length-next); // 순서대로 가는 이동 수와, 뒤로 돌아가는 이동 수 중 더 적은 것을 선택
            move = Math.min(move, (length-next)*2 + i); // 처음부터 뒷부분을 먼저 입력하는 것이 더 빠른 경우도 고려
        }

        return count + move;
    }


    public static void main(String[] args) {
        System.out.println(new Pr42860().solution("BBAAAAB"));
    }
}

/***
 *
 */
