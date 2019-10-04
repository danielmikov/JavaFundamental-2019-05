package Course09_DataTypesAndVariablesExercise;

import java.util.Scanner;

public class Exercise04_SumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfEntries = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 0; i < numberOfEntries; i++) {
            String input = scanner.nextLine();
            char inputToChar = input.charAt(0);
            sum += inputToChar;
        }

        System.out.printf("The sum equals: %d", sum);
    }
}
