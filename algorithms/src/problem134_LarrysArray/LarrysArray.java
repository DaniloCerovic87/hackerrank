package problem134_LarrysArray;

import java.util.Arrays;
import java.util.List;

public class LarrysArray {

    public static void main(String[] args) {
        System.out.println(larrysArray(Arrays.asList(1, 6, 5, 2, 4, 3)));
        System.out.println(larrysArray(Arrays.asList(1, 4, 3, 2)));
    }

    private static String larrysArray(List<Integer> A) {
        int countInversions = 0;

        for(int i = 0; i < A.size() - 1; i ++) {
            for(int j = i + 1; j < A.size(); j++) {
                if(A.get(i) > A.get(j)) {
                    countInversions++;
                }
            }
        }

        if(countInversions % 2 == 0) {
            return "YES";
        }

        return "NO";
    }

}
