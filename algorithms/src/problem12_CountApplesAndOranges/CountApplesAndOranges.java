package problem12_CountApplesAndOranges;

import java.util.Arrays;
import java.util.List;

public class CountApplesAndOranges {

    public static void main(String[] args) {
        List<Integer> apples = Arrays.asList(2, 3, -4);
        List<Integer> oranges = Arrays.asList(3, -2, -4);
        countApplesAndOranges(7, 10, 4, 12, apples, oranges);

    }

    private static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        int countApples = 0;
        int countOranges = 0;

        for (Integer d : apples) {
            if (a + d >= s && a + d <= t) {
                countApples++;
            }
        }

        for (Integer d : oranges) {
            if (b + d >= s && b + d <= t) {
                countOranges++;
            }
        }

        System.out.println(countApples);
        System.out.println(countOranges);
    }

}
