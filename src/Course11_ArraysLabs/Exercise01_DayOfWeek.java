package Course11_ArraysLabs;

import java.util.Scanner;

public class Exercise01_DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] weekDays = new String[7];
        weekDays[0] = "Monday";
        weekDays[1] = "Tuesday";
        weekDays[2] = "Wednesday";
        weekDays[3] = "Thursday";
        weekDays[4] = "Friday";
        weekDays[5] = "Saturday";
        weekDays[6] = "Sunday";

        int dayselector = scanner.nextInt();
        if (dayselector < 1 || dayselector > 7) {
            System.out.println("Invalid Day!");
        } else {
            System.out.println(weekDays[dayselector - 1]);
        }
    }
}
