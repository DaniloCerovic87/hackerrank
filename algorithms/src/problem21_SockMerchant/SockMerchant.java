package problem21_SockMerchant;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SockMerchant {

    public static void main(String[] args) {
        System.out.println(sockMerchant(7, Arrays.asList(1, 2, 1, 2, 1, 3, 2)));
    }

    public static int sockMerchant(int n, List<Integer> ar) {
        int count = 0;
        Map<Integer, Integer> countByType = new HashMap<>();

        for (Integer sock : ar) {
            int sockTypeCount = countByType.getOrDefault(sock, 0) + 1;
            if (sockTypeCount % 2 == 0) {
                count++;
            }
            countByType.put(sock, sockTypeCount);
        }

        return count;

    }

}
