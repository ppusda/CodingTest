package BaekJoon.Silver.Pr8979;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Pr8979 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int num = Integer.parseInt(st.nextToken());
		int target = Integer.parseInt(st.nextToken());

		int arr[][] = new int[num+1][4];
		int rank = 1;
		for(int i=1; i<=num; i++) {
			st = new StringTokenizer(br.readLine());
			int index = Integer.parseInt(st.nextToken());
			int gold = Integer.parseInt(st.nextToken());
			int silver = Integer.parseInt(st.nextToken());
			int bronze = Integer.parseInt(st.nextToken());
			arr[index][0] = gold;
			arr[index][1] = silver;
			arr[index][2] = bronze;
		}

		for(int i = 1; i <= num; i++) {
			if(arr[i][0] > arr[target][0]) {
				rank++;
			}
			else if(arr[i][0] == arr[target][0] && arr[i][1] > arr[target][1]) {
				rank++;
			}
			else if(arr[i][0] == arr[target][0] && arr[i][1] == arr[target][1] && arr[i][2] > arr[target][2]) {
				rank++;
			}
		}

		System.out.println(rank);
	}
}
