package problem8_MiniMaxSum;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MiniMaxSum {

    public static void main(String[] args) {

        miniMaxSum(Arrays.asList(7, 69, 2, 221, 8974));

    }

    private static void miniMaxSum(List<Integer> arr) {
        Collections.sort(arr);
        long sum = arr.stream().mapToLong(Integer::longValue).sum();
        long minSum = sum - arr.get(arr.size() - 1);
        long maxSum = sum - arr.get(0);
        System.out.println(minSum + " " + maxSum);
    }
}
