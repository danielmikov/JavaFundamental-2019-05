package Course11_ArraysLabs;

import java.util.Scanner;

public class Exercise05_EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] inputToArray = input.split(" ");
        int[] inputToInt = new int[inputToArray.length];
        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 0; i < inputToInt.length; i++) {
            inputToInt[i] = Integer.parseInt(inputToArray [i]);

            if (inputToInt[i] % 2 == 0){
                sumEven += inputToInt[i];
            } else {
                sumOdd += inputToInt[i];
            }
        }
        System.out.println(sumEven - sumOdd);

    }
}
