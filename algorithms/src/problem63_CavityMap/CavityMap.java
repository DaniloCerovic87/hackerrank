package problem63_CavityMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CavityMap {

    public static void main(String[] args) {
        List<String> grid = Arrays.asList("989", "191", "111");
        System.out.println(cavityMap(grid));
    }

    private static List<String> cavityMap(List<String> grid) {
        int n = grid.size();
        char[][] chars = new char[n][n];

        for (int i = 0; i < grid.size(); i++) {
            chars[i] = grid.get(i).toCharArray();
        }

        for (int i = 1; i < n - 1; i++) {
            for (int j = 1; j < n - 1; j++) {
                char value = chars[i][j];
                char upValue = chars[i - 1][j];
                char downValue = chars[i + 1][j];
                char leftValue = chars[i][j - 1];
                char rightValue = chars[i][j + 1];

                if (value > upValue && value > downValue && value > leftValue && value > rightValue) {
                    chars[i][j] = 'X';
                }
            }
        }

        List<String> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            result.add(new String(chars[i]));
        }

        return result;
    }

}
