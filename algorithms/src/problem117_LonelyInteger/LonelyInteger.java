package problem117_LonelyInteger;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LonelyInteger {

    public static void main(String[] args) {
        System.out.println(lonelyInteger(Arrays.asList(1, 2, 3, 4, 3, 2, 1)));
        System.out.println(lonelyIntegerXOR(Arrays.asList(1, 2, 3, 4, 3, 2, 1)));
    }

    private static int lonelyInteger(List<Integer> a) {
        Map<Integer, Integer> numberOccurrences = new HashMap<>();

        for(Integer el : a) {
            numberOccurrences.put(el, numberOccurrences.getOrDefault(el, 0) + 1);
        }

        return numberOccurrences.entrySet().stream()
                .filter(e -> e.getValue() == 1)
                .findFirst()
                .orElseThrow(RuntimeException::new)
                .getKey();
    }

    private static int lonelyIntegerXOR(List<Integer> a) {
        int result = 0;

        for(Integer el : a) {
            result ^= el;
        }

        return result;
    }

}
