package Course14_MethodsLabs;

import java.util.Scanner;

public class Exercise10_MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int inputToInt = Integer.parseInt(input);
        int sumEven = 0;
        int sumOdd = 0;

        // If with two methods as requested (getSumOfEvenDigits(n) & getSumOfOddDigits(n)), not efficient.
        // For cycle and verification Even/Odd run twice.
        for (int i = 0; i < input.length(); i++) {
            int lastDigit = inputToInt % 10;

            if ((lastDigit % 2) == 0) {
                sumEven += lastDigit;
            } else {
                sumOdd += lastDigit;
            }

            inputToInt /= 10;
        }

        System.out.println(sumEven * sumOdd);
    }
}
