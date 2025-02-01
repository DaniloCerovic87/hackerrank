package problem112_Candies;

import java.util.Arrays;
import java.util.List;

public class Candies {

    public static void main(String[] args) {
        System.out.println(candies(6, Arrays.asList(4, 6, 4, 5, 6, 2)));
        System.out.println(candies(8, Arrays.asList(2, 4, 3, 5, 2, 6, 4, 5)));
    }

    private static long candies(int n, List<Integer> arr) {
        int[] candies = new int[n];
        Arrays.fill(candies, 1);

        for (int i = 1; i < n; i++) {
            if (arr.get(i) > arr.get(i - 1)) {
                candies[i] = candies[i - 1] + 1;
            }
        }

        for (int i = n - 2; i >= 0; i--) {
            if (arr.get(i) > arr.get(i + 1)) {
                candies[i] = Math.max(candies[i], candies[i + 1] + 1);
            }
        }

        return Arrays.stream(candies).sum();
    }

}
