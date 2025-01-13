package problem85_Pangrams;

import java.util.HashSet;
import java.util.Set;

public class Pangrams {

    public static void main(String[] args) {
        System.out.println(pangrams("a_bc"));
        System.out.println(pangrams("AB    cdefghijklmnOPQ rstuvwxyz"));
    }

    private static String pangrams(String s) {
        Set<Character> characters = new HashSet<>();
        for (char c : s.toLowerCase().toCharArray()) {
            if (Character.isAlphabetic(c)) {
                characters.add(c);
            }
        }
        return characters.size() == 26 ? "pangram" : "not pangram";
    }

}
