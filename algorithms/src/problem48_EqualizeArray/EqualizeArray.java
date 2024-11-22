package problem48_EqualizeArray;

import java.util.*;

public class EqualizeArray {

    public static void main(String[] args) {
        System.out.println(equalizeArray(Arrays.asList(1, 2, 2, 4, 5, 7, 8)));

    }

    private static int equalizeArray(List<Integer> arr) {
        Map<Integer, Integer> occurrences = new HashMap<>();

        for (Integer integer : arr) {
            occurrences.put(integer, occurrences.getOrDefault(integer, 0) + 1);
        }

        int maxOccurrence = Collections.max(occurrences.values());

        return arr.size() - maxOccurrence;
    }

}
