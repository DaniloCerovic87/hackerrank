package problem98_MakingAnagrams;

import java.util.HashMap;
import java.util.Map;

public class MakingAnagrams {

    public static void main(String[] args) {
        System.out.println(makingAnagrams("abc", "amnop"));
        System.out.println(makingAnagrams("cde", "abc"));
    }


    private static int makingAnagrams(String s1, String s2) {
        int count = 0;
        Map<Character, Integer> firstMap = new HashMap<>();
        Map<Character, Integer> secondMap = new HashMap<>();

        for (char c : s1.toCharArray()) {
            firstMap.put(c, firstMap.getOrDefault(c, 0) + 1);
        }

        for (char c : s2.toCharArray()) {
            secondMap.put(c, secondMap.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : firstMap.entrySet()) {
            char key = entry.getKey();
            int countInFirst = entry.getValue();
            int countInSecond = secondMap.getOrDefault(key, 0);
            count += Math.max(countInFirst - countInSecond, 0);
        }

        for (Map.Entry<Character, Integer> entry : secondMap.entrySet()) {
            char key = entry.getKey();
            int countInSecond = entry.getValue();
            int countInFirst = firstMap.getOrDefault(key, 0);
            count += Math.max(countInSecond - countInFirst, 0);
        }

        return count;
    }

}
