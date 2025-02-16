package problem126_FlippingBits;

public class FlippingBits {

    public static void main(String[] args) {
        System.out.println(flippingBits(9));
        System.out.println(flippingBitsBitwise(9));
    }

    private static long flippingBits(long n) {
        String binaryInput = Long.toBinaryString(n);
        StringBuilder binaryString = new StringBuilder("1".repeat(64 - binaryInput.length()));

        for (char c : binaryInput.toCharArray()) {
            if (c == '0') {
                binaryString.append("1");
            } else {
                binaryString.append("0");
            }
        }
        return Long.parseLong(binaryString.substring(32), 2);
    }

    public static long flippingBitsBitwise(long n) {
        return ~n & 0xFFFFFFFFL;
    }

}


