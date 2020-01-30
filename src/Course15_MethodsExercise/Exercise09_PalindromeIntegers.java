package Course15_MethodsExercise;

import java.util.Scanner;

public class Exercise09_PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        readInput(scanner);

    }

    private static void printConfirmation(boolean isPalindrome) {
        if (isPalindrome) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    private static boolean checkSimilarity(int[] intArray, int intArrayMiddle) {
        boolean isPalindrome = false;

        if (intArray.length == 1) {
            isPalindrome = true;
            return isPalindrome;
        }

        for (int i = 0; i < intArrayMiddle; i++) {
            if (intArray[i] == intArray[(intArray.length - 1) - i]) {
                isPalindrome = true;
            } else {
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }

    private static int determineIntArrayMiddle(int[] intArray) {
        int middle;
        if (intArray.length % 2 == 0) {
            middle = intArray.length / 2;
        } else {
            middle = (intArray.length - 1) / 2;
        }
        return middle;
    }

    private static int[] inputToIntArray(String input) {
        String[] inputArray = input.split("");

        int[] number = new int[input.length()];
        for (int i = 0; i < input.length(); i++) {
            number[i] = Integer.parseInt(inputArray[i]);
        }

        return number;
    }

    private static void readInput(Scanner scanner) {
        String input = scanner.nextLine();

        while (!input.equals("END")) {
            int[] intArray = inputToIntArray(input);
            int intArrayMiddle = determineIntArrayMiddle(intArray);
            boolean isPalindrome = checkSimilarity(intArray, intArrayMiddle);

            printConfirmation(isPalindrome);

            input = scanner.nextLine();
        }
    }
}
