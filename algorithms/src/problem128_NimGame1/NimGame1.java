package problem128_NimGame1;

import java.util.Arrays;
import java.util.List;

public class NimGame1 {

    public static void main(String[] args) {
        System.out.println(nimGame(Arrays.asList(2, 3, 4)));
        System.out.println(nimGame(Arrays.asList(2, 1, 4)));
    }

    private static String nimGame(List<Integer> pile) {
        int result = 0;

        for (int e : pile) {
            result ^= e;
        }

        if (result == 0) {
            return "Second";
        }

        return "First";
    }

}
