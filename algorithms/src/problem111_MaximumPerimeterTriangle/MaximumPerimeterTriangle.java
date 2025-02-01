package problem111_MaximumPerimeterTriangle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaximumPerimeterTriangle {

    public static void main(String[] args) {
        System.out.println(maximumPerimeterTriangle(Arrays.asList(1, 2, 3, 4, 5, 10)));
        System.out.println(maximumPerimeterTriangle(Arrays.asList(1, 1, 1, 3, 3)));
        System.out.println(maximumPerimeterTriangle(Arrays.asList(1, 1, 1, 2, 3, 5)));
    }

    private static List<Integer> maximumPerimeterTriangle(List<Integer> sticks) {
        List<Integer> result = new ArrayList<>();
        sticks.sort(Comparator.reverseOrder());

        for (int i = 0; i < sticks.size() - 2; i++) {
            int currentElement = sticks.get(i);
            int secondElement = sticks.get(i + 1);
            int thirdElement = sticks.get(i + 2);

            if (secondElement + thirdElement > currentElement) {
                result.add(thirdElement);
                result.add(secondElement);
                result.add(currentElement);
                return result;
            }
        }

        result.add(-1);
        return result;
    }

}
