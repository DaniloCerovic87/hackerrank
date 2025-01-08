package problem72_SuperReducedString;

public class SuperReducedString {

    public static void main(String[] args) {

        System.out.println(superReducedString("aaabccddd"));
        System.out.println(superReducedString("aaaa"));

    }

    private static String superReducedString(String s) {
        StringBuilder sb = new StringBuilder();

        for(char c : s.toCharArray() ) {
            if(sb.isEmpty() || sb.charAt(sb.length() - 1) != c) {
                sb.append(c);
            } else {
                sb.deleteCharAt(sb.length() - 1);
            }
        }

        if(sb.isEmpty()) {
            return "Empty String";
        }

        return sb.toString();
    }

}
