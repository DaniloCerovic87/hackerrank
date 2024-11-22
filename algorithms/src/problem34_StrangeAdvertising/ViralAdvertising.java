package problem34_StrangeAdvertising;

public class ViralAdvertising {


    public static void main(String[] args) {
        System.out.println(viralAdvertising(3));
    }

    private static int viralAdvertising(int n) {
        int numberOfLikes = 2;
        int cumulativeLikes = numberOfLikes;

        for (int i = 2; i <= n; i++) {
            numberOfLikes = numberOfLikes * 3 / 2;
            cumulativeLikes += numberOfLikes;
        }

        return cumulativeLikes;
    }

}
