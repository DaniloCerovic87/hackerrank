package problem84_CountingSort1;

import java.util.Arrays;
import java.util.List;

public class CountingSort1 {

    public static void main(String[] args) {
        System.out.println(countingSort(Arrays.asList(1, 34, 56, 54, 43, 23, 4, 2, 4, 1, 7, 8, 78, 99, 95)));
    }

    private static List<Integer> countingSort(List<Integer> arr) {
        int[] occurrenceCounter = new int[100];
        for(Integer element : arr) {
            occurrenceCounter[element]++;
        }
        return Arrays.stream(occurrenceCounter).boxed().toList();
    }

}
