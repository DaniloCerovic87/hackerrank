package problem14_GetTotalX;

import java.util.Arrays;
import java.util.List;

public class GetTotalX {

    public static void main(String[] args) {
        System.out.println(getTotalX(Arrays.asList(2, 6), Arrays.asList(24, 36)));
        System.out.println(getTotalX(Arrays.asList(2, 4), Arrays.asList(16, 32, 96)));
    }

    public static int getTotalX(List<Integer> a, List<Integer> b) {

        int lcmA = a.get(0);
        for (int i = 1; i < a.size(); i++) {
            lcmA = lcm(lcmA, a.get(i));
        }

        int gcdB = b.get(0);
        for (int i = 1; i < b.size(); i++) {
            gcdB = gcd(gcdB, b.get(i));
        }

        int count = 0;
        for (int i = lcmA; i <= gcdB; i += lcmA) {
            if (gcdB % i == 0) {
                count++;
            }
        }

        return count;

    }

    // 8 4
    // 4, 0

    //Greatest Common Divisor
    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }

        return gcd(b, a % b);
    }

    //Least Common Multiple
    private static int lcm(int a, int b) {
        return Math.abs(a * b) / gcd(a, b);
    }

}
