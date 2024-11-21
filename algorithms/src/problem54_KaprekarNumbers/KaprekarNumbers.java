package problem54_KaprekarNumbers;

public class KaprekarNumbers {

    public static void main(String[] args) {
        kaprekarNumbers(1, 99999);
    }

    public static void kaprekarNumbers(int p, int q) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = p; i <= q; i++) {
            long quadratic = (long) i * i;
            String numberString = String.valueOf(quadratic);
            int leftSideLength = numberString.length() / 2;


            int left = leftSideLength == 0 ? 0 : Integer.parseInt(numberString.substring(0, leftSideLength));
            int right = Integer.parseInt(numberString.substring(leftSideLength));
            if (left + right == i) {
                stringBuilder.append(i).append(" ");
            }

        }

        if (!stringBuilder.isEmpty()) {
            System.out.println(stringBuilder.toString().trim());
        } else {
            System.out.println("INVALID RANGE");
        }

    }
}
