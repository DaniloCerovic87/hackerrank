package problem4_AVeryBigSum;

import java.util.Arrays;
import java.util.List;

public class AVeryBigSum {

    public static void main(String[] args) {
        System.out.println(aVeryBigSum(Arrays.asList(1000000001L, 1000000002L, 1000000003L, 1000000004L, 1000000005L
        )));
    }

    private static long aVeryBigSum(List<Long> ar) {
        long sum = 0;
        for (long e : ar) {
            sum += e;
        }
        return sum;
    }

}
