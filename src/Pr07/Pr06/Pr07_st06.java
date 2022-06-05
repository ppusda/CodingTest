package Pr07.Pr06;

public class Pr07_st06 {
    static int n;
    static int[] ch;
    public void DFS(int L){
        if(L == n+1){
            String tmp = "";
            for(int i = 1; i <= n; i++){
                if(ch[i] == 1){
                    tmp += i + " ";
                }
            }
            if(tmp.length() > 0){
                System.out.println(tmp);
            }
        }else{
            ch[L] = 1; // 사용한다.
            DFS(L+1);

            ch[L] = 0; // 사용하지 않는다.
            DFS(L+1);
        }
    }

    public static void main(String[] args) {
        Pr07_st06 pr = new Pr07_st06();
        n = 3;
        ch = new int[n+1];
        pr.DFS(1);
    }

}

/**
 * 부분 집합을 구하는 문제이다.
 * 3 이 입력되었다면,
 * 123, 12, 13, 1, 23, 2, 3 과 같이 출력하게 되는 것이다.
 *
 * DFS (깊이우선방식)의 이진탐색을 이용한다.
 * ch[]를 통해서 해당 숫자를 사용할 것인지 사용하지 않을 것인지를 표현한다.
 *
 * DFS(1)
 *  ch[] - 1: 0, 2: 0, 3: 0
 *  DFS(2) - 1을 사용하도록하며, 그 뒤는 stackFrame에 적재
 *
 * DFS(2) 1 사용
 *  ch[] - 1: 1, 2: 0, 3: 0
 *  DFS(3) - 2를 사용하도록하며, 그 뒤는 stackFrame에 적재
 *
 * DFS(3) 2 사용
 *  ch[] - 1: 1, 2: 1, 3: 0
 *  DFS(4) - 3을 사용하도록하며, 그 뒤는 stackFrame에 적재
 *
 * DFS(4) 3 사용
 *  ch[] - 1: 1, 2: 1, 3: 1
 *  if문에 걸리게 되며, ch를 검사하여 1인 경우에만 출력하게 된다.
 *
 *  출력 : 1 2 3
 *
 * DFS(4) 3 미사용
 *  ch[] - 1: 1, 2: 1, 3: 0
 *  stackFrame에 걸려있던 함수가 실행되며, if문에 걸려서 출력하게 된다.
 *
 *  출력 : 1 2
 *
 * DFS(3) 2 미사용
 *  ch[] - 1: 1, 2: 0, 3: 0
 *  DFS(4) - 3을 사용하도록 하며, 그 뒤는 stackFrame에 적재
 *
 * DFS(4) 3 사용
 *  ch[] - 1: 1, 2: 0, 3: 1
 *  if문에 걸리게 되며 출력하게 된다.
 *
 *  출력 : 1 3
 *
 * DFS(4) 3 미사용
 *  ch[] - 1: 1, 2: 0, 3: 0
 *  stackFrame에 걸려있던 함수가 실행되며, if문에 걸려서 출력하게 된다.
 *
 *  출력 : 1
 *
 * DFS(2) 1 미사용
 *  ch[] - 1: 0, 2: 0, 3: 0
 *  stackFrame에 걸려있던 함수가 실행된다.
 *  DFS(3) - 2를 사용하도록 하며, 그 뒤는 stackFrame에 적재
 *
 * DFS(3) 2 사용
 *  ch[] - 1: 0, 2: 1, 3: 0
 *  DFS(4) - 3을 사용하도록 하며, 그 뒤는 stackFrame에 적재
 *
 * DFS(4) 3 사용
 *  ch[] - 1: 0, 2: 1, 3: 1
 *  if문에 걸리게 되며 출력하게 된다.
 *
 *  출력: 2 3
 *
 * DFS(4) 3 미사용
 *  ch[] - 1: 0, 2: 1, 3: 0
 *  stackFrame에 걸려있던 함수가 실행되며, if문에 걸려서 출력하게 된다.
 *
 *  출력: 2
 *
 * DFS(3) 2 미사용
 *  ch[] - 1: 0, 2: 0, 3: 0
 *  stackFrame에 걸려있던 함수가 실행된다.
 *  DFS(4) - 3을 사용하도록 하며, 그 뒤는 stackFrame에 적재
 *
 * DFS(4) 3 사용
 *  ch[] - 1: 0, 3: 0, 3: 1
 *  if문에 걸리게 되며 출력하게된다.
 *
 *  출력: 3
 *
 * DFS(4) 3 미사용
 *  ch[] - 1: 0, 2: 0, 3: 0
 *  if문에 걸리게 되지만, 출력할게 없기에 출력하지 않는다.
 *
 *  프로그램 종료
 *
 *

 */
