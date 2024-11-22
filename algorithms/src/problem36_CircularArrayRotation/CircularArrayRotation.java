package problem36_CircularArrayRotation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CircularArrayRotation {

    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(3, 4, 5);
        List<Integer> queries = Arrays.asList(1, 2);
        int k = 2;
        System.out.println(circularArrayRotation(a, k, queries));
    }

    private static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
        int size = a.size();
        int[] movedElements = new int[size];
        for (int i = 0; i < size; i++) {
            int positionToMove = (i + k) % size;
            movedElements[positionToMove] = a.get(i);
        }

        List<Integer> listQueries = new ArrayList<>();
        for (Integer q : queries) {
            listQueries.add(movedElements[q]);
        }
        return listQueries;

    }

}
