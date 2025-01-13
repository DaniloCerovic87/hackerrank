package problem86_WeightedUniformString;

import java.util.*;

public class WeightedUniformString {

    public static void main(String[] args) {
        System.out.println(weightedUniformStrings("abccddde", Arrays.asList(6, 1, 3, 12, 5, 9, 10)));
    }

    private static List<String> weightedUniformStrings(String s, List<Integer> queries) {
        Set<Integer> weights = new HashSet<>();
        int currentWeight = 0;
        char previousChar = ' ';

        for (char c : s.toCharArray()) {
            int charWeight = c - 'a' + 1;
            if (c == previousChar) {
                currentWeight += charWeight;
            } else {
                currentWeight = charWeight;
            }
            previousChar = c;
            weights.add(currentWeight);
        }

        List<String> result = new ArrayList<>();
        for (Integer query : queries) {
            if (weights.contains(query)) {
                result.add("Yes");
            } else {
                result.add("No");
            }
        }
        return result;
    }

}
