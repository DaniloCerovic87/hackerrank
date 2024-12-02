package problem66_HappyLadyBugs;

import java.util.HashMap;
import java.util.Map;

public class HappyLadyBugs {

    public static void main(String[] args) {
        System.out.println(happyLadybugs("RBY_YBR"));
        System.out.println(happyLadybugs("X_Y__X"));
        System.out.println(happyLadybugs("B_RRBR"));
        System.out.println(happyLadybugs("_"));
        System.out.println(happyLadybugs("R"));
    }

    public static String happyLadybugs(String b) {
        Map<Character, Integer> colorCounters = new HashMap<>();
        boolean hasEmptySpace = false;

        for (char c : b.toCharArray()) {
            if (c == '_') {
                hasEmptySpace = true;
            } else {
                colorCounters.put(c, colorCounters.getOrDefault(c, 0) + 1);
            }
        }

        if (colorCounters.values().stream().anyMatch(v -> v == 1)) {
            return "NO";
        }

        if (hasEmptySpace) {
            return "YES";
        }

        for (int i = 0; i < b.length() - 1; i++) {
            char current = b.charAt(i);
            if ((i == 0 || b.charAt(i - 1) != current) && (i == b.length() - 1 || b.charAt(i + 1) != current)) {
                return "NO";
            }
        }
        return "YES";
    }

}
