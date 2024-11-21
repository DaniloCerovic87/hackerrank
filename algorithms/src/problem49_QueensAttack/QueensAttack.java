package problem49_QueensAttack;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class QueensAttack {

    public static void main(String[] args) {
        System.out.println(queensAttack(8, 1, 4, 4, List.of(Arrays.asList(3, 5))));
    }


    public static int queensAttack(int n, int k, int r_q, int c_q, List<List<Integer>> obstacles) {
        int count = 0;
        HashSet<String> obstaclePositions = new HashSet<>();

        for (List<Integer> ob : obstacles) {
            obstaclePositions.add(ob.get(0) + "," + ob.get(1));
        }

        int[][] directions = {
                {1, 0}, {0, 1}, {-1, 0}, {0, -1},
                {1, 1}, {1, -1}, {-1, 1}, {-1, -1}
        };

        for (int[] direction : directions) {
            int row = r_q;
            int column = c_q;

            while (row + direction[0] > 0 && row + direction[0] <= n && column + direction[1] > 0 && column + direction[1] <= n) {
                row += direction[0];
                column += direction[1];

                if (obstaclePositions.contains(row + "," + column)) {
                    break;
                }
                count++;
            }
        }
        return count;
    }

}
