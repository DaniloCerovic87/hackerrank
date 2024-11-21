package problem42_SherlockAndSquares;

public class SherlockAndSquares {

    public static void main(String[] args) {
        System.out.println(squares(25, 50));
    }

    public static int squares(int a, int b) {
        int start = (int) Math.ceil(Math.sqrt(a));
        int end = (int) Math.floor(Math.sqrt(b));
        return end - start + 1;
    }

}


