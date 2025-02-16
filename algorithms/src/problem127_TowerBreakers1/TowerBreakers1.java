package problem127_TowerBreakers1;

public class TowerBreakers1 {

    public static void main(String[] args) {
        System.out.println(towerBreakers(2, 6));
        System.out.println(towerBreakers(3, 5));
        System.out.println(towerBreakers(7, 1));
    }

    private static int towerBreakers(int n, int m) {
        if (m == 1) {
            return 2;
        }

        if (n % 2 == 0) {
            return 2;
        }

        return 1;
    }

}
