package Inflearn.Pr09.Pr01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Person implements Comparable<Person>{
    int height, weight;

    public Person(int stature, int weight) {
        this.height = stature;
        this.weight = weight;
    }

    @Override
    public int compareTo(Person o) {
        return o.height - this.height;
    }
}

public class Pr09_my01 {
    private static int answer = 0, maxWeight;
    private static ArrayList<Person> personArr = new ArrayList<>();

    private void solution() {
        maxWeight = personArr.get(0).weight;
        answer++;
        for (int i = 0; i < personArr.size(); i++){
            if(maxWeight < personArr.get(i).weight){
                maxWeight = personArr.get(i).weight;
                answer++;
            }
        }
    }

    public static void main(String[] args) {
        Pr09_my01 pr = new Pr09_my01();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            int s = sc.nextInt();
            int w = sc.nextInt();
            personArr.add(new Person(s, w));
        }

        Collections.sort(personArr);
        pr.solution();

        System.out.println(answer);
    }
}