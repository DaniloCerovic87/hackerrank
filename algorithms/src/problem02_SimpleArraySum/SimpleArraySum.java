package problem02_SimpleArraySum;

import java.util.Arrays;
import java.util.List;

public class SimpleArraySum {

    public static void main(String[] args) {
        System.out.println(simpleArraySum(Arrays.asList(1, 2, 3, 4, 5)));
    }

    private static int simpleArraySum(List<Integer> ar) {
        int sum = 0;

        for (Integer e : ar) {
            sum += e;
        }

        return sum;
    }

}
