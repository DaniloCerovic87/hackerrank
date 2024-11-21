package problem40_ExtraLongFactorials;

import java.math.BigInteger;

public class ExtraLongFactorials {

    public static void main(String[] args) {
        extraLongFactorials(30);
    }

    public static void extraLongFactorials(int n) {
        BigInteger result = BigInteger.ONE;

        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }

        System.out.println(result);
    }
}
