package problem51_OrganizingContainersOfBalls;

import java.util.Arrays;
import java.util.List;

public class ContainersOfBalls {

    public static void main(String[] args) {
        List<List<Integer>> matrix = Arrays.asList(Arrays.asList(1, 4), Arrays.asList(2, 3));
        System.out.println(organizingContainers(matrix));
    }

    private static String organizingContainers(List<List<Integer>> container) {
        int size = container.size();
        int[] numberPerContainer = new int[size];
        int[] numberPerType = new int[size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                numberPerContainer[i] += container.get(i).get(j);
                numberPerType[i] += container.get(j).get(i);
            }
        }

        Arrays.sort(numberPerContainer);
        Arrays.sort(numberPerType);

        for (int i = 0; i < size; i++) {
            if (numberPerContainer[i] != numberPerType[i]) {
                return "Impossible";
            }
        }

        return "Possible";
    }
}
