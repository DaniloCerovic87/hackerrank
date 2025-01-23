package problem93_CountingSort2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountingSort2 {

    public static void main(String[] args) {
        System.out.println(countingSort(Arrays.asList(1, 34, 56, 54, 43, 23, 4, 2, 4, 1, 7, 8, 78, 99, 95, 0, 0)));
    }

    private static List<Integer> countingSort(List<Integer> arr) {
        List<Integer> result = new ArrayList<>();
        int[] occurrenceCounter = new int[100];
        for (Integer element : arr) {
            occurrenceCounter[element]++;
        }

        for (int i = 0; i < occurrenceCounter.length; i++) {
            for (int j = 0; j < occurrenceCounter[i]; j++) {
                result.add(i);
            }
        }
        return result;
    }

}
