package problem80_HackerRankInString;

public class HackerRankInString {

    public static void main(String[] args) {
        System.out.println(hackerrankInString("hereiamstackerrank"));
        System.out.println(hackerrankInString("hackerworld"));
    }

    private static String hackerrankInString(String s) {
        String hackerrank = "hackerrank";
        int pointer = 0;

        for(char c : s.toCharArray()) {
            if(c == hackerrank.charAt(pointer) ) {
                pointer++;
            }

            if(pointer == hackerrank.length()) {
                return "YES";
            }
        }
        return "NO";
    }

}
