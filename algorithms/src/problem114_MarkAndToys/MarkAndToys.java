package problem114_MarkAndToys;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MarkAndToys {

    public static void main(String[] args) {
        System.out.println(maximumToys(Arrays.asList(1, 2, 3, 4), 7));
        System.out.println(maximumToys(Arrays.asList(1, 12, 5, 111, 200, 1000, 10), 50));
    }

    private static int maximumToys(List<Integer> prices, int k) {
        int numberOfToys = 0;
        Collections.sort(prices);

        for (int i = 0; i < prices.size(); i++) {
            int price = prices.get(i);
            if (k < price) {
                break;
            }
            numberOfToys++;
            k -= price;
        }

        return numberOfToys;
    }

}
