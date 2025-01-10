package problem77_TwoCharacters;

import java.util.*;

public class TwoCharacters {

    public static void main(String[] args) {

        System.out.println(alternate("abaacdabd"));
        System.out.println(alternate("beabeefeab"));

    }

    private static int alternate(String s) {
        Set<Character> characterSet = new HashSet<>();
        for (char c : s.toCharArray()) {
            characterSet.add(c);
        }

        List<Character> characterList = new ArrayList<>(characterSet);
        int maxCount = 0;

        for (int i = 0; i < characterList.size(); i++) {
            for (int j = i + 1; j < characterList.size(); j++) {
                StringBuilder filteredString = new StringBuilder();
                for (char c : s.toCharArray()) {
                    if (c == characterList.get(i) || c == characterList.get(j)) {
                        filteredString.append(c);
                    }
                }

                boolean isValid = true;
                for (int k = 0; k < filteredString.length() - 1; k++) {
                    if (filteredString.charAt(k) == filteredString.charAt(k + 1)) {
                        isValid = false;
                        break;
                    }
                }

                if (isValid) {
                    maxCount = Math.max(maxCount, filteredString.length());
                }
            }
        }

        return maxCount;
    }

}
