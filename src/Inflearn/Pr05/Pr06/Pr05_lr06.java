package Inflearn.Pr05.Pr06;

import java.util.*;

public class Pr05_lr06 {
    private int solution(int tot, int cnt) {
        int answer = 0;
        int count = 1;
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 1; i <= tot; i++){
            queue.offer(i);
        }
        while(!queue.isEmpty()){
            if(count == cnt){
                queue.poll();
                count = 1;
            }else{
                queue.offer(queue.poll());
                count++;
            }
            if(queue.size() == 1){
                answer = queue.poll();
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Pr05_lr06 pr = new Pr05_lr06();
        Scanner sc = new Scanner(System.in);

        int tot = sc.nextInt();
        int cnt = sc.nextInt();


        System.out.println(pr.solution(tot, cnt));
    }
}
