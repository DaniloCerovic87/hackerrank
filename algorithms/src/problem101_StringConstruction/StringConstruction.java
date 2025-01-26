package problem101_StringConstruction;

import java.util.HashSet;
import java.util.Set;

public class StringConstruction {

    public static void main(String[] args) {
        System.out.println(stringConstruction("abcd"));
        System.out.println(stringConstruction("abab"));
    }

    private static int stringConstruction(String s) {
        int cost = 0;
        Set<Character> usedLetters = new HashSet<>();

        for (char c : s.toCharArray()) {
            if (usedLetters.contains(c)) {
                continue;
            }

            usedLetters.add(c);
            cost += 1;
        }

        return cost;
    }

}
