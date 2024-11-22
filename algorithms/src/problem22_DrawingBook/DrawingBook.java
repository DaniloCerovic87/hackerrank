package problem22_DrawingBook;

public class DrawingBook {

    public static void main(String[] args) {
        System.out.println(pageCount(5, 3));
        System.out.println(pageCount(6, 2));
    }

    private static int pageCount(int n, int p) {
        int frontTurns = p / 2;
        int backTurns = n / 2 - p / 2;
        return Math.min(frontTurns, backTurns);
    }

}
