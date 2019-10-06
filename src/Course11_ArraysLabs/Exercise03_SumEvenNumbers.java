package Course11_ArraysLabs;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise03_SumEvenNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] inputToArray = input.split(" ");
        int[] arrayNumbers = Arrays.stream(inputToArray).mapToInt(e -> Integer.parseInt(e)).toArray();
        int sum = 0;
        for (int i = 0; i < arrayNumbers.length; i++) {
            if (arrayNumbers[i] % 2 == 0) {
                sum += arrayNumbers[i];
            }
        }
        System.out.println(sum);
    }

}
