package problem13_Kangaroo;

public class Kangaroo {

    public static void main(String[] args) {
        System.out.println(kangaroo(0, 3, 4, 2));
    }

    public static String kangaroo(int x1, int v1, int x2, int v2) {
        int i = 0;
        int firstKangaroo = x1;
        int secondKangaroo = x2;

        while (i <= 10000) {
            firstKangaroo += v1;
            secondKangaroo += v2;

            if (firstKangaroo == secondKangaroo) {
                return "YES";
            }
            i++;
        }
        return "NO";
    }
}
