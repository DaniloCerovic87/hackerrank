package problem30_DesignPdfViewer;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DesignPdfViewer {

    public static void main(String[] args) {
        List<Integer> values = Arrays.asList
                (1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5);
        System.out.println(designPdfViewer(values, "abc"));

    }

    private static int designPdfViewer(List<Integer> h, String word) {
        Map<Character, Integer> heightMap = new HashMap<>();
        for (int i = 0; i < 26; i++) {
            heightMap.put((char) ('a' + i), h.get(i));
        }

        int maxHeight = 0;
        for (char letter : word.toCharArray()) {
            int letterHeight = heightMap.get(letter);
            maxHeight = Math.max(maxHeight, letterHeight);
        }

        return maxHeight * word.length();
    }
}
