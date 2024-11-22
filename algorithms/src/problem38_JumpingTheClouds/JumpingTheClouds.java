package problem38_JumpingTheClouds;

public class JumpingTheClouds {

    public static void main(String[] args) {
        System.out.println(jumpingOnClouds(new int[]{0, 0, 1, 0}, 2));
        System.out.println(jumpingOnClouds(new int[]{0, 0, 1, 0, 0, 1, 1, 0}, 2));

    }

    private static int jumpingOnClouds(int[] c, int k) {
        int energy = 100;
        int i = 0;

        do {
            i = (i + k) % c.length;
            if (c[i] == 1) {
                energy -= 2;
            }
            energy -= 1;
        } while (i != 0);
        return energy;
    }
}
