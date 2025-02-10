package problem123_TwoArrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class  TwoArrays {

    public static void main(String[] args) {
        System.out.println(twoArrays(10, Arrays.asList(2, 1, 3), Arrays.asList(7, 8, 9)));
        System.out.println(twoArrays(5, Arrays.asList(1, 2, 2, 1), Arrays.asList(3, 3, 3, 4)));
    }

    private static String twoArrays(int k, List<Integer> A, List<Integer> B) {
        Collections.sort(A);
        Collections.sort(B, Comparator.reverseOrder());

        int n = A.size();
        for(int i = 0; i < n; i++) {
            if(A.get(i) + B.get(i) < k) {
                return "NO";
            }
        }
        return "YES";
    }

}
