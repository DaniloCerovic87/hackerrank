package problem9_BirthdayCakeCandles;

import java.util.Arrays;
import java.util.List;

public class BirthdayCakeCandles {

    public static void main(String[] args) {
        System.out.println(birthdayCakeCandles(Arrays.asList(4, 4, 1, 3)));
    }

    private static int birthdayCakeCandles(List<Integer> candles) {
        int max = Integer.MIN_VALUE;
        int count = 0;

        for (int candle : candles) {
            if (candle > max) {
                max = candle;
                count = 1;
            } else if (candle == max) {
                count++;
            }
        }
        return count;
    }
}
