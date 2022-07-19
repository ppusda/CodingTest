package Pr09.Pr07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Edge implements Comparable<Edge>{
    int start, end, cost;

    public Edge(int start, int end, int cost) {
        this.start = start;
        this.end = end;
        this.cost = cost;
    }

    @Override
    public int compareTo(Edge o) {
        return this.cost - o.cost;
    }
}

public class Pr09_my07 {
    private static int answer = 0;
    private static int[] unf;
    private static int city, road;

    private static int Find(int v){
        if(unf[v] == v){
            return v;
        }else{
            return unf[v] = Find(unf[v]);
        }
    }
    private static void Uion(int a, int b){
        int fa = Find(a);
        int fb = Find(b);
        if(fa != fb){
            unf[fa] = fb;
        }
    }

    public static void main(String[] args) {
        Pr09_my07 pr = new Pr09_my07();
        Scanner sc = new Scanner(System.in);

        city = sc.nextInt();
        road = sc.nextInt();

        unf = new int[city+1];
        ArrayList<Edge> arr = new ArrayList<>();
        for(int i = 1; i <= city; i++){
            unf[i] = i;
        }
        for(int i = 0; i < road; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            arr.add(new Edge(a, b, c));
        }

        Collections.sort(arr);
        for (Edge edge : arr) {
            int fc = Find(edge.start);
            int fr = Find(edge.end);
            if(fc != fr){
                answer += edge.cost;
                Uion(edge.start, edge.end);
            }
        }

        System.out.println(answer);
    }
}
/**
 * 크루스칼 : Find & Uion
 * 이전에 배웠던 Find & Uion을 이용해서 풀 수 있었다.
 *
 * 시작과 끝의 노드를 검색해서 같은 값이라면 이미 집합(이어져있음)이므로 넘어가고,
 * 다른 값이라면 같은 집합으로 만들어준다.
 * (+ 최소 집합 값(Cost)를 구하기 위해 Answer에 값을 더해준다.
 *
 * Find, Uion 메서드는 기억해두자.
 * private int Find(int v){
 *     if(unf[v] == v){
 *         return v;
 *     } else{
 *         return unf[v] = Find(unf[v]);
 *     }
 * }
 *
 * private void Uion(int a, int b){
 *     int fa = Find(a);
 *     int fb = Find(b);
 *     if(fa != fb){
 *         unf[fa] = fb;
 *     }
 * }
 */
