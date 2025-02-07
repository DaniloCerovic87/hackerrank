package problem119_LargestPermutation;

import java.util.*;

public class LargestPermutation {

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        System.out.println(largestPermutation(1, list1));

        List<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(2);
        list2.add(3);
        list2.add(5);
        list2.add(1);

        System.out.println(largestPermutation(2, list2));
    }

    private static List<Integer> largestPermutation(int k, List<Integer> arr) {
        int n = arr.size();

        Map<Integer, Integer> numberIndexes = new HashMap<>();

        for (int i = 0; i < n; i++) {
            numberIndexes.put(arr.get(i), i);
        }

        for (int i = 0; i < n && k > 0; i++) {
            int maxNumber = n - i;

            if (arr.get(i) == maxNumber) {
                continue;
            }

            int maxNumberIndex = numberIndexes.get(maxNumber);

            int numberToSwap = arr.get(i);
            arr.set(i, maxNumber);
            arr.set(maxNumberIndex, numberToSwap);

            numberIndexes.put(numberToSwap, maxNumberIndex);
            numberIndexes.put(maxNumber, i);

            k--;
        }

        return arr;
    }

}
