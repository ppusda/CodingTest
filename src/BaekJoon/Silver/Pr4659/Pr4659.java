import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pr4659 {
	private static final String NOT_ACCEPTABLE = "<%s> is not acceptable.";
	private static final String ACCEPTABLE = "<%s> is acceptable.";

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		while (true) {
			String password = br.readLine();
			if (password.equals("end")) break;

			boolean hasVowel = false;
			boolean isAcceptable = true;
			int vowelCount = 0, consonantCount = 0;

			char[] chars = password.toCharArray();

			for (int i = 0; i < password.length(); i++) {
				char current = chars[i];

				if (isVowel(current)) {
					hasVowel = true;
					vowelCount++;
					consonantCount = 0;
				} else {
					consonantCount++;
					vowelCount = 0;
				}

				// 3개 연속 모음 or 자음 체크
				if (vowelCount >= 3 || consonantCount >= 3) {
					isAcceptable = false;
					break;
				}

				// 연속된 같은 문자 (단, "ee"와 "oo"는 예외)
				if (i > 0 && chars[i] == chars[i - 1] && !(current == 'e' || current == 'o')) {
					isAcceptable = false;
					break;
				}
			}

			// 최소한 하나의 모음 포함 여부 검사
			if (!hasVowel) isAcceptable = false;
			sb.append(String.format(isAcceptable ? ACCEPTABLE : NOT_ACCEPTABLE, password)).append("\n");
		}

		System.out.print(sb);
	}

	private static boolean isVowel(char ch) {
		return "aeiou".indexOf(ch) != -1;
	}
}