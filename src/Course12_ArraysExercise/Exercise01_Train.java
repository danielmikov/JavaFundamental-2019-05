package Course12_ArraysExercise;

import java.util.Scanner;

public class Exercise01_Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputSize = Integer.parseInt(scanner.nextLine());
        int[] numbers = new int[inputSize];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        int total = 0;
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
            total += numbers[i];
        }
        System.out.println();
        System.out.println(total);
    }
}
