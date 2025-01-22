package problem92_TheLoveLetterMystery;

public class TheLoveLetterMystery {

    public static void main(String[] args) {
        System.out.println(theLoveLetterMystery("abd"));
        System.out.println(theLoveLetterMystery("abcba"));
        System.out.println(theLoveLetterMystery("abcd"));
        System.out.println(theLoveLetterMystery("cba"));
    }

    private static int theLoveLetterMystery(String s) {
        int count = 0;
        int first = 0;
        int last = s.length() - 1;

        while (first < last) {
            count += Math.abs(s.charAt(first) - s.charAt(last));
            first++;
            last--;
        }
        return count;
    }

}
