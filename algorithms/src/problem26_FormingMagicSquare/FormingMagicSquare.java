package problem26_FormingMagicSquare;

import java.util.Arrays;
import java.util.List;

public class FormingMagicSquare {

    public static void main(String[] args) {
        List<List<Integer>> matrix = Arrays.asList(
                Arrays.asList(5, 3, 4),
                Arrays.asList(1, 5, 8),
                Arrays.asList(6, 4, 2)
        );
        System.out.println(formingMagicSquare(matrix));

    }


    public static int formingMagicSquare(List<List<Integer>> s) {
        List<List<List<Integer>>> magicSquares = Arrays.asList(
                Arrays.asList(
                        Arrays.asList(8, 1, 6), Arrays.asList(3, 5, 7), Arrays.asList(4, 9, 2)
                ),
                Arrays.asList(
                        Arrays.asList(6, 1, 8), Arrays.asList(7, 5, 3), Arrays.asList(2, 9, 4)
                ),
                Arrays.asList(
                        Arrays.asList(4, 9, 2), Arrays.asList(3, 5, 7), Arrays.asList(8, 1, 6)
                ),
                Arrays.asList(
                        Arrays.asList(2, 9, 4), Arrays.asList(7, 5, 3), Arrays.asList(6, 1, 8)
                ),
                Arrays.asList(
                        Arrays.asList(8, 3, 4), Arrays.asList(1, 5, 9), Arrays.asList(6, 7, 2)
                ),
                Arrays.asList(
                        Arrays.asList(4, 3, 8), Arrays.asList(9, 5, 1), Arrays.asList(2, 7, 6)
                ),
                Arrays.asList(
                        Arrays.asList(6, 7, 2), Arrays.asList(1, 5, 9), Arrays.asList(8, 3, 4)
                ),
                Arrays.asList(
                        Arrays.asList(2, 7, 6), Arrays.asList(9, 5, 1), Arrays.asList(4, 3, 8)
                )
        );

        int minCost = Integer.MAX_VALUE;

        for (List<List<Integer>> magic : magicSquares) {
            int cost = 0;
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    cost += Math.abs(s.get(j).get(k) - magic.get(j).get(k));
                }
            }
            if (cost < minCost) {
                minCost = cost;
            }
        }
        return minCost;
    }
}
