package Course08_DataTypesAndVariablesLab;

import java.util.Scanner;

public class Exercise01_ConvertMetersToKilometers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int meters = scanner.nextInt();
        double kilometers = 1.0 * meters / 1000;

        System.out.printf("%.2f", kilometers);
    }

}
