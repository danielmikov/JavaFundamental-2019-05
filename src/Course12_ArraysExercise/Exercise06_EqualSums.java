package Course12_ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise06_EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int sumLeft = 0;
        int sumRight = 0;
        boolean equals = false;

        if (input.length == 1) {
            System.out.println("0");
            equals = true;
        } else {
            for (int i = 0; i < input.length; i++) {
                //sumLeft
                for (int j = 0; j <= i - 1; j++) {
                    sumLeft += input[j];
                }
                //sumRight
                for (int k = i + 1; k <= input.length - 1; k++) {
                    sumRight += input[k];
                }
                if (sumLeft == sumRight) {
                    System.out.println(i);
                    equals = true;

                }
                sumLeft = 0;
                sumRight = 0;
            }
        }
        if (!equals) {
            System.out.println("no");
        }
    }
}
