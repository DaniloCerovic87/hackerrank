package problem16_Birthday;

import java.util.Arrays;
import java.util.List;

public class Birthday {

    public static void main(String[] args) {
        System.out.println(birthday(Arrays.asList(2, 2, 1, 3, 2), 4, 2));
        System.out.println(birthday(Arrays.asList(1, 2, 1, 3, 2), 3, 2));
    }

    private static int birthday(List<Integer> s, int d, int m) {
        int count = 0;
        int slidingSum = 0;
        int i = 0;
        while (i < m) {
            slidingSum += s.get(i);
            i++;
        }

        if (slidingSum == d) {
            count++;
        }

        for (int j = m; j < s.size(); j++) {
            slidingSum = slidingSum - s.get(j - m) + s.get(j);
            if (slidingSum == d) {
                count++;
            }

        }
        return count;
    }


}
