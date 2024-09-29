package BaekJoon.Gold.Pr2252;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Pr2252 {

    private static List<List<Integer>> list;
    private static StringBuffer answer;
    private static int N;
    private static int[] count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        count = new int[N+1];
        list = new ArrayList<>();
        answer = new StringBuffer();

        for (int i = 0; i <= N; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());

            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            list.get(A).add(B);
            count[B]++; // 해당 노드로의 방향이 있는 경우에는 다른 노드에서의 길이 있는 경우이기 때문에 탐색하도록 count를 증가
            // ex) 1 3 이라면, 1이 3보다 앞에 있어야 함, 이는 3으로 향하는 간선이 두 개라는 뜻
        }

        //위상 정렬
        topologicalSort();

        System.out.println(answer);
    }

    private static void topologicalSort(){
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i<=N; i++) {
            if(count[i] == 0) { // 해당 노드로의 방향이 더 이상 없을 경우에 큐에 추가
                queue.offer(i); // 해당 노드를 이용했다는 개념으로 큐에 추가한다고 생각하면 됨
            }
        }


        for (int i = 0; i < N; i++) {
            if (!queue.isEmpty()) {
                int node = queue.poll();
                answer.append(node).append(" "); // 방향이 더 이상 없는 경우, 노드를 거쳤음을 표기하기 위해 StringBuffer에 추가

                for (int j = 0; j < list.get(node).size(); j++) { // 인접리스트 탐색
                    int index = list.get(node).get(j);
                    count[index]--; // 해당 노드에서 갈 수 있는 방향의 count 감소 (간선 사용)

                    if (count[index] == 0) { // 간선을 타고 이동했을 때, 만약 더 이상 해당 노드로 접근할 타 노드가 없을 경우
                        if (list.get(index).isEmpty()) {
                            answer.append(index).append(" "); // 방향이 더 이상 없는 경우, 노드를 거쳤음을 표기하기 위해 StringBuffer에 추가
                            continue;
                        }
                        queue.offer(list.get(node).get(j)); // 해당 노드를 완료 했음 처리하기 위해 큐에 추가
                    }
                }
            }
        }

    }
}
/***
 *  위와 같은 방식을 반복하여 순서를 정함
 *  4 2
 *  3 1
 *  이 입력 됬을 경우
 *
 *  3과 4의 count가 0이다. == 3과 4로 향하는 간선이 없다.
 *  3과 4를 완료 처리하고, 인접리스트를 통해 다른 노드로 향하는 간선이 있는지 확인한다.
 *
 *  3의 경우는 1, 4의 경우는 2로 이동할 수 있다.
 *  3을 답에 추가하고 간선을 사용해서 해당 노드로 이동하고 1의 경우는 큐에 추가
 *  이어서 4를 답에 추가하고 간선을 사용해서 해당 노드로 이동하고 2의 경우는 큐에 추가
 *
 *  1과 2는 둘 다 count가 0이 되었으니 답에 순서대로 추가
 *  답은 3 4 1 2
 *
 *  백준 테스트케이스 2번의 답은 4 2 3 1이라고 써있다.
 *  이는 "답이 여러 가지인 경우에는 아무거나 출력한다." 라는 전제가 깔려있으며,
 *  3 4 1 2 나 4 2 3 1 둘 다 4가 2앞에 있고, 3이 1 앞에 있음을 만족하기 때문에 상관 없는 것이다. (단순 출력단의 차이인 것이다.)
 *  실제로 위 조건문을 추가하면 3 4 1 2로 출력되며 이 또한 정답임을 볼 수 있다.
 */