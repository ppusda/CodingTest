package Youtube.Greedy;

public class Pr2 {
    public int solution(String numbers) {
        String[] numberArray = numbers.split("");
        int result = Integer.parseInt(numberArray[0]);

        for (int i = 1; i < numberArray.length; i++) {
            int n = Integer.parseInt(numberArray[i]);
            if (n <= 1 || result <= 1) {
                result += n;
            } else {
                result *= n;
            }
        }

        return result;
    }
}

// 최대한 곱하기 수행
// https://www.youtube.com/watch?v=2zjoKjt97vQ