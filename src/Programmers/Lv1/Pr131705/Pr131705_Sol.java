package Programmers.Lv1.Pr131705;

public class Pr131705_Sol {
    static int count;
    static boolean[] visited;

    public static int solution(int[] number) {
        int answer = 0;
        visited = new boolean[number.length];

        dfs(number, number.length, 0, 3); // nCr 3개 고르기
        answer = count;
        return answer;
    }

    public static void dfs(int[] numbers, int n, int start, int r){
        if(r == 0){
            int sum =0;
            for(int i =0 ; i< n; i++){
                if(visited[i]){
                    sum += numbers[i];
                }
            }
            if(sum == 0){
                count++;
            }
            return;
        }

        for(int i = start ; i< n; i++){
            if(!visited[i]){
                visited[i] = true;
                dfs(numbers, n, i, r-1 );
                visited[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[1000];
        for(int i = 0 ; i < 1000; i++){
            int tmp = (int) Math.floor(Math.random() * 1000);
            if(i % 2 == 0) {
                arr[i] = -tmp;
            }else {
                arr[i] = tmp;
            }
        }

        long beforeTime = System.currentTimeMillis();

        System.out.println(solution(arr));

        long afterTime = System.currentTimeMillis();
        long secDiffTime = (afterTime - beforeTime)/1000;
        System.out.println("시간차이(m) : "+secDiffTime);
    }

}

// 131705는 Bruteforce 문제로 많이 풀린 것 같다.
//
