package Course08_DataTypesAndVariablesLab;

import java.util.Scanner;

public class Exercise02_PoundsToDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pounds = scanner.nextDouble();
        double dollars = 1.31 * pounds;

        System.out.printf("%.3f", dollars);
    }
}
