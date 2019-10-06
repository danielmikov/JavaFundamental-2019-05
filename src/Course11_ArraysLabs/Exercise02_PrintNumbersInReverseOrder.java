package Course11_ArraysLabs;

import java.util.Scanner;

public class Exercise02_PrintNumbersInReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arraySize = Integer.parseInt(scanner.nextLine());
        int[] arrayNumbers = new int[arraySize];
        for (int i = arrayNumbers.length - 1; i >= 0; i--) {
            arrayNumbers[i] = Integer.parseInt(scanner.nextLine());
        }

        for (int i = 0; i < arrayNumbers.length; i++) {
            System.out.print(arrayNumbers[i] + " ");
        }
    }
}
