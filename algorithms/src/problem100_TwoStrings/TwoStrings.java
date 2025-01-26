package problem100_TwoStrings;

import java.util.HashSet;
import java.util.Set;

public class TwoStrings {

    public static void main(String[] args) {
        System.out.println(twoStrings("ant", "art"));
        System.out.println(twoStrings("be", "cat"));
        System.out.println(twoStrings("hello", "world"));
    }

    private static String twoStrings(String s1, String s2) {
        Set<Character> charsInS1 = new HashSet<>();
        for (char c : s1.toCharArray()) {
            charsInS1.add(c);
        }

        for (char c : s2.toCharArray()) {
            if (charsInS1.contains(c)) {
                return "YES";
            }
        }
        return "NO";
    }

}
