package problem28_ClimbingLeaderboard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ClimbingLeaderboard {

    public static void main(String[] args) {
        List<Integer> rankings = Arrays.asList(100, 90, 80, 70, 60, 50);
        List<Integer> playerScores = Arrays.asList(55, 75, 75, 85, 105);
        System.out.println(climbingLeaderboard(rankings, playerScores));
    }

    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        List<Integer> ranks = ranked.stream().distinct().collect(Collectors.toList());
        List<Integer> scores = new ArrayList<>();
        int rankIndex = ranks.size() - 1;

        for (Integer score : player) {
            while (rankIndex >= 0 && score >= ranks.get(rankIndex)) {
                rankIndex--;
            }

            scores.add(rankIndex + 2);
        }

        return scores;
    }


}
