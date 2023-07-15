package BaekJoon.Silver.Pr10866;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Pr10866 {

    private static List<Integer> arrList = new ArrayList<>();
    private static int length = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < cnt; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            switch (st.nextToken()) {
                case "push_front":
                    push_front(Integer.parseInt(st.nextToken()));
                    break;
                case "push_back":
                    push_back(Integer.parseInt(st.nextToken()));
                    break;
                case "pop_front":
                    if(empty() == 1){
                        sb.append(-1).append("\n");
                    }else{
                        sb.append(pop_front()).append("\n");
                    }
                    break;
                case "pop_back":
                    if(empty() == 1){
                        sb.append(-1).append("\n");
                    }else{
                        sb.append(pop_back()).append("\n");
                    }
                    break;
                case "size":
                    sb.append(size()).append("\n");
                    break;
                case "empty":
                    sb.append(empty()).append("\n");
                    break;
                case "front":
                    if(empty() == 1){
                        sb.append(-1).append("\n");
                    }else{
                        sb.append(front()).append("\n");
                    }
                    break;
                case "back":
                    if(empty() == 1){
                        sb.append(-1).append("\n");
                    }else{
                        sb.append(back()).append("\n");
                    }
                    break;
            }
        }

        System.out.print(sb);
    }

    public static void push_front(int n) {
        arrList.add(0, n);
        length ++;
    }

    public static void push_back(int n) {
        arrList.add(n);
        length ++;
    }

    public static int pop_front() {
        int tmp = arrList.get(0);
        arrList.remove(0);
        length--;
        return tmp;
    }

    public static int pop_back() {
        int tmp = arrList.get(length-1);
        arrList.remove(length-1);
        length--;
        return tmp;
    }

    public static int size() {
        return length;
    }

    public static int empty() {
        if(arrList.isEmpty()){
            return 1;
        }else{
            return 0;
        }
    }

    public static int front() {
        return arrList.get(0);
    }

    public static int back() {
        return arrList.get(length-1);
    }
}
