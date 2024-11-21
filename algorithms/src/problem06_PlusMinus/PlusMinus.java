package problem06_PlusMinus;

import java.util.Arrays;
import java.util.List;

public class PlusMinus {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 1, 0, -1, -1);
        plusMinus(list);

    }

    private static void plusMinus(List<Integer> arr) {
        int positive = 0;
        int negative = 0;
        int zero = 0;

        for (Integer i : arr) {
            if (i > 0) {
                positive++;
            } else if (i < 0) {
                negative++;
            } else {
                zero++;
            }
        }

        float amount = arr.size();
        System.out.printf("%6f%n%6f%n%6f", positive / amount, negative / amount, zero / amount);
    }

}
