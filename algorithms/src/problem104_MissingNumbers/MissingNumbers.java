package problem104_MissingNumbers;

import java.util.*;

public class MissingNumbers {

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(203, 204, 205, 206, 207, 208, 203, 204, 205, 206);
        List<Integer> brr = Arrays.asList(203, 204, 204, 205, 206, 207, 205, 208, 203, 206, 205, 206, 204);
        System.out.println(missingNumbers(arr, brr));
    }

    private static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
        Map<Integer, Integer> firstArrNumberOccurrence = new HashMap<>();
        Map<Integer, Integer> secondArrNumberOccurrence = new HashMap<>();
        Set<Integer> result = new TreeSet<>();

        for (Integer el : arr) {
            firstArrNumberOccurrence.put(el, firstArrNumberOccurrence.getOrDefault(el, 0) + 1);
        }

        for (Integer el : brr) {
            secondArrNumberOccurrence.put(el, secondArrNumberOccurrence.getOrDefault(el, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : secondArrNumberOccurrence.entrySet()) {
            Integer key = entry.getKey();
            if (firstArrNumberOccurrence.getOrDefault(key, 0) < entry.getValue()) {
                result.add(key);
            }
        }

        return new ArrayList<>(result);
    }

}
