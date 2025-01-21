package problem91_BeautifulBinaryString;

public class BeautifulBinaryString {

    public static void main(String[] args) {
        System.out.println(beautifulBinaryString("01010"));
        System.out.println(beautifulBinaryString("0100010001010100"));
    }

    private static int beautifulBinaryString(String b) {
        int count = 0;

        for (int i = 0; i < b.length() - 2; i++) {
            if (b.startsWith("010", i)) {
                count++;
                i += 2;
            }
        }
        return count;
    }

}
