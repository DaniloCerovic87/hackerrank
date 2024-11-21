package problem35_SaveThePrisoner;

public class SaveThePrisoner {

    public static void main(String[] args) {
        System.out.println(saveThePrisoner(7, 19, 2));
        System.out.println(saveThePrisoner(3, 7, 3));

    }

    public static int saveThePrisoner(int n, int m, int s) {
        return (s + m - 1) % n == 0 ? n : (s + m - 1) % n;
    }

}
