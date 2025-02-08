package problem121_BeautifulPairs;

import java.util.*;

public class BeautifulPairs {

    public static void main(String[] args) {
        List<Integer> a1 = Arrays.asList(1, 2, 3, 4);
        List<Integer> b1 = Arrays.asList(1, 2, 3, 3);
        System.out.println(beautifulPairs(a1, b1));

        List<Integer> a2 = Arrays.asList(3, 5, 7, 11, 5, 8);
        List<Integer> b2 = Arrays.asList(5, 7, 11, 10, 5, 8);
        System.out.println(beautifulPairs(a2, b2));
    }

    private static int beautifulPairs(List<Integer> A, List<Integer> B) {
        int result = 0;
        Map<Integer, Integer> frequencyA = new HashMap<>();

        for (Integer el : A) {
            frequencyA.put(el, frequencyA.getOrDefault(el, 0) + 1);
        }

        for (Integer e : B) {
            if (frequencyA.getOrDefault(e, 0) > 0) {
                result++;
                frequencyA.put(e, frequencyA.get(e) - 1);
            }
        }

        return (result == A.size()) ? result - 1 : result + 1;
    }

}
