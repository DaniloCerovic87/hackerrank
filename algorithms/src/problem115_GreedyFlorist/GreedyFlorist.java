package problem115_GreedyFlorist;

import java.util.Arrays;

public class GreedyFlorist {

    public static void main(String[] args) {
        System.out.println(getMinimumCost(3, new int[]{1, 2, 3, 4}));
        System.out.println(getMinimumCost(1, new int[]{1, 2, 3, 4}));
        System.out.println(getMinimumCost(2, new int[]{2, 5, 6}));
        System.out.println(getMinimumCost(2, new int[]{2, 5, 6, 8, 10, 11}));
    }

    private static int getMinimumCost(int k, int[] c) {
        Arrays.sort(c);
        int price = 0;
        int count = 0;

        for (int i = c.length - 1; i >= 0; i--) {
            price += (count / k + 1) * c[i];
            count++;
        }

        return price;
    }

}
