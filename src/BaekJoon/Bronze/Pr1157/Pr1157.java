package BaekJoon.Bronze.Pr1157;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pr1157 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine().toUpperCase();

		int[] array = new int[26];
		for (char ch : str.toCharArray()) {
			array[ch-'A'] ++;
		}

		int maxIndex = 0;
		boolean flag = false;
		for (int i = 1; i < array.length; i++) {
			if (array[i] > array[maxIndex]) {
				maxIndex = i;
				flag = false;
			} else if (array[i] == array[maxIndex]) {
				flag = true;
			}
		}

		System.out.println(flag ? "?" : Character.toString(maxIndex + 'A'));
	}
}
