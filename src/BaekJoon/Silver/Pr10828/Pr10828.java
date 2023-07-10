package BaekJoon.Silver.Pr10828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Pr10828 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < cnt; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            switch (st.nextToken()) {
                case "push":
                    list.add(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    if(!list.isEmpty()){
                        int lastIdx = list.size()-1;
                        sb.append(list.get(lastIdx)).append("\n");
                        list.remove(lastIdx);
                    }else {
                        sb.append(-1).append("\n");
                    }
                    break;
                case "size":
                    sb.append(list.size()).append("\n");
                    break;
                case "empty":
                    if(list.isEmpty()){
                        sb.append(1).append("\n");
                    }else{
                        sb.append(0).append("\n");
                    }
                    break;
                case "top":
                    if(!list.isEmpty()){
                        int lastIdx = list.size()-1;
                        sb.append(list.get(lastIdx)).append("\n");
                    }else {
                        sb.append(-1).append("\n");
                    }
                    break;
            }

        }
        System.out.print(sb);
    }
}

// sout 으로 바로 출력할려 했었는데, enter 가 자동으로 입력되어지는 이슈를 경험하였다.
// 향후 위와 같은 문제가 발생할 수 있으니 조심해야겠다.