package Course12_ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise09_KaminoFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lengthDNA = Integer.parseInt(scanner.nextLine());
        int[] inputDNA;
        int bestSequenceIndex, bestSequenceSum;
        String input;

        do {
            input = scanner.nextLine();
            inputDNA = Arrays.stream(input.split("!")).mapToInt(e -> Integer.parseInt(e)).toArray();
            //#1 Sequence length.
            //#2 Sequence Start Position
            //#3 IF duplicate, sum of 1's

        } while (input != "Clone them!");

        //System.out.printf("Best DNA sample %d with sum: %d.", bestSequenceIndex, bestSequenceSum);
    }
}
