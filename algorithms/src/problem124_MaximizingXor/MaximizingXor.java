package problem124_MaximizingXor;

public class MaximizingXor {


    public static void main(String[] args) {
        System.out.println(maximizingXor(11, 12));
        System.out.println(maximizingXor(10, 15));
    }

    private static int maximizingXor(int l, int r) {
        int maxValue = Integer.MIN_VALUE;

        for(int i = l; i <= r; i++) {
            for(int j = i; j <= r; j++) {
                int value = i ^ j;
                maxValue = Math.max(value, maxValue);
            }
        }
        return maxValue;
    }

}
