package problem83_QuickSort1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSort1 {

    public static void main(String[] args) {
        System.out.println(quickSort(Arrays.asList(4, 5, 3, 7, 2)));
    }

    private static List<Integer> quickSort(List<Integer> arr) {
        Integer pivot = arr.get(0);
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();

        for (Integer current : arr) {
            if (current < pivot) {
                left.add(current);
            } else if (current > pivot) {
                right.add(current);
            } else {
                equal.add(current);
            }
        }

        List<Integer> result = new ArrayList<>();
        result.addAll(left);
        result.addAll(equal);
        result.addAll(right);
        return result;
    }

}
