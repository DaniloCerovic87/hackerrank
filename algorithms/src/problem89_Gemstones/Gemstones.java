package problem89_Gemstones;

import java.util.*;

public class Gemstones {

    public static void main(String[] args) {
        System.out.println(gemstones(Arrays.asList("abcdde", "baccd", "eeabg")));
    }

    private static int gemstones(List<String> arr) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int count = 0;
        for (char c : alphabet.toCharArray()) {
            if (arr.stream().allMatch(s -> s.indexOf(c) != -1)) {
                count++;
            }
        }

        return count;
    }

}
