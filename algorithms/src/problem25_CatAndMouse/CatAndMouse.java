package problem25_CatAndMouse;

public class CatAndMouse {

    public static void main(String[] args) {
        System.out.println(catAndMouse(2, 5, 4));
        System.out.println(catAndMouse(1, 2, 3));
        System.out.println(catAndMouse(1, 3, 2));

    }

    public static String catAndMouse(int x, int y, int z) {
        int distanceFromCatA = Math.abs(x - z);
        int distanceFromCatB = Math.abs(y - z);

        if (distanceFromCatA < distanceFromCatB) {
            return "Cat A";
        } else if (distanceFromCatA > distanceFromCatB) {
            return "Cat B";
        } else {
            return "Mouse C";
        }
    }
}
