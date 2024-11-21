package problem53_BiggerIsGreater;

import java.util.Arrays;

public class BiggerIsGreater {

    public static void main(String[] args) {
        System.out.println(biggerIsGreater("dkhc"));
    }

    public static String biggerIsGreater(String w) {
        char[] chars = w.toCharArray();
        int i = chars.length - 1;

        while (i > 0 && chars[i] <= chars[i - 1]) {
            i--;
        }

        if (i == 0) {
            return "no answer";
        }

        char swapElement = w.charAt(i - 1);

        int j = chars.length - 1;

        while (chars[j] <= swapElement) {
            j--;
        }

        chars[i - 1] = chars[j];
        chars[j] = swapElement;

        Arrays.sort(chars, i, chars.length);

        return new String(chars);
    }

}
