package problem69_AbsolutePermutation;

import java.util.ArrayList;
import java.util.List;

public class AbsolutePermutation {

    public static void main(String[] args) {
        System.out.println(absolutePermutation(4, 2));
        System.out.println(absolutePermutation(6, 2));
        System.out.println(absolutePermutation(6, 0));
        System.out.println(absolutePermutation(8, 2));
    }

    public static List<Integer> absolutePermutation(int n, int k) {
        List<Integer> result = new ArrayList<>();

        if(k == 0) {
            for(int i = 1; i <= n; i++) {
                result.add(i);
            }
            return result;
        }

        if(n % (2*k) != 0) {
            result.add(-1);
            return result;
        }

        boolean addK = true;
        for(int i = 1; i <= n; i++) {
            if(addK) {
                result.add(i + k);
            } else {
                result.add(i - k);
            }

            if(i % k == 0) {
                addK = !addK;
            }
        }

        return result;
    }

}
