package problem118_SherlockAndTheBeast;

public class SherlockAndTheBeast {

    public static void main(String[] args) {
        decentNumber(1);
        decentNumber(3);
        decentNumber(5);
        decentNumber(11);
    }

    private static void decentNumber(int n) {
        int k = n;

        while (k >= 0) {
            if (k % 3 == 0) {
                System.out.println("5".repeat(k) + "3".repeat(n - k));
                return;
            }
            k -= 5;
        }

        System.out.println(-1);
    }

}
