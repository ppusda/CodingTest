package BaekJoon.Silver.Pr7568;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Pr7568 {

	private static class Person {
		public int height;
		public int weight;

		public Person(int height, int weight) {
			this.height = height;
			this.weight = weight;
		}
	}

	private static Person[] persons;
	private static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());
		persons = new Person[N];

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			persons[i] = new Person(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
		}

		for (int i = 0; i < N; i++) {
			compare(i);
		}

		System.out.println(sb);
	}

	private static void compare(int index) {
		int rank = 1;
		for (int i = 0; i < persons.length; i++) {
			if (i == index) continue;
			if (persons[i].height > persons[index].height && persons[i].weight > persons[index].weight) {
				rank++;
			}
		}

		sb.append(rank).append(" ");
	}
}
