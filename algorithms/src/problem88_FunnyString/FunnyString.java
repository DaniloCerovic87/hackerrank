package problem88_FunnyString;

public class FunnyString {

    public static void main(String[] args) {
        System.out.println(funnyString("ponml"));
        System.out.println(funnyString("bcxz"));
    }

    private static String funnyString(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (right > 0 && left < s.length() - 1) {
            if (Math.abs(s.charAt(left) - s.charAt(left + 1))
                    != Math.abs(s.charAt(right) - s.charAt(right - 1))) {
                return "Not Funny";
            }
            left++;
            right--;
        }
        return "Funny";
    }
}
