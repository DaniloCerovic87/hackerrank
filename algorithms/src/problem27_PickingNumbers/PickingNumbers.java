package problem27_PickingNumbers;

import java.util.Arrays;
import java.util.List;

public class PickingNumbers {

    public static void main(String[] args) {

        System.out.println(pickingNumbers(Arrays.asList(1, 1, 2, 2, 4, 4, 5, 5, 5)));

    }

    private static int pickingNumbers(List<Integer> a) {
        int[] occurrences = new int[101];
        int longestSubarray = 0;

        for (Integer i : a) {
            occurrences[i]++;
        }

        for (int i = 1; i < occurrences.length - 1; i++) {
            int currentLength = occurrences[i] + occurrences[i + 1];

            if (currentLength > longestSubarray) {
                longestSubarray = currentLength;
            }
        }

        return longestSubarray;
    }


}
