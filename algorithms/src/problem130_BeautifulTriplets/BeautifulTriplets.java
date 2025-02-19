package problem130_BeautifulTriplets;

import java.util.Arrays;
import java.util.List;

public class BeautifulTriplets {

    public static void main(String[] args) {
        System.out.println(beautifulTriplets(1, Arrays.asList(2, 2, 3, 4, 5)));
        System.out.println(beautifulTriplets(3, Arrays.asList(1, 2, 4, 5, 7, 8, 10)));
    }

    private static int beautifulTriplets(int d, List<Integer> arr) {
        int n = arr.size();
        int count = 0;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                if (arr.get(j) - arr.get(i) == d) {
                    for (int k = j + 1; k < n; k++) {
                        if (arr.get(k) - arr.get(j) == d) {
                            count++;
                        }
                    }
                }
            }
        }

        return count;
    }

}
