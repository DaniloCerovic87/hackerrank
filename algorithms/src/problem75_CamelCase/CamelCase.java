package problem75_CamelCase;

public class CamelCase {

    public static void main(String[] args) {
        System.out.println(camelcase("manOrderedTwoCupsOfCoffee"));
    }

    private static int camelcase(String s) {
       int countUpperCase = 0;
       for(String c : s.split("")) {
           if(c.equals(c.toUpperCase())) {
               countUpperCase++;
           }
       }
       return countUpperCase + 1;
    }

}
