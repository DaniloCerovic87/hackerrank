package problem90_AlternatingCharacters;

public class AlternatingCharacters {

    public static void main(String[] args) {
        System.out.println(alternatingCharacters("AAAA"));
        System.out.println(alternatingCharacters("AABAAB"));
        System.out.println(alternatingCharacters("ABABABAB"));
    }

    public static int alternatingCharacters(String s) {
       char[] elements = s.toCharArray();
       char currentElement =  s.charAt(0);
       int count = 0;

       for(int i = 1; i < s.length(); i++) {
           if(currentElement == s.charAt(i)) {
               count++;
           } else {
               currentElement = elements[i];
           }
       }
       return count;
    }

}
