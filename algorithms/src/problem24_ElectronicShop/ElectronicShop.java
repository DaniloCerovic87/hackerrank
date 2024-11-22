package problem24_ElectronicShop;

import java.util.Arrays;

public class ElectronicShop {

    public static void main(String[] args) {
        System.out.println(getMoneySpent(new int[]{40, 50, 60}, new int[]{5, 8, 12}, 60));
        System.out.println(getMoneySpent(new int[]{5, 11}, new int[]{4}, 5));
    }

    private static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        Arrays.sort(keyboards);
        Arrays.sort(drives);

        int maxSpent = -1;
        int k = 0;
        int d = drives.length - 1;

        while (k < keyboards.length && d >= 0) {
            int totalCost = keyboards[k] + drives[d];
            if (totalCost <= b) {
                maxSpent = Math.max(maxSpent, totalCost);
                k++;
            } else {
                d--;
            }
        }

        return maxSpent;

    }

}
