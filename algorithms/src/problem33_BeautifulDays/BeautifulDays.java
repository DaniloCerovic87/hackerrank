package problem33_BeautifulDays;

public class BeautifulDays {

    public static void main(String[] args) {
        System.out.println(beautifulDays(20, 23, 6));
    }

    private static int beautifulDays(int i, int j, int k) {
        int numberOfBeautifulDays = 0;
        StringBuilder sb = new StringBuilder();

        for (int f = i; f <= j; f++) {
            int reversedNumber = Integer.parseInt(sb.append(f).reverse().toString()); // or use the function below
            if ((f - reversedNumber) % k == 0) {
                numberOfBeautifulDays++;
            }
            sb.setLength(0);
        }
        return numberOfBeautifulDays;
    }

    // function for reversing numbers
    private static int reverseNumber(int n) {
        int reversed = 0;
        while (n != 0) {
            reversed = reversed * 10 + n % 10;
            n /= 10;
        }
        return reversed;
    }


}
