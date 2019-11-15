package Course12_ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise08_MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int magicNumber = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < input.length; i++) {
            for (int j = i + 1; j < input.length; j++) {
                if (magicNumber == input[i] + input[j])
                    System.out.printf("%d %d%n", input[i], input[j]);
            }
        }
    }
}

