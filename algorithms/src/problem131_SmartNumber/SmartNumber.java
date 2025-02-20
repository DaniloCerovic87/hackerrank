package problem131_SmartNumber;

public class SmartNumber {

    public static void main(String[] args) {
        System.out.println(isSmartNumber(25));
        System.out.println(isSmartNumber(64));
        System.out.println(isSmartNumber(18));
    }

    private static boolean isSmartNumber(int num) {
        int val = (int) Math.sqrt(num);
        if(val * val == num)
            return true;
        return false;
    }

}
