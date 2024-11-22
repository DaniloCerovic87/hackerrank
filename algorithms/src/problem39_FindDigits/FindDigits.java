package problem39_FindDigits;

public class FindDigits {

    public static void main(String[] args) {
        System.out.println(findDigits(124));
    }

    private static int findDigits(int n) {
        int count = 0;
        char[] digits = String.valueOf(n).toCharArray();
        for (char c : digits) {
            int number = Character.getNumericValue(c);
            if (number == 0) {
                continue;
            }

            if (n % number == 0) {
                count++;
            }
        }
        return count;
    }

}
