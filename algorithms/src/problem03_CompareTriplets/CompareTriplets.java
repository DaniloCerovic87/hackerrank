package problem03_CompareTriplets;

import java.util.Arrays;
import java.util.List;

public class CompareTriplets {

    public static void main(String[] args) {
        List<Integer> aliceScore = Arrays.asList(1, 2, 3);
        List<Integer> bobScore = Arrays.asList(3, 2, 1);
        System.out.println(compareTriplets(aliceScore, bobScore));
    }

    private static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int aliceScore = 0;
        int bobScore = 0;

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i)) {
                aliceScore++;
            } else if (a.get(i) < b.get(i)) {
                bobScore++;
            }
        }

        return Arrays.asList(aliceScore, bobScore);
    }
}
