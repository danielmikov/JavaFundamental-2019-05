package Course15_MethodsExercise;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise10_TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        findTopNumber(input);
    }

    private static void findTopNumber(int input) {
        for (int i = 0; i < input; i++) {
            String iString = Integer.toString(i);
            int sumDigits = getSumDigits(i, iString);
            boolean divisibleBy8 = checkIfDivisibleBy8(sumDigits);
            boolean hasOddDigit = checkIfItHasOddDigit(iString);
            printTopNumbers(i, divisibleBy8, hasOddDigit);
        }
    }

    private static int getSumDigits(int i, String iString) {
        int lastDigit = 0;
        int sumDigits = 0;
        int sumDigitsBiggest = 0;
        int iTemp = i;

        for (int j = 0; j < iString.length(); j++) {
            lastDigit = iTemp % 10;

            sumDigits += lastDigit;

            iTemp /= 10;
            if (sumDigits>sumDigitsBiggest){
                sumDigitsBiggest = sumDigits;
            }
        }
        return sumDigitsBiggest;
    }

    private static void printTopNumbers(int i, boolean divisibleBy8, boolean hasOddDigit) {
        if (divisibleBy8 && hasOddDigit){
            System.out.println(i);
        }
    }

    private static boolean checkIfItHasOddDigit(String iString) {
        boolean hasOddDigit = false;
        int[] iArray = Arrays.stream(iString.split("")).mapToInt(e ->Integer.parseInt(e)).toArray();
        for (int j = 0; j < iString.length(); j++) {
            if (iArray[j] % 2 != 0){
                hasOddDigit = true;
            }
        }
        return hasOddDigit;
    }

    private static boolean checkIfDivisibleBy8(int sumDigitsBiggest) {
        boolean divisibleBy8 = false;
        if (sumDigitsBiggest % 8 == 0){
            divisibleBy8 = true;
        }
        return divisibleBy8;
    }
}
