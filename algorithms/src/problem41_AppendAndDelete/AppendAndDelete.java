package problem41_AppendAndDelete;

public class AppendAndDelete {

    public static void main(String[] args) {
        System.out.println(appendAndDelete("aaaaaaaaaa", "hackerrank", 9));
        System.out.println(appendAndDelete("hackerhappy", "hackerrank", 9));
    }

    public static String appendAndDelete(String s, String t, int k) {

        if (s.length() + t.length() <= k) {
            return "YES";
        }

        String prefix = getCommonPrefix(s, t);

        int fromInitialWordToPrefix = s.length() - prefix.length();
        int fromPrefixToFinalWord = t.length() - prefix.length();
        int minOperationsNeeded = fromInitialWordToPrefix + fromPrefixToFinalWord;

        if (k == minOperationsNeeded) {
            return "Yes";
        }

        if (k > minOperationsNeeded && (k - minOperationsNeeded) % 2 == 0) {
            return "Yes";
        }

        return "No";
    }

    public static String getCommonPrefix(String s, String t) {
        StringBuilder commonPrefix = new StringBuilder();
        int length = Math.min(s.length(), t.length());

        for (int i = 0; i < length; i++) {
            if (s.charAt(i) == t.charAt(i)) {
                commonPrefix.append(s.charAt(i));
            } else {
                break;
            }
        }
        return commonPrefix.toString();
    }
}
