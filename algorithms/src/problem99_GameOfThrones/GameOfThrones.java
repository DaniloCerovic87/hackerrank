package problem99_GameOfThrones;

import java.util.HashMap;
import java.util.Map;

public class GameOfThrones {

    public static void main(String[] args) {
        System.out.println(gameOfThrones("aabbccdd"));
        System.out.println(gameOfThrones("cdefghmnopqrstuvw"));
        System.out.println(gameOfThrones("cdcdcdcdeeeef"));
    }

    private static String gameOfThrones(String s) {
        int oddNumberOfLetters = 0;

        Map<Character, Integer> charactersCount = new HashMap<>();
        for (char c : s.toCharArray()) {
            charactersCount.put(c, charactersCount.getOrDefault(c, 0) + 1);
        }

        for (Integer count : charactersCount.values()) {
            if (count % 2 == 1) {
                oddNumberOfLetters++;
            }
        }

        if ((oddNumberOfLetters == 1 && s.length() % 2 == 1) || (s.length() % 2 == 0 && oddNumberOfLetters == 0)) {
            return "YES";
        }
        return "NO";
    }

}
