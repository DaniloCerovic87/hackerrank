package problem58_ChocolateFeast;

public class ChocolateFeast {

    public static void main(String[] args) {
        System.out.println(chocolateFeast(15, 3, 2));
        System.out.println(chocolateFeast(12, 4, 4));
        System.out.println(chocolateFeast(6, 2, 2));
        System.out.println(chocolateFeast(10, 2, 5));

    }

    public static int chocolateFeast(int n, int c, int m) {
        int count = n / c;
        int wrappers = count;

        while (wrappers >= m) {
            int newChocolates = wrappers / m;
            count += newChocolates;

            wrappers = newChocolates + (wrappers % m);
        }

        return count;
    }

}
