package problem110_LuckBalance;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LuckBalance {

    public static void main(String[] args) {

        List<List<Integer>> contests = new ArrayList<>();

        contests.add(new ArrayList<>(List.of(5, 1)));
        contests.add(new ArrayList<>(List.of(2, 1)));
        contests.add(new ArrayList<>(List.of(1, 1)));
        contests.add(new ArrayList<>(List.of(8, 1)));
        contests.add(new ArrayList<>(List.of(10, 0)));
        contests.add(new ArrayList<>(List.of(5, 0)));

        System.out.println(luckBalance(3, contests));
    }

    private static int luckBalance(int k, List<List<Integer>> contests) {
        int luckPoints = 0;

        for (List<Integer> contest : contests) {
            if (contest.get(1) == 0) {
                luckPoints += contest.get(0);
            }
        }

        List<Integer> importantContests = contests.stream()
                .filter(c -> c.get(1) == 1)
                .map(c -> c.get(0))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        for (int i = 0; i < Math.min(k, importantContests.size()); i++) {
            luckPoints += importantContests.get(i);
        }

        for (int i = k; i < importantContests.size(); i++) {
            luckPoints -= importantContests.get(i);
        }

        return luckPoints;
    }

}
