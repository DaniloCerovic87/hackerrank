package problem17_DivisibleSumPairs;

import java.util.Arrays;
import java.util.List;

public class DivisibleSumPairs {

    public static void main(String[] args) {
        System.out.println(divisibleSumPairs(6, 3, Arrays.asList(1, 3, 2, 6, 1, 2)));
    }

    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        int count = 0;
        int[] remainders = new int[n];

        for (Integer element : ar) {
            int remainder = element % k;
            int complement = (k - remainder) % k;

            count += remainders[complement];
            remainders[remainder]++;
        }
        return count;
    }
}
