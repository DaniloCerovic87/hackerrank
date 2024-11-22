package problem47_JumpingOnClouds;

import java.util.Arrays;
import java.util.List;

public class JumpingOnClouds {

    public static void main(String[] args) {
        System.out.println(jumpingOnClouds(Arrays.asList(0, 1, 0, 0, 0, 1, 0)));
    }

    private static int jumpingOnClouds(List<Integer> c) {
        int i = 0;
        int numberOfJumps = 0;

        while (i < c.size() - 1) {
            if (i + 2 < c.size() && c.get(i + 2) == 0) {
                i += 2;
            } else {
                i++;
            }
            numberOfJumps++;

        }

        return numberOfJumps;
    }

}
