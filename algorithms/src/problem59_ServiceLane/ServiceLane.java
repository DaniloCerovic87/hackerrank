package problem59_ServiceLane;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ServiceLane {

    public static void main(String[] args) {

        List<Integer> width = new ArrayList<>(Arrays.asList(2, 3, 1, 2, 3, 2, 3, 3));
        List<List<Integer>> cases = new ArrayList<>();
        cases.add(Arrays.asList(0, 3));
        cases.add(Arrays.asList(4, 6));
        cases.add(Arrays.asList(6, 7));
        cases.add(Arrays.asList(3, 5));
        cases.add(Arrays.asList(0, 7));
        System.out.println(serviceLane( cases, width ));
    }

    public static List<Integer> serviceLane(List<List<Integer>> cases, List<Integer> width) {
        List<Integer> result = new ArrayList<>();

        for(List<Integer> c : cases) {
            int min = Integer.MAX_VALUE;
            for(int i = c.get( 0 ); i <= c.get( 1 ); i++) {
                Integer element = width.get( i );
                if(element < min) {
                    min = element;
                }
            }
            result.add( min );
        }

        return result;

    }


}
