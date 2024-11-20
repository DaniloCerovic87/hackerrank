package problem5_DiagonalDifference;

import java.util.Arrays;
import java.util.List;

public class DiagonalDifference {

    public static void main(String[] args) {
        List<List<Integer>> matrix = Arrays.asList(
                Arrays.asList(11, 2, 4),
                Arrays.asList(4, 5, 6),
                Arrays.asList(10, 8, -12)
        );

        System.out.println(diagonalDifference(matrix));

    }

    private static int diagonalDifference(List<List<Integer>> arr) {
        int firstDiagonalSum = 0;
        int secondDiagonalSum = 0;
        int size = arr.size();

        for (int i = 0; i < size; i++) {
            firstDiagonalSum += arr.get(i).get(i);
            secondDiagonalSum += arr.get(i).get(size - i - 1);
        }

        return Math.abs(firstDiagonalSum - secondDiagonalSum);
    }

}
