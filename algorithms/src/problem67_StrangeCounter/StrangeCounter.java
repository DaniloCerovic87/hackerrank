package problem67_StrangeCounter;

public class StrangeCounter {

    public static void main(String[] args) {
        System.out.println(strangeCounter(14));

    }

    public static long strangeCounter(long t) {
        long cycleStart = 1;
        long cycleLength = 3;

        while (t >= cycleStart + cycleLength) {
            cycleStart += cycleLength;
            cycleLength = cycleLength * 2;
        }

        return cycleStart + cycleLength - t;
    }

}
