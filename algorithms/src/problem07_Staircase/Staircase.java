package problem07_Staircase;

public class Staircase {

    public static void main(String[] args) {
        staircase(4);

    }

    private static void staircase(int n) {
        for (int i = 0; i < n; i++) {
            int spaces = n - i - 1;
            int hashes = n - spaces;
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < hashes; k++) {
                System.out.print("#");
            }
            System.out.println();
        }

    }
}
