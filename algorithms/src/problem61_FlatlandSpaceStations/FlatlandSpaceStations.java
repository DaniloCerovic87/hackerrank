package problem61_FlatlandSpaceStations;

import java.util.Arrays;

public class FlatlandSpaceStations {

    public static void main(String[] args) {
        System.out.println(flatlandSpaceStations( 3, new int[]{1} ));
        System.out.println(flatlandSpaceStations( 5, new int[]{0, 4} ));
    }

    static int flatlandSpaceStations(int n, int[] c) {
        Arrays.sort( c );

        int maximumDistance = 0;

        maximumDistance = Math.max( maximumDistance, c[0] );

        maximumDistance = Math.max( maximumDistance, n - 1 - c[c.length - 1] );

        for(int i = 1; i < c.length; i++) {
            int gap = c[i] - c[i-1];
            maximumDistance = Math.max( maximumDistance, gap/2 );
        }

        return maximumDistance;
    }
}
