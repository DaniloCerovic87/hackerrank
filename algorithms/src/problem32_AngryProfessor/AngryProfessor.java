package problem32_AngryProfessor;

import java.util.Arrays;
import java.util.List;

public class AngryProfessor {

    public static void main(String[] args) {
        System.out.println(angryProfessor(3, Arrays.asList(1, 2, 4, -1, -2)));
        System.out.println(angryProfessor(3, Arrays.asList(1, 2, 0, -1, -2)));
    }

    public static String angryProfessor(int k, List<Integer> a) {
        int countOnTime = 0;

        for (Integer e : a) {
            if (e <= 0) {
                countOnTime++;
            }

            if (countOnTime == k) {
                return "NO";
            }
        }

        return "YES";

    }

}
