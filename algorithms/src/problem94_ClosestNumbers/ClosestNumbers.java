package problem94_ClosestNumbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ClosestNumbers {

    public static void main(String[] args) {
        System.out.println(closestNumbers(Arrays.asList(5, 2, 3, 4, 1)));
        System.out.println(closestNumbers(Arrays.asList(-20, -3916237, -357920, -3620601, 7374819,
                -7330761, 30, 6246457, -6461594, 266854)));
    }

    private static List<Integer> closestNumbers(List<Integer> arr) {
        Collections.sort(arr);

        List<Integer> pairs = new ArrayList<>();

        int minDivision = Integer.MAX_VALUE;
        for (int i = 0; i < arr.size() - 1; i++) {
            int currentElement = arr.get(i);
            int nextElement = arr.get(i + 1);
            int currentDivision = Math.abs(currentElement - nextElement);

            if (currentDivision > minDivision) {
                continue;
            }

            if (currentDivision < minDivision) {
                pairs.clear();
                minDivision = currentDivision;
            }
            pairs.add(currentElement);
            pairs.add(nextElement);
        }
        return pairs;
    }

}
