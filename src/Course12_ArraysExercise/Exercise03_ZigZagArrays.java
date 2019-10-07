package Course12_ArraysExercise;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise03_ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        int[] first = new int[input];
        int[] second = new int[input];

        for (int i = 0; i < input; i++) {
            int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();

            for (int j = 0; j < array.length; j++) {
                if (i % 2 == 0) {
                    first[i] = array[0];
                    second[i] = array[1];
                } else {
                    first[i] = array[1];
                    second[i] = array[0];
                }
            }
        }

        for (int i = 0; i < input; i++) {
            System.out.print(first[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < input; i++) {
            System.out.print(second[i] + " ");
        }
    }
}
