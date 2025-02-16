package problem125_SumXor;

public class SumXor {

    public static void main(String[] args) {
        System.out.println(sumXor(4));
        System.out.println(sumXor(5));
    }

    private static long sumXor(long n) {
        int result = 0;
        String binary = Long.toBinaryString(n);

        if (n == 0) {
            return 1;
        }

        for (char c : binary.toCharArray()) {
            if (c == '0') {
                result++;
            }
        }
        return (long) Math.pow(2, result);
    }

}
