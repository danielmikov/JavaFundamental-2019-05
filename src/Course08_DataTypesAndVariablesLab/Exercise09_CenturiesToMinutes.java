package Course08_DataTypesAndVariablesLab;

import java.util.Scanner;

public class Exercise09_CenturiesToMinutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int centuries = scanner.nextInt();
        int years = centuries * 100;
        // double calculation = years * 365.2422;
        // int days = (int) calculation;
        int days = (int) (years * 365.2422);
        // System.out.println(days);
        int hours = days * 24;
        int minutes = hours * 60;

        System.out.printf("%d centuries = %d years = %d days = %d hours = %d minutes", centuries, years, days, hours, minutes);
    }
}
