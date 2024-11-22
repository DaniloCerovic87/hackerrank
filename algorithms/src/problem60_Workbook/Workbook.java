package problem60_Workbook;

import java.util.Arrays;
import java.util.List;

public class Workbook {

    public static void main(String[] args) {
        System.out.println(workbook(3, Arrays.asList(4, 2)));
        System.out.println(workbook(3, Arrays.asList(4, 2, 6, 1, 10)));
    }

    private static int workbook(int k, List<Integer> arr) {
        int countSpecialCases = 0;
        int pageNumber = 1;

        for (Integer chapterProblems : arr) {
            for (int i = 1; i <= chapterProblems; i++) {
                if (i == pageNumber) {
                    countSpecialCases++;
                }

                if (i % k == 0) {
                    pageNumber++;
                }
            }

            if (chapterProblems % k != 0) {
                pageNumber++;
            }
        }

        return countSpecialCases;
    }
}
