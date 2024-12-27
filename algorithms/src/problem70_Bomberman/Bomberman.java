package problem70_Bomberman;

import java.util.ArrayList;
import java.util.List;

public class Bomberman {

    public static void main(String[] args) {
        List<String> grid1 = new ArrayList<>();
        grid1.add(".......");
        grid1.add("...O...");
        grid1.add("....O..");
        grid1.add(".......");
        grid1.add("OO.....");
        grid1.add("OO.....");
        System.out.println(bomberMan(5, grid1));

        List<String> grid2 = new ArrayList<>();
        grid2.add(".......");
        grid2.add("...O.O.");
        grid2.add("....O..");
        grid2.add("..O....");
        grid2.add("OO...OO");
        grid2.add("OO.O...");
        System.out.println(bomberMan(5, grid2));
    }


    public static List<String> bomberMan(int n, List<String> grid) {
        int rows = grid.size();
        int columns = grid.get(0).length();

        if (n == 1) {
            return grid;
        }

        if (n % 2 == 0) {
            return createGridFullOfBombs(rows, columns);
        }

        if (n % 4 == 3) {
            return detonate(grid, rows, columns);
        }

        return bomberMan(3, detonate(grid, rows, columns));
    }


    public static List<String> detonate(List<String> grid, int rows, int columns) {
        List<String> newGrid = createGridFullOfBombs(rows, columns);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (grid.get(i).charAt(j) == 'O') {
                    newGrid.set(i, newGrid.get(i).substring(0, j) + "." + newGrid.get(i).substring(j + 1));
                    if (i - 1 >= 0) {
                        newGrid.set(i - 1, newGrid.get(i - 1).substring(0, j) + "." + newGrid.get(i - 1).substring(j + 1));
                    }

                    if (i + 1 < rows) {
                        newGrid.set(i + 1, newGrid.get(i + 1).substring(0, j) + "." + newGrid.get(i + 1).substring(j + 1));
                    }

                    if (j - 1 >= 0) {
                        newGrid.set(i, newGrid.get(i).substring(0, j - 1) + "." + newGrid.get(i).substring(j));
                    }

                    if (j + 1 < columns) {
                        newGrid.set(i, newGrid.get(i).substring(0, j + 1) + "." + newGrid.get(i).substring(j + 2));
                    }

                }
            }
        }
        return newGrid;
    }

    private static List<String> createGridFullOfBombs(int rows, int columns) {
        List<String> newGrid = new ArrayList<>();
        for (int i = 0; i < rows; i++) {
            newGrid.add("O".repeat(columns));
        }
        return newGrid;
    }

}
