package Programmers.Lv2.Pr42839;

import java.util.HashSet;
import java.util.Set;


public class Pr42839 {
    private static final Set<Integer> hashSet = new HashSet<>();

    public int solution(String numbers) {
        int len = numbers.length();
        int[] arr = new int[len];

        for(int i = 0; i < len; i++) {
            arr[i] = Integer.parseInt(String.valueOf(numbers.charAt(i)));
        }
        for(int i=1; i<=len; i++) {
            permutation(arr, 0, len, i); // 각 자리 수에 대한 숫자 만들기
        }

        return hashSet.size();
    }

    public static void main(String[] args) {
        System.out.println(new Pr42839().solution("17"));
    }

    public static void permutation(int[] arr, int depth, int n, int r) {
        if(depth == r) { // 1자리수, 2자리수, 3자리수가 되면 등록 작업
            StringBuilder number = new StringBuilder();
            for(int i=0; i<r; i++) {
                number.append(arr[i]);
            }

            if(isPrime(Integer.parseInt(number.toString()))) {
                hashSet.add(Integer.valueOf(number.toString()));
            }
        }

        for(int i=depth; i<n; i++) { // 그게 아니라면 depth를 증가시키며 수 선택
            swap(arr, depth, i); //
            permutation(arr, depth + 1, n, r);
            swap(arr, depth, i);
        }
    }

    public static void swap(int[] arr, int depth, int i) {
        int temp = arr[depth];
        arr[depth] = arr[i];
        arr[i] = temp;
    }

    public static boolean isPrime(int n){
        if(n<2) return false;

        for(int i=2; i<=(int) Math.sqrt(n); i++) {
            if(n%i == 0) {
                return false;
            }
        }

        return true;
    }
}
