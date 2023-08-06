package BaekJoon.Silver.Pr11279;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pr11279_Sol {
    public static int [] heap = new int[100001];
    public static int size = 0;
    public static StringBuilder sb = new StringBuilder();

    public static void swap(int x, int y) {
        int temp = heap[x];
        heap[x] = heap[y];
        heap[y] = temp;
    }
    public static void push(int x) {
        heap[++size] = x;
        //삽입한 것 부터 힙인지 확인, 힙이아니면 계속 부모노드로 올라가고 힙이면 break
        for(int i=size; i>1; i/=2) {
            if(heap[i/2] < heap[i]) {
                swap(i/2, i);
            } else {
                break;
            }
        }
    }

    public static void pop() {
        sb.append(heap[1]+"\n");
        heap[1] = heap[size];
        heap[size--] = 0;
        for(int i=1; i*2<=size;) { //삭제 후 1에서 부터 힙으로 만들어주는 과정
            if(heap[i] > heap[i*2] && heap[i] > heap[i*2+1]) {
                break;
            }else if(heap[i*2] > heap[i*2+1]) {
                swap(i, i*2);
                i = i*2;
            } else {
                swap(i, i*2+1);
                i = i*2+1;
            }
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        for(int i=0; i<n; i++) {
            int k = Integer.parseInt(reader.readLine());
            if(k==0) {
                if(size == 0) {
                    sb.append(0+"\n");
                } else {
                    pop();
                }
            } else {
                push(k);
            }
        }
        System.out.print(sb.toString());
    }
}

/**
 * 실제 힙을 구현한 방법
 *
 * 여기서 Heap 이란?
 *  - 지금 까지는 그저 자바의 GC를 관리할 때 이용하는 자료구조인 줄로만 알고 있었음
 *  - 힙은 완전 이진 트리의 일종으로, 우선순위 큐를 구현하기 위해 만들어진 자료구조이다.
 *  - 종류로는 최대 힙과 최소 힙이 존재하며 보통 배열로 구현된다.
 *
 *  - 최대 힙(max heap)
 *    - 부모 노드의 키 값이 자식 노드의 키 값보다 크거나 같은 완전 이진 트리
 *  - 최소 힙(min heap)
 *    - 부모노드의 키 값이 자식노드의 키 값보다 작거나 같은 완전 이진 트리
 *
     * 힙을 저장하는 표준적인 자료구조는 배열이다.
     * 구현을 쉽게 하기 위하여 배열의 첫 인덱스인 0은 사용되지 않는다.
     * 특정 위치의 노드 번호는 새로운 노드가 추가되어도 변하지 않는다.
     *   - 예를 들어 루트 노드의 오른쪽 노드의 번호는 항상 3이다.
     * 힙에서 부모노드와 자식 노드의 관계
     *   - 왼쪽 자식의 인덱스 = (부모의 인덱스) 2
     *   - 오른쪽 자식의 인덱스 = (부모의 인덱스) * 2 + 1
     *   - 부모의 인덱스 = (자식의 인덱스) / 2
 *
 *  https://velog.io/@holicme7/%EC%9E%90%EB%A3%8C%EA%B5%AC%EC%A1%B0-%ED%9E%99heap-ktk49na9c3
 */