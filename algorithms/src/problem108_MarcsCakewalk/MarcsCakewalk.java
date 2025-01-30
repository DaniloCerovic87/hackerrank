package problem108_MarcsCakewalk;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MarcsCakewalk {

    public static void main(String[] args) {
        System.out.println(marcsCakewalk(Arrays.asList(5, 10, 7)));
        System.out.println(marcsCakewalk(Arrays.asList(7, 4, 9, 6)));
    }

    private static long marcsCakewalk(List<Integer> calorie) {
        calorie.sort(Comparator.reverseOrder());
        long minimumMiles = 0;

        for(int i = 0; i < calorie.size(); i++) {
            minimumMiles+= (long) (Math.pow(2, i) * calorie.get(i));
        }

        return minimumMiles;
    }

}
