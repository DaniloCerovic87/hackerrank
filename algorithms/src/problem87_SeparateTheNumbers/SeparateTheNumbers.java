package problem87_SeparateTheNumbers;

public class SeparateTheNumbers {

    public static void main(String[] args) {
        separateNumbers("10203");
        separateNumbers("1234");
        separateNumbers("99100101");
    }

    private static void separateNumbers(String s) {
        for (int i = 1; i <= s.length() / 2; i++) {
            String firstNumberStr = s.substring(0, i);

            if (firstNumberStr.length() > 1 && firstNumberStr.charAt(0) == '0') {
                continue;
            }

            long firstNumber = Long.parseLong(firstNumberStr);
            String remaining = s.substring(i);

            long currentNumber = firstNumber;
            boolean isBeautiful = true;

            while (!remaining.isEmpty()) {
                String nextNumberStr = String.valueOf(currentNumber + 1);
                int nextNumberLength = nextNumberStr.length();

                if (remaining.length() < nextNumberLength) {
                    isBeautiful = false;
                    break;
                }

                String nextNumberInString = remaining.substring(0, nextNumberLength);

                if (!nextNumberInString.equals(nextNumberStr)) {
                    isBeautiful = false;
                    break;
                }

                remaining = remaining.substring(nextNumberLength);
                currentNumber++;
            }

            if (isBeautiful) {
                System.out.println("YES " + firstNumber);
                return;
            }
        }

        System.out.println("NO");
    }

}
