package problem75_CamelCase;

public class CamelCase {

    public static void main(String[] args) {
        System.out.println(camelcase("saveChangesInTheEditor"));
    }

    private static int camelcase(String s) {
       int count = 1;
       for(int i = 0; i < s.length(); i++) {
           if(Character.isUpperCase(s.charAt(i))) {
               count++;
           }
       }
       return count;
    }

}
