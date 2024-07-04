package Programmers.Lv1.Pr42840;

import java.util.ArrayList;

public class Pr42840 {
    public int[] solution(int[] answers) {

        int[] answer = {};

        int[] supo1 = {1,2,3,4,5};
        int[] supo2 = {2,1,2,3,2,4,2,5};
        int[] supo3 = {3,3,1,1,2,2,4,4,5,5};

        int supo_answer1 = supo(supo1, answers);
        int supo_answer2 = supo(supo2, answers);
        int supo_answer3 = supo(supo3, answers);

        int max = Math.max(Math.max(supo_answer1, supo_answer2), supo_answer3);
        ArrayList<Integer> list = new ArrayList<Integer>();

        if(max == supo_answer1){
            list.add(1);
        }
        if(max == supo_answer2){
            list.add(2);
        }
        if(max == supo_answer3){
            list.add(3);
        }

        answer = new int[list.size()];

        for(int i = 0; i < answer.length; i++){
            answer[i] = list.get(i);
        }

        return answer;
    }

    public int supo(int[] supo, int[] answers){
        int cnt_supo = 0;
        int chk_supo = 0;

        for(int i = 0; i < answers.length; i++){
            if(supo[cnt_supo] == answers[i]){
                chk_supo ++;
            }

            if(cnt_supo == supo.length-1){
                cnt_supo = 0;
            }else{
                cnt_supo ++;
            }

        }

        return chk_supo;
    }

}
