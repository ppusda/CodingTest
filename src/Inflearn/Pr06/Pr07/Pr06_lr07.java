package Inflearn.Pr06.Pr07;

import java.util.*;

class Point implements Comparable<Point> {
    public int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point point) {
        if(this.x == point.x){
            return this.y - point.y;
        }else{
            return this.x - point.x;
        }
    }
}
/***
 * 좌표 비교를 위한 Comparable 상속
 * 객체의 값을 비교하는 것이다.
 *
 * 정렬 기준을 설정하는 것이다.
 * compareTo를 통해서 기준을 설정해줄 수 있다.
 *
 * 오름차순으로 정렬하기 위해서
 * 만약 x좌표의 값이 같다면 y 좌표 값을 비교하게 된다.
 *
 * 값을 비교해서 비교 값이 크다면 음수로 false가 될 것이고
 * 비교 값이 작다면 양수로 true로 정렬이 될 것이다.
 *
 *
 */

public class Pr06_lr07 {
    public static void main(String[] args) {
        Pr06_lr07 pr = new Pr06_lr07();
        Scanner sc = new Scanner(System.in);

        int arrLength= sc.nextInt();
        ArrayList<Point> arr = new ArrayList<>();
        for(int i = 0; i < arrLength; i ++){
            int x = sc.nextInt();
            int y = sc.nextInt();

            arr.add(new Point(x, y));
        }

        Collections.sort(arr);

        for (Point point : arr) {
            System.out.println(point.x+ " " + point.y);
        }
    }
}

/***
 * 아직도 Collection 안에 갇혀있는 느낌이다.
 * 안 풀린다면 Class도 생각해보자.
 */