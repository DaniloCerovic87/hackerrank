package problem65_GridSearch;

import java.util.Arrays;
import java.util.List;

public class GridSearch {

    public static void main(String[] args) {
        List<String> grid1 = Arrays.asList(
                "567890",
                "111111",
                "222222",
                "333333",
                "123456"
        );

        List<String> pattern1 = Arrays.asList(
                "5678",
                "1111"
        );

        System.out.println(gridSearch(grid1, pattern1));

        List<String> grid2 = Arrays.asList(
                "123412",
                "561212",
                "123634",
                "781288"
        );

        List<String> pattern2 = Arrays.asList(
                "12",
                "34"
        );
        System.out.println(gridSearch(grid2, pattern2));

        List<String> grid3 = Arrays.asList(
                "123456",
                "234567",
                "345678",
                "456789"
        );

        List<String> pattern3 = Arrays.asList(
                "567",
                "678"
        );
        System.out.println(gridSearch(grid3, pattern3));
    }

    public static String gridSearch(List<String> g, List<String> p) {
        int n = g.size();
        int m = g.get(0).length();
        int r = p.size();
        int c = p.get(0).length();

        for (int i = 0; i <= n - r; i++) {
            for (int j = 0; j <= m - c; j++) {
                boolean match = true;
                for (int k = 0; k < r; k++) {
                    if (!g.get(i + k).substring(j, j + c).equals(p.get(k))) {
                        match = false;
                        break;
                    }
                }

                if (match) {
                    return "YES";
                }
            }
        }
        return "NO";
    }
}
