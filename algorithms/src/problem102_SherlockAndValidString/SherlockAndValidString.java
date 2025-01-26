package problem102_SherlockAndValidString;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SherlockAndValidString {

    public static void main(String[] args) {
        System.out.println(isValid("abc"));
        System.out.println(isValid("abcc"));
        System.out.println(isValid("aabbcd"));
        System.out.println(isValid("aabbc"));
    }

    private static String isValid(String s) {
        Map<Character, Integer> letterOccurrence = new HashMap<>();

        for (char c : s.toCharArray()) {
            letterOccurrence.put(c, letterOccurrence.getOrDefault(c, 0) + 1);
        }

        Map<Integer, Integer> frequencyOccurrence = new HashMap<>();

        for (Integer f : letterOccurrence.values()) {
            frequencyOccurrence.put(f, frequencyOccurrence.getOrDefault(f, 0) + 1);
        }

        if (frequencyOccurrence.size() == 1) {
            return "YES";
        }

        if (frequencyOccurrence.size() == 2) {
            List<Integer> frequencies = new ArrayList<>(frequencyOccurrence.keySet());
            int frequency1 = frequencies.get(0);
            int frequency2 = frequencies.get(1);

            if (frequency1 == 1 && frequencyOccurrence.get(frequency1) == 1
                    || frequency2 == 1 && frequencyOccurrence.get(frequency2) == 1) {
                return "YES";
            }

            if (Math.abs(frequency1 - frequency2) == 1) {
                if (frequencyOccurrence.get(frequency1) == 1 || frequencyOccurrence.get(frequency2) == 1) {
                    return "YES";
                }
            }
        }

        return "NO";
    }

}
