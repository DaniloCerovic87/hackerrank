package problem82_RunningTime;

import java.util.Arrays;
import java.util.List;

public class RunningTime {

    public static void main(String[] args) {
        System.out.println(runningTime(Arrays.asList(2, 1, 3, 1, 2)));
        System.out.println(runningTime(Arrays.asList(7, 6, 5, 4, 3, 2, 1)));
    }

    private static int runningTime(List<Integer> arr) {
        int count = 0;
        for (int i = 1; i < arr.size(); i++) {
            int current = arr.get(i);
            int j = i - 1;
            while (j >= 0 && arr.get(j) > current) {
                arr.set(j + 1, arr.get(j));
                count++;
                j--;
            }
            arr.set(j + 1, current);
        }
        return count;
    }

}
