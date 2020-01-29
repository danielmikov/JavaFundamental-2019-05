package Course14_MethodsLabs;

import java.util.Scanner;

public class Exercise04_Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String operation = scanner.nextLine();
        Double numberFirst = Double.parseDouble(scanner.nextLine());
        Double numberSecond = Double.parseDouble(scanner.nextLine());

        System.out.printf("%.0f", calculateNumberFirstSecond(operation, numberFirst, numberSecond));
    }

    private static double calculateNumberFirstSecond(String operation, Double numberFirst, Double numberSecond) {
        double result = 0.0;
        switch (operation){
            case "add":
                result = numberFirst + numberSecond;
                break;
            case  "multiply":
                result = numberFirst * numberSecond;
                break;
            case "subtract":
                result = numberFirst - numberSecond;
                break;
            case "divide":
                result = numberFirst / numberSecond;
                break;
            default:
                break;
        }
        return result;
    }
}
