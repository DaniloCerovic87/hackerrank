package problem97_Anagram;

import java.util.HashMap;
import java.util.Map;

public class Anagram {

    public static void main(String[] args) {
        System.out.println(anagram("a"));
        System.out.println(anagram("ab"));
        System.out.println(anagram("aaabbb"));
        System.out.println(anagram("xaxbbbxx"));
        System.out.println(anagram("abab"));
    }

    private static int anagram(String s) {
        int length = s.length();
        if (length % 2 == 1) {
            return -1;
        }

        int count = 0;

        String first = s.substring(0, length / 2);
        String second = s.substring(length / 2);

        Map<Character, Integer> firstMap = new HashMap<>();
        Map<Character, Integer> secondMap = new HashMap<>();

        for (char c : first.toCharArray()) {
            firstMap.put(c, firstMap.getOrDefault(c, 0) + 1);
        }

        for (char c : second.toCharArray()) {
            secondMap.put(c, secondMap.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : firstMap.entrySet()) {
            char key = entry.getKey();
            int countInFirst = entry.getValue();
            int countInSecond = secondMap.getOrDefault(key, 0);
            count += Math.max(countInFirst - countInSecond, 0);
        }

        return count;
    }

}
