package problem45_NonDivisibleSubset;

import java.util.Arrays;
import java.util.List;

public class NonDivisibleSubset {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(19, 10, 12, 10, 24, 25, 22);
        System.out.println(nonDivisibleSubset(4, list));
    }

    private static int nonDivisibleSubset(int k, List<Integer> s) {
        int size = s.size();
        int result = 0;
        int[] remainders = new int[k];

        for (Integer integer : s) {
            remainders[integer % k]++;
        }

        if (remainders[0] > 0) {
            result++;
        }

        for (int i = 1; i <= k / 2; i++) {
            if (i == k - i) {
                if (remainders[i] > 0) {
                    result++;
                }
            } else {
                result += Math.max(remainders[i], remainders[k - i]);
            }
        }
        return result;
    }
}
