package Course12_ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise05_TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e->Integer.parseInt(e)).toArray();
        int biggestDigit = Integer.MIN_VALUE;

        for (int i = 0; i < input.length; i++) {
            for (int j = i; j < input.length; j++) {
                if(input[j] >= biggestDigit){
                    biggestDigit = input[j];
                }
            }
            if (input[i] >= biggestDigit){
                System.out.printf("%d ", input[i]);
            }
            biggestDigit = Integer.MIN_VALUE;
        }
    }
}