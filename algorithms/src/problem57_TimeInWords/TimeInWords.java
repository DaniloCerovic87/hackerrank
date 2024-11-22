package problem57_TimeInWords;

import java.util.HashMap;
import java.util.Map;

public class TimeInWords {

    public static void main(String[] args) {

        System.out.println(timeInWords(1, 1));
        System.out.println(timeInWords(5, 15));
        System.out.println(timeInWords(4, 45));

    }

    private static String timeInWords(int h, int m) {
        Map<Integer, String> numToWords = createNumToWordsMap();

        String hour = numToWords.get(h);
        String nextHour = numToWords.get(h == 12 ? 1 : h + 1);
        String minutesString = "minutes";
        String past = "past";
        String to = "to";

        if (m == 0) {
            return hour + " o' clock";
        }

        if (m <= 30) {
            if (m == 15 || m == 30) {
                return numToWords.get(m) + " " + past + " " + hour;
            }

            return numToWords.get(m) + " " + (m == 1 ? "minute" : minutesString) + " " + past + " " + hour;
        }

        int minutesToNextHour = 60 - m;
        if (minutesToNextHour == 15) {
            return numToWords.get(minutesToNextHour) + " " + to + " " + nextHour;
        }
        return numToWords.get(minutesToNextHour) + " " + minutesString + " " + to + " " + nextHour;
    }

    private static Map<Integer, String> createNumToWordsMap() {
        Map<Integer, String> numToWords = new HashMap<>();
        numToWords.put(1, "one");
        numToWords.put(2, "two");
        numToWords.put(3, "three");
        numToWords.put(4, "four");
        numToWords.put(5, "five");
        numToWords.put(6, "six");
        numToWords.put(7, "seven");
        numToWords.put(8, "eight");
        numToWords.put(9, "nine");
        numToWords.put(10, "ten");
        numToWords.put(11, "eleven");
        numToWords.put(12, "twelve");
        numToWords.put(13, "thirteen");
        numToWords.put(14, "fourteen");
        numToWords.put(15, "quarter");
        numToWords.put(16, "sixteen");
        numToWords.put(17, "seventeen");
        numToWords.put(18, "eighteen");
        numToWords.put(19, "nineteen");
        numToWords.put(20, "twenty");
        numToWords.put(21, "twenty one");
        numToWords.put(22, "twenty two");
        numToWords.put(23, "twenty three");
        numToWords.put(24, "twenty four");
        numToWords.put(25, "twenty five");
        numToWords.put(26, "twenty six");
        numToWords.put(27, "twenty seven");
        numToWords.put(28, "twenty eight");
        numToWords.put(29, "twenty nine");
        numToWords.put(30, "half");
        return numToWords;
    }


}
