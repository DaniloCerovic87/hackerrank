package problem62_FairRations;

import java.util.ArrayList;
import java.util.List;

public class FairRations {

    public static void main(String[] args) {
        List<Integer> breads1 = new ArrayList<>();
        breads1.add( 4 );
        breads1.add( 5 );
        breads1.add( 6 );
        breads1.add( 7 );

        System.out.println(fairRations( breads1 ));

        List<Integer> breads2 = new ArrayList<>();
        breads2.add( 2 );
        breads2.add( 3 );
        breads2.add( 4 );
        breads2.add( 5 );
        breads2.add( 6 );

        System.out.println(fairRations( breads2 ));

        List<Integer> breads3 = new ArrayList<>();
        breads3.add( 1 );
        breads3.add( 2 );

        System.out.println(fairRations( breads3 ));

    }

    private static String fairRations(List<Integer> breads) {
        int count = 0;
        int size = breads.size();

        for (int i = 0; i < size - 1; i++) {
            if (breads.get( i ) % 2 == 1) {
                breads.set( i, breads.get( i ) + 1 );
                breads.set( i + 1, breads.get( i + 1 ) + 1 );
                count += 2;
            }
        }

        if (breads.get( size - 1 ) % 2 == 1) {
            return "NO";
        } else {
            return String.valueOf( count );
        }
    }

}
