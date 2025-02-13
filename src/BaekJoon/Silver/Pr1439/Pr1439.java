package BaekJoon.Silver.Pr1439;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pr1439 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine();

		int count = 0;
		char word = S.charAt(0);
		for(int i = 1; i < S.length(); i++) {
			if(word != S.charAt(i)) {
				word = S.charAt(i);
				count ++;
			}
		}

		System.out.println((count / 2) + count % 2);
	}
}
