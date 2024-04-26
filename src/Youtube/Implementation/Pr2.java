package Youtube.Implementation;

public class Pr2 {

    static int[] dx = new int[]{2, 2, -2, -2, 1, -1, 1, -1};
    static int[] dy = new int[]{1, -1, 1, -1, 2, 2, -2, -2};

    public int solution(String n) {
        int result = 0;
        int row = n.charAt(1) - '0';
        int column = n.charAt(0) - 'a' + 1;

        for (int i = 0; i < 8; i++) {
            int nextX = row + dx[i];
            int nextY = column + dy[i];
            if (nextX >= 1 && nextX <= 8 && nextY >= 1 && nextY <= 8) {
                result += 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(new Pr2().solution("a1"));
    }
}

// https://www.youtube.com/watch?v=2zjoKjt97vQ