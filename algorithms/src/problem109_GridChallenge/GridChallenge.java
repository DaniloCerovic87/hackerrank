package problem109_GridChallenge;

import java.util.Arrays;
import java.util.List;

public class GridChallenge {

    public static void main(String[] args) {
        System.out.println(gridChallenge(Arrays.asList("abc", "ade", "efg")));
        System.out.println(gridChallenge(Arrays.asList("ahc", "ade", "efg")));
        System.out.println(gridChallenge(Arrays.asList("abc", "hjk", "mpq", "rtv")));
    }

    private static String gridChallenge(List<String> grid) {
        int rows = grid.size();
        int cols = grid.get(0).length();

        char[][] matrix = new char[rows][];

        for (int i = 0; i < rows; i++) {
            char[] elements = grid.get(i).toCharArray();
            Arrays.sort(elements);
            matrix[i] = elements;
        }

        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows - 1; j++) {
                if (matrix[j][i] > matrix[j + 1][i]) {
                    return "NO";
                }
            }
        }

        return "YES";
    }

}
