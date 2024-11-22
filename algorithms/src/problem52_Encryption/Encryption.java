package problem52_Encryption;

public class Encryption {

    public static void main(String[] args) {
        System.out.println(encryption("haveaniceday"));
    }

    private static String encryption(String s) {
        String noSpacesString = s.replace(" ", "");
        int length = noSpacesString.length();

        int rows = (int) Math.floor(Math.sqrt(length));
        int columns = (int) Math.ceil(Math.sqrt(length));

        if (rows * columns < length) {
            rows++;
        }

        char[][] grid = new char[rows][columns];

        int index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (index < length) {
                    grid[i][j] = s.charAt(index);
                } else {
                    grid[i][j] = ' ';
                }
                index++;
            }
        }

        StringBuilder resultBuilder = new StringBuilder();
        for (int j = 0; j < columns; j++) {
            for (int i = 0; i < rows; i++) {
                if (grid[i][j] != ' ') {
                    resultBuilder.append(grid[i][j]);
                }
            }
            resultBuilder.append(" ");
        }

        return resultBuilder.toString().trim();
    }

}
