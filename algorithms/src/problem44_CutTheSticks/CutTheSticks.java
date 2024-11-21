package problem44_CutTheSticks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CutTheSticks {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(4);
        list.add(4);
        list.add(2);
        list.add(2);
        list.add(8);
        System.out.println(cutTheSticks(list));
    }

    public static List<Integer> cutTheSticks(List<Integer> arr) {
        Collections.sort(arr);
        List<Integer> sticksPerIteration = new ArrayList<>();

        while (!arr.isEmpty()) {
            sticksPerIteration.add(arr.size());
            int minLength = Collections.min(arr);
            arr.removeIf(s -> s == minLength);
            arr = arr.stream().map(a -> a - minLength).collect(Collectors.toList());
        }

        return sticksPerIteration;

    }

}
