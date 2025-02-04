package problem116_AngryChildren;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AngryChildren {

    public static void main(String[] args) {
        System.out.println(maxMin(2, Arrays.asList(1, 4, 7, 2)));
        System.out.println(maxMin(3, Arrays.asList(10, 100, 300, 200, 1000, 20, 30)));
    }

    private static int maxMin(int k, List<Integer> arr) {
        int minUnfairness = Integer.MAX_VALUE;
        Collections.sort(arr);
        for (int i = 0; i <= arr.size() - k; i++) {
            minUnfairness = Math.min(minUnfairness, arr.get(i + k - 1) - arr.get(i));
        }

        return minUnfairness;
    }

}
