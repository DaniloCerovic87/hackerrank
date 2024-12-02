package problem64_ManasaAndStones;

import java.util.*;

public class ManasaAndStones {

    public static void main(String[] args) {
        System.out.println(stones(2, 2, 3));
        System.out.println(stones(4, 10, 100));
        System.out.println(stones(3, 1, 2));
    }

    private static List<Integer> stones(int n, int a, int b) {
        Set<Integer> result = new TreeSet<>();

        for(int k = 0; k < n; k++) {
            result.add(a * k + (n - 1 - k) * b);
        }

        return new ArrayList<>(result);
    }
}
