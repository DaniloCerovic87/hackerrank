package problem10_TimeConversion;

public class TimeConversion {

    public static void main(String[] args) {

        System.out.println(timeConversion("07:05:45PM"));
        System.out.println(timeConversion("12:05:45PM"));
        System.out.println(timeConversion("12:05:45AM"));

    }

    public static String timeConversion(String s) {
        String[] parts = s.split(":");
        String part1 = parts[0];
        boolean isAM = s.endsWith("AM");

        int hours = Integer.parseInt(part1);
        int resultHours;
        boolean is12Hours = hours == 12;

        if (isAM) {
            resultHours = is12Hours ? 0 : hours;
        } else {
            resultHours = is12Hours ? 12 : hours + 12;
        }

//      String hoursString = resultHours < 10 ? "0" + resultHours : String.valueOf(resultHours);
        String hoursString = String.format("%02d", resultHours);
        return hoursString + ":" + parts[1] + ":" + parts[2].substring(0, 2);
    }


}
