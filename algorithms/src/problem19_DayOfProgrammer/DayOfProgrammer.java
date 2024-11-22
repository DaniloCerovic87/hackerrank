package problem19_DayOfProgrammer;

public class DayOfProgrammer {

    public static void main(String[] args) {
        System.out.println(dayOfProgrammer(2018));
        System.out.println(dayOfProgrammer(1918));
        System.out.println(dayOfProgrammer(1750));
    }

    private static String dayOfProgrammer(int year) {
        String day;

        if (year == 1918) {
            day = "26.09.";
        } else if (year > 1918) {
            day = (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) ? "12.09." : "13.09.";
        } else {
            day = (year % 4 == 0) ? "12.09." : "13.09.";
        }

        return day + year;
    }

}
