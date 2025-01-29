package problem106_SherlockAndArray;

import java.util.Arrays;
import java.util.List;

public class SherlockAndArray {

    public static void main(String[] args) {
        System.out.println(balancedSums(Arrays.asList(5, 6, 8, 11)));
        System.out.println(balancedSums(Arrays.asList(1, 2, 3, 5)));
    }

    private static String balancedSums(List<Integer> arr) {
        int totalSum = 0;
        int sumLeft = 0;

        for (Integer e : arr) {
            totalSum += e;
        }

        for (Integer e : arr) {
            totalSum -= e;

            if (totalSum == sumLeft) {
                return "YES";
            }
            sumLeft += e;
        }

        return "NO";
    }

}
