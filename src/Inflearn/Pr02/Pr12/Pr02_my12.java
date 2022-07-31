package Inflearn.Pr02.Pr12;

import java.util.*;

public class Pr02_my12 {
    private int solution(int student, int exam, int[][] inputArr) {
        int answer = 0;

        List<Map<Integer, Integer>> noc = new ArrayList<>();

        for (int i = 0; i < exam; i++){
            for(int j = 0; j < student-1; j++){
                for (int k = j+1; k < student; k++){
                    Map map = new HashMap();
                    map.put(inputArr[i][j], inputArr[i][k]);
                    noc.add(map);
                }
            }
        }

        int idx = 0;
        while (idx < noc.size()){
            int cnt = Collections.frequency(noc, noc.get(idx));
            if(cnt == exam){
                noc.remove(noc.get(idx));
                answer ++;
                continue;
            }
            idx++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Pr02_my12 pr = new Pr02_my12();
        Scanner sc = new Scanner(System.in);

        int student = sc.nextInt();
        int exam = sc.nextInt();
        int[][] inputArr = new int[exam][student];

        for(int i = 0; i < exam; i++){
            for(int j = 0; j < student; j++){
                inputArr[i][j] = sc.nextInt();
            }
        }

        System.out.println(pr.solution(student, exam, inputArr));
    }

}