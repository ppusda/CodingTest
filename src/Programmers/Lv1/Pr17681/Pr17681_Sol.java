package Programmers.Lv1.Pr17681;

public class Pr17681_Sol {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String temp;

        for(int i = 0 ; i < n ; i++){
            temp = String.format("%16s", Integer.toBinaryString(arr1[i] | arr2[i])); // 비트 or 연산
            temp = temp.substring(temp.length() - n); // 오버 되는 부분 자르기
            temp = temp.replaceAll("1", "#");
            temp = temp.replaceAll("0", " ");
            answer[i] = temp;
        }

        return answer;
    }
}
