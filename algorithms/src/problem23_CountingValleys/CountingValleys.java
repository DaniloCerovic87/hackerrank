package problem23_CountingValleys;

public class CountingValleys {

    public static void main(String[] args) {
        System.out.println(countingValleys(8, "UDDDUDUU"));
    }

    private static int countingValleys(int steps, String path) {
        int seaLevel = 0;
        int valleyNumber = 0;

        for (char c : path.toCharArray()) {
            if (c == 'U') {
                if (seaLevel == -1) {
                    valleyNumber++;
                }
                seaLevel++;
            } else {
                seaLevel--;
            }
        }

        return valleyNumber;

    }

}
