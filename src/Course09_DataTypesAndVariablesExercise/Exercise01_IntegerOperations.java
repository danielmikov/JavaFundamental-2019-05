package Course09_DataTypesAndVariablesExercise;

import java.util.Scanner;

public class Exercise01_IntegerOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int int01 = scanner.nextInt();
        int int02 = scanner.nextInt();
        int int03 = scanner.nextInt();
        int int04 = scanner.nextInt();

        System.out.println((int01 + int02) / int03 * int04);
    }
}
