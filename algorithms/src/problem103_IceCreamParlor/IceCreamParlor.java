package problem103_IceCreamParlor;

import java.util.*;

public class IceCreamParlor {

    public static void main(String[] args) {
        System.out.println(iceCreamParlor(6, Arrays.asList(1, 3, 4, 5, 6)));
        System.out.println(iceCreamParlor(4, Arrays.asList(1, 4, 5, 3, 2)));
        System.out.println(iceCreamParlor(4, Arrays.asList(2, 2, 4, 3)));
    }

    private static List<Integer> iceCreamParlor(int m, List<Integer> arr) {
        Map<Integer, Integer> priceToIndex = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < arr.size(); i++) {
            int el = arr.get(i);
            int complement = m - el;
            if (priceToIndex.containsKey(complement)) {
                result.add(priceToIndex.get(complement));
                result.add(i + 1);
                Collections.sort(result);
                return result;
            }
            priceToIndex.put(el, i + 1);
        }

        return Collections.emptyList();
    }

}
