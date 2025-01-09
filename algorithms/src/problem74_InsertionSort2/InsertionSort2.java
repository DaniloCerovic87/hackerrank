package problem74_InsertionSort2;

import java.util.Arrays;
import java.util.List;

public class InsertionSort2 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 4, 7, 5, 6, 2, 1);
        insertionSort2(7, list);
    }

    private static void insertionSort2(int n, List<Integer> arr) {
        for (int i = 1; i < n; i++) {
            int currentElement = arr.get(i);
            int j = i -1;
            while(j >= 0 && currentElement < arr.get(j)) {
                arr.set(j + 1, arr.get(j));
                j--;
            }
            arr.set(j + 1, currentElement);
            printList(arr);
        }
    }

    private static void printList(List<Integer> arr) {
        for (Integer c : arr) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

}
