package problem15_BreakingRecords;

import java.util.Arrays;
import java.util.List;

public class BreakingRecords {

    public static void main(String[] args) {
        System.out.println(breakingRecords(Arrays.asList(12, 24, 10, 24)));
    }

    private static List<Integer> breakingRecords(List<Integer> scores) {
        Integer firstScore = scores.get(0);
        int max = firstScore;
        int min = firstScore;

        int maxBroken = 0;
        int minBroken = 0;

        for (int i = 1; i < scores.size(); i++) {
            if (scores.get(i) < min) {
                min = scores.get(i);
                minBroken++;
            } else if (scores.get(i) > max) {
                max = scores.get(i);
                maxBroken++;
            }
        }

        return Arrays.asList(minBroken, maxBroken);
    }
}

