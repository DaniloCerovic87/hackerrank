package problem37_PermutationEquation;

import java.util.*;

public class PermutationEquation {

    public static void main(String[] args) {
        System.out.println(permutationEquation(Arrays.asList(5, 2, 1, 3, 4)));
    }

    private static List<Integer> permutationEquation(List<Integer> p) {
        Map<Integer, Integer> positionMap = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        int size = p.size();

        for (int i = 0; i < size; i++) {
            positionMap.put(p.get(i), i + 1);
        }

        for (int i = 1; i <= size; i++) {
            int positionX = positionMap.get(i);
            int positionY = positionMap.get(positionX);
            result.add(positionY);
        }

        return result;
    }
}

