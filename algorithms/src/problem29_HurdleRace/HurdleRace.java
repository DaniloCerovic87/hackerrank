package problem29_HurdleRace;

import java.util.Arrays;
import java.util.List;

public class HurdleRace {

    public static void main(String[] args) {
        List<Integer> heights = Arrays.asList(1, 2, 3, 3, 2);
        System.out.println(hurdleRace(1, heights));
    }

    private static int hurdleRace(int k, List<Integer> height) {
        int maxHeight = 0;

        for (Integer h : height) {
            if (h > maxHeight) {
                maxHeight = h;
            }
        }

        //int maxHeight = Collections.max(height); moze i ovako

        return Math.max(maxHeight - k, 0);
    }
}
