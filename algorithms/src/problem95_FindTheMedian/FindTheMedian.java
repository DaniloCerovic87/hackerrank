package problem95_FindTheMedian;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindTheMedian {

    public static void main(String[] args) {
        System.out.println(findMedian(Arrays.asList(5, 3, 1, 2, 4)));
        System.out.println(findMedian(Arrays.asList(0, 1, 2, 4, 6, 5, 3)));
    }

    private static int findMedian(List<Integer> arr) {
        Collections.sort(arr);
        int index = arr.size() / 2;
        return arr.get(index);
    }

}
