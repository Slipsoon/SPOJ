import java.io.PrintStream;
import java.util.*;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static PrintStream out = System.out;

    public static void getDates(int t) {

        List<String> storedDays = new ArrayList<>();
        int testCase = 0;

        while (testCase != t) {
//            System.out.print("Date: ");
            int date = scanner.nextInt();

//            System.out.print("Month: ");
            int month = scanner.nextInt();

//            System.out.print("Year ");
            int year = scanner.nextInt();

            storedDays.add(calculateDay(date, month, year));

            testCase++;
        }

        for(String date : storedDays) {
            out.println(date);
        }
    }

    public static String calculateDay(int day, int month, int year) {

        Date date = new GregorianCalendar(year, month - 1, day).getTime();

        Calendar c = Calendar.getInstance();
        c.setTime(date);
        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);

        switch (dayOfWeek) {

            case 1:
                return "Sunday";

            case 2:
                return "Monday";

            case 3:
                return "Tuesday";

            case 4:
                return "Wednesday";

            case 5:
                return "Thursday";

            case 6:
                return "Friday";

            case 7:
                return "Saturday";
        }

        return date + " ";
    }


    public static void main(String[] args) {

//        System.out.print("How many test cases: ");
        int t = scanner.nextInt();

        if (t >= 1 && t <= 100) {
            getDates(t);
        } else {
            System.out.println("Out of test range 1-100");
        }
    }
}
