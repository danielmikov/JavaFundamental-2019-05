package Course15_MethodsExercise;

import java.util.Scanner;

public class Exercise06_MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] inputToArray = input.split("");

        if (input.length() % 2 == 0) {
            printMiddleOdd(input, inputToArray);
        } else {
            printMiddleEven(input, inputToArray);
        }
    }

    private static void printMiddleOdd(String input, String[] inputToArray) {
        System.out.println(inputToArray[(input.length() - 1) / 2] + inputToArray[((input.length() - 1) / 2) + 1]);
    }

    private static void printMiddleEven(String input, String[] inputToArray) {
        System.out.println(inputToArray[input.length() / 2]);
    }

}
