package problem132_MisereNim1;

import java.util.Arrays;
import java.util.List;

public class MisereNim1 {

    public static void main(String[] args) {
        System.out.println(misereNim(Arrays.asList(1, 1)));
        System.out.println(misereNim(Arrays.asList(2, 1, 3)));
    }

    private static String misereNim(List<Integer> s) {
        boolean allOnes = true;
        for (int e : s) {
            if (e != 1) {
                allOnes = false;
                break;
            }
        }

        if (allOnes) {
            if (s.size() % 2 == 1) {
                return "Second";
            } else {
                return "First";
            }
        }

        int result = 0;
        for (int e : s) {
            result ^= e;
        }

        if (result == 0) {
            return "Second";
        }
        return "First";
    }

}
