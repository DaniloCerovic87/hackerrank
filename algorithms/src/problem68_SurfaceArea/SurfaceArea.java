package problem68_SurfaceArea;

import java.util.Arrays;
import java.util.List;

public class SurfaceArea {

    public static void main(String[] args) {

        System.out.println(surfaceArea(List.of(List.of(1))));

        System.out.println(surfaceArea(List.of(Arrays.asList(1, 3, 4),
                Arrays.asList(2, 2, 3),
                Arrays.asList(1, 2, 4))));

    }

    public static int surfaceArea(List<List<Integer>> A) {
        int rows = A.size();
        int columns = A.get(0).size();
        int totalSurface = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                int height = A.get(i).get(j);

                totalSurface += 2;

                if (j == 0) {
                    totalSurface += height;
                } else {
                    totalSurface += Math.max(0, height - A.get(i).get(j - 1));
                }

                if (j == columns - 1) {
                    totalSurface += height;
                } else {
                    totalSurface += Math.max(0, height - A.get(i).get(j + 1));
                }

                if (i == 0) {
                    totalSurface += height;
                } else {
                    totalSurface += Math.max(0, height - A.get(i - 1).get(j));
                }

                if (i == rows - 1) {
                    totalSurface += height;
                } else {
                    totalSurface += Math.max(0, height - A.get(i + 1).get(j));
                }

            }
        }

        return totalSurface;
    }

}
