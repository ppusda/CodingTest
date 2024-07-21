package LeetCode.Easy.Pr2942;

import java.util.ArrayList;
import java.util.List;

public class Pr2942_Sol {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<words.length; i++){
            if(words[i].indexOf(x)!= -1){
                list.add(i);
            }
        }
        return list;

    }
}
