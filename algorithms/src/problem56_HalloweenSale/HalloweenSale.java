package problem56_HalloweenSale;

public class HalloweenSale {

    public static void main(String[] args) {
        System.out.println(howManyGames(20, 3, 6, 70));
        System.out.println(howManyGames(20, 3, 6, 70));
        System.out.println(howManyGames(20, 3, 6, 85));
        System.out.println(howManyGames(16, 2, 1, 9981));
        System.out.println(howManyGames(20, 3, 6, 80));
    }

    public static int howManyGames(int p, int d, int m, int s) {
        int counter = 0;
        while (s >= p) {
            s -= p;
            counter++;

            if (p - d > m) {
                p -= d;
            } else {
                p = m;
            }
        }
        return counter;

    }


}
