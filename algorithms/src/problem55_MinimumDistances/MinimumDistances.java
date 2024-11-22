package problem55_MinimumDistances;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MinimumDistances {

    public static void main(String[] args) {
        minimumDistances(Arrays.asList(1, 2, 3, 5, 6, 7, 4));
    }

    private static int minimumDistances(List<Integer> a) {
        int min = Integer.MAX_VALUE;
        Map<Integer, Integer> previousIndices = new HashMap<>();

        for (int i = 0; i < a.size(); i++) {
            Integer number = a.get(i);
            if (previousIndices.get(number) == null) {
                previousIndices.put(number, i);
            } else {
                Integer previousPosition = previousIndices.get(number);
                if (i - previousPosition < min) {
                    min = i - previousPosition;
                }
                previousIndices.put(number, i);
            }
        }

        if (min == Integer.MAX_VALUE) {
            return -1;
        }

        return min;
    }
}
