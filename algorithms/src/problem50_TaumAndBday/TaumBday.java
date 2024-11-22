package problem50_TaumAndBday;

public class TaumBday {

    public static void main(String[] args) {
        System.out.println(taumBday(3, 5, 3, 4, 1));
    }

    private static long taumBday(int b, int w, int bc, int wc, int z) {
        if (wc > bc + z) {
            return (long) b * bc + (long) w * (bc + z);
        } else if (bc > wc + z) {
            return (long) b * (wc + z) + (long) w * wc;
        } else {
            return (long) b * bc + (long) w * wc;
        }

    }

}
