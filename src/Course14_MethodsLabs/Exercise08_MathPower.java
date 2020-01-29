package Course14_MethodsLabs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise08_MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        double power = Double.parseDouble(scanner.nextLine());
        double result = number;

        System.out.println(new DecimalFormat("0.####").format(result = getNumberPowered(number, power, result)));
    }

    private static double getNumberPowered(double number, double power, double result) {
        for (int i = 1; i < power; i++) {
            result *= number;
        }
        return result;
    }
}
