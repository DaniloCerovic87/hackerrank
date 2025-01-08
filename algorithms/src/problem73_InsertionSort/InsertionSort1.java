package problem73_InsertionSort;

import java.util.Arrays;
import java.util.List;

public class InsertionSort1 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 4, 6, 8, 3);
        insertionSort1(5, list);
    }

    private static void insertionSort1(int n, List<Integer> list) {
        Integer lastElement = list.get(n - 1);
        int j = n - 2;
        while(j >= 0 && lastElement < list.get(j)) {
            list.set(j + 1, list.get(j));
            printList(list);
            j--;
        }

        list.set(j + 1, lastElement);
        printList(list);
    }

    private static void printList(List<Integer> arr) {
        for(Integer c : arr) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

}
