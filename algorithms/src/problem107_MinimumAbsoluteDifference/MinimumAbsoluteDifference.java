package problem107_MinimumAbsoluteDifference;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinimumAbsoluteDifference {

    public static void main(String[] args) {
        System.out.println(minimumAbsoluteDifference(Arrays.asList(4, -2, -1)));
        System.out.println(minimumAbsoluteDifference(Arrays.asList(-59, -36, -13, 1, -53, -92, -2, -96, -54, 75)));
    }

    private static int minimumAbsoluteDifference(List<Integer> arr) {
        Collections.sort(arr);

        int minDifference = Integer.MAX_VALUE;

        for (int i = 1; i < arr.size(); i++) {
            int diff = Math.abs(arr.get(i) - arr.get(i - 1));
            minDifference = Math.min(minDifference, diff);
        }

        return minDifference;
    }

}
