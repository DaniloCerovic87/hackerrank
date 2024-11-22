package problem18_MigratoryBirds;

import java.util.*;

public class MigratoryBirds {

    public static void main(String[] args) {
        System.out.println(migratoryBirds(Arrays.asList(1, 1, 2, 2, 3)));

    }

    private static int migratoryBirds(List<Integer> arr) {
        Map<Integer, Integer> typeCounts = new HashMap<>();

        for (Integer integer : arr) {
            typeCounts.put(integer, typeCounts.getOrDefault(integer, 0) + 1);
        }

        return typeCounts.entrySet().stream()
                .sorted(Comparator.comparing(Map.Entry<Integer, Integer>::getValue).reversed()
                        .thenComparing(Map.Entry::getKey)).findFirst()
                .get().getKey();
    }

    //najbolje resenje
    public static int migratoryBirds2(List<Integer> arr) {
        int ans = Integer.MIN_VALUE;
        int max = 0;
        int value;
        HashMap<Integer, Integer> typeCounts = new HashMap<>();
        for (int i = 0; i < arr.size(); i++) {
            value = arr.get(i);
            typeCounts.put(value, typeCounts.getOrDefault(value, 0) + 1);


            if (typeCounts.get(value) > max) {
                max = typeCounts.get(value);
                ans = value;
            } else if (typeCounts.get(value) == max) {
                if (value < ans) {
                    ans = value;
                }
            }
        }
        return ans;
    }


}
