package BaekJoon.Pr2309;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Pr2309 {

    private static ArrayList<Integer> dwarfList = new ArrayList();

    public static void main(String[] args) throws IOException { // 코드 길이가 길어서 그렇지 좀 더 효율적이었다...
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int target = 0;

        ArrayList<Integer> resList = new ArrayList<>();

        for(int i = 0; i < 9; i++){
            int tmp = Integer.parseInt(br.readLine());
            dwarfList.add(tmp);
            resList.add(tmp);
            target += tmp;
        }

        target -= 100;
        Collections.sort(dwarfList);
        Collections.sort(resList);

        int flag = 0;
        for (int j: dwarfList) {
            if(flag == 1) {
                break;
            }
            for (int k: dwarfList) {
                if(j + k == target){
                    resList.remove((Integer) j);
                    resList.remove((Integer) k);
                    flag = 1;
                }
            }
        }

        for (int l: resList) {
            System.out.println(l);
        }
    }
}
