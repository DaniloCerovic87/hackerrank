package problem20_BonAppetit;

import java.util.Arrays;
import java.util.List;

public class BonAppetit {

    public static void main(String[] args) {
        bonAppetit(Arrays.asList(3, 10, 2, 9), 1, 7);
        bonAppetit(Arrays.asList(3, 10, 2, 9), 1, 9);
    }

    private static void bonAppetit(List<Integer> bill, int k, int b) {
        int sum = 0;

        for (Integer e : bill) {
            sum += e;
        }

        int amountAnaShouldPay = (sum - bill.get(k)) / 2;
        int difference = b - amountAnaShouldPay;

        if (difference == 0) {
            System.out.println("Bon Appetit");
        } else {
            System.out.println(difference);
        }

    }
}
