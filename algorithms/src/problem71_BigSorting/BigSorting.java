package problem71_BigSorting;

import java.util.Arrays;
import java.util.List;

public class BigSorting {

    public static void main(String[] args) {
        List<String> unsorted = Arrays.asList(
                "1",
                "2",
                "100",
                "12303479849857341718340192371",
                "3084193741082937",
                "3084193741082938",
                "111",
                "200"
        );

        System.out.println(bigSorting(unsorted));
    }

    public static List<String> bigSorting(List<String> unsorted) {
        unsorted.sort((a, b) -> {
            if(a.length() != b.length()) {
                return a.length() -b.length();
            }

            return a.compareTo(b);
        });
        return unsorted;
    }
}
