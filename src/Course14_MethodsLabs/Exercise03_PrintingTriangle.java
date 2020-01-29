package Course14_MethodsLabs;

import java.util.Scanner;

public class Exercise03_PrintingTriangle {
    public static void main(String[] args) {
        int input = Integer.parseInt(readConsoleInput());

        printTriangleTop(input);
        printTriangleBottom(input);
    }

    private static void printTriangleBottom(int input) {
        for (int i = input-1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.printf(j + " ");
            }
            System.out.println();
        }
    }

    private static void printTriangleTop(int input) {
        for (int i = 1; i <= input; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf(j + " ");
            }
            System.out.println();
        }
    }

    public static String readConsoleInput(){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        return input;
    }
}
