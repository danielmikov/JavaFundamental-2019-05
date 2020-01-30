package Course15_MethodsExercise;

import java.util.Scanner;

public class Exercise07_NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        printMatrix(input);
    }

    private static void printMatrix(int input) {
        for (int i = 1; i <= input; i++) {
            printHorixontal(input);
            System.out.println("");
        }
    }

    private static void printHorixontal(int input) {
        for (int j = 1; j <= input; j++) {
            System.out.printf("%d ", input);
        }
    }
}
