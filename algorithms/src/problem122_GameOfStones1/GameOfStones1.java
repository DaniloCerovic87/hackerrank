package problem122_GameOfStones1;

public class GameOfStones1 {

    public static void main(String[] args) {
        System.out.println(gameOfStones(0));
        System.out.println(gameOfStones(1));
        System.out.println(gameOfStones(2));
        System.out.println(gameOfStones(3));
        System.out.println(gameOfStones(4));
        System.out.println(gameOfStones(5));
        System.out.println(gameOfStones(6));
        System.out.println(gameOfStones(7));
        System.out.println(gameOfStones(8));
        System.out.println(gameOfStones(14));
        System.out.println(gameOfStones(15));
        System.out.println(gameOfStones(16));
    }

    private static String gameOfStones(int n) {
        return (n % 7 == 0 || n % 7 == 1) ? "Second" : "First";
    }

}
