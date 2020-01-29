package Course14_MethodsLabs;

import java.util.Scanner;

public class Exercise11_Mathoperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valueFirst = Integer.parseInt(scanner.nextLine());
        String operation = scanner.nextLine();
        int valueSecond = Integer.parseInt(scanner.nextLine());

        switch (operation) {
            case "/":
                divide(valueFirst, valueSecond);
                break;
            case "*":
                multiply(valueFirst, valueSecond);
                break;
            case "+":
                add(valueFirst, valueSecond);
                break;
            case "-":
                subtract(valueFirst, valueSecond);
                break;
        }
    }

    private static void divide(int a, int b) {
        System.out.println(a / b);
    }

    private static void multiply(int a, int b) {
        System.out.println(a * b);
    }

    private static void add(int a, int b) {
        System.out.println(a + b);
    }

    private static void subtract(int a, int b) {
        System.out.println(a - b);
    }
}
