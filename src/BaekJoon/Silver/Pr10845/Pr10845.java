package BaekJoon.Silver.Pr10845;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Pr10845 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        int size = 0;
        List<Integer> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < cnt; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            switch (st.nextToken()) {
                case "push":
                    list.add(Integer.parseInt(st.nextToken()));
                    size ++;
                    break;
                case "pop":
                    if(!list.isEmpty()){
                        sb.append(list.get(0)).append("\n");
                        list.remove(0);
                        size --;
                    }else {
                        sb.append(-1).append("\n");
                    }
                    break;
                case "size":
                    sb.append(size).append("\n");
                    break;
                case "empty":
                    if(list.isEmpty()){
                        sb.append(1).append("\n");
                    }else{
                        sb.append(0).append("\n");
                    }
                    break;
                case "front":
                    if(!list.isEmpty()){
                        sb.append(list.get(0)).append("\n");
                    }else {
                        sb.append(-1).append("\n");
                    }
                    break;
                case "back":
                    if(!list.isEmpty()){
                        int lastIdx = list.size()-1;
                        sb.append(list.get(lastIdx)).append("\n");
                    }else {
                        sb.append(-1).append("\n");
                    }
            }

        }
        System.out.print(sb);
    }
}