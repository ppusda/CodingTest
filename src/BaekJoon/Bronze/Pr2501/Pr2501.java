package BaekJoon.Bronze.Pr2501;

import java.util.*;

public class Pr2501 {

    private static int n, k;
    private static ArrayList<Integer> res = new ArrayList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        k = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = 1; i <= 10; i++){
            if(n % i == 0){
                arr.add(i);
                res.add(i);
            }
        }

        while (!arr.contains(n)){
            for (int j: arr) {
                int tmp = n/j;
                if(!res.contains(tmp)){
                    res.add(tmp);
                }
            }
            arr = res;
        }

        Collections.sort(res);

        if(arr.size() < k & arr.size() > 0){
            System.out.println(0);
        }else {
            System.out.println(arr.get(k-1));
        }

    }
}
