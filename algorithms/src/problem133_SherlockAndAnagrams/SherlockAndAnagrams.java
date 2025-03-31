package problem133_SherlockAndAnagrams;

import java.util.*;

public class SherlockAndAnagrams {

    public static void main(String[] args) {
        System.out.println(sherlockAndAnagrams("abba"));
        System.out.println(sherlockAndAnagrams("kkkk"));
    }

    private static int sherlockAndAnagrams(String s) {
        Map<String, Integer> substringCount = new HashMap<>();
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String current = s.substring(i, j);
                char[] chars = current.toCharArray();
                Arrays.sort(chars);
                String currentSorted = new String(chars);
                substringCount.put(currentSorted, substringCount.getOrDefault(currentSorted, 0) + 1);
            }
        }

        for (Integer count : substringCount.values()) {
            if (count > 1) {
                result += count * (count - 1) / 2;
            }
        }

        return result;
    }

}
