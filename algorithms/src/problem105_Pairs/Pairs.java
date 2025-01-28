package problem105_Pairs;

import java.util.*;

public class Pairs {

    public static void main(String[] args) {
        System.out.println(pairs(1, Arrays.asList(1, 2, 3, 4)));
        System.out.println(pairs(2, Arrays.asList(1, 5, 3, 4, 2)));
    }

    private static int pairs(int k, List<Integer> arr) {
        int countPairs = 0;
        Set<Integer> numbers = new HashSet<>();

        for(Integer e : arr) {
            if(numbers.contains(e + k)) {
                countPairs += 1;
            }
            if(numbers.contains(e - k)) {
                countPairs += 1;
            }

            numbers.add(e);
        }

        return countPairs;
    }

}
