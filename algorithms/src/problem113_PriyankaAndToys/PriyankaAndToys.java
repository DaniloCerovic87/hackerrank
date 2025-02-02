package problem113_PriyankaAndToys;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PriyankaAndToys {

    public static void main(String[] args) {
        System.out.println(toys(Arrays.asList(1, 2, 3, 4, 5, 10, 11, 12, 13)));
        System.out.println(toys(Arrays.asList(1, 2, 3, 21, 7, 12, 14, 21)));
    }

    private static int toys(List<Integer> w) {
        Collections.sort(w);
        int numberOfContainers = 1;
        int first = w.get(0);
        int i = 1;

        while (i < w.size()) {
            if (w.get(i) > first + 4) {
                first = w.get(i);
                numberOfContainers++;
            }
            i++;
        }

        return numberOfContainers;
    }

}
