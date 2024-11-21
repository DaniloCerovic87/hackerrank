package problem46_RepeatedString;

public class RepeatedString {

    public static void main(String[] args) {

        System.out.println(repeatedString("abc", 10));
        System.out.println(repeatedString("a", 10000));

    }

    public static long repeatedString(String s, long n) {
        int length = s.length();
        long remainder = n % length;
        long numberOfWholeStrings = n / length;

        int countInString = 0;
        for (char c : s.toCharArray()) {
            if (c == 'a') {
                countInString++;
            }
        }

        int countInReminder = 0;
        for (int i = 0; i < remainder; i++) {
            if (s.charAt(i) == 'a') {
                countInReminder++;
            }
        }
        return numberOfWholeStrings * countInString + countInReminder;
    }
}
