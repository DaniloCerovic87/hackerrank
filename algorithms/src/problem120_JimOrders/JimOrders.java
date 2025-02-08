package problem120_JimOrders;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class JimOrders {

    public static void main(String[] args) {
        List<List<Integer>> orders = new ArrayList<>();

        orders.add(Arrays.asList(8, 1));
        orders.add(Arrays.asList(4, 2));
        orders.add(Arrays.asList(5, 6));
        orders.add(Arrays.asList(3, 1));
        orders.add(Arrays.asList(2, 2));
        orders.add(Arrays.asList(4, 3));

        System.out.println(jimOrders(orders));
    }

    private static List<Integer> jimOrders(List<List<Integer>> orders) {
        List<int[]> customerDeliveryTimes = new ArrayList<>();

        for (int i = 0; i < orders.size(); i++) {
            int orderTime = orders.get(i).get(0);
            int prepTime = orders.get(i).get(1);
            customerDeliveryTimes .add(new int[]{i + 1, orderTime + prepTime});
        }

        customerDeliveryTimes .sort(Comparator.comparingInt((int[] o) -> o[1])
                .thenComparingInt(o -> o[0]));

        return customerDeliveryTimes .stream().map(o -> o[0]).collect(Collectors.toList());
    }

}
