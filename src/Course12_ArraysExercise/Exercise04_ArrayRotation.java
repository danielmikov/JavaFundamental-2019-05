package Course12_ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise04_ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] inputArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int rotation = Integer.parseInt(scanner.next());
        int[] newArray = new int[inputArray.length];

        while (rotation > inputArray.length){
            rotation -= inputArray.length;
        }

        for (int j = 0; j < inputArray.length; j++) {
            if (((newArray.length - rotation) + j) > newArray.length - 1){
                newArray[((newArray.length - rotation) + j - newArray.length)] = inputArray[j];
            }else{
                newArray[(newArray.length - rotation) + j] = inputArray[j];
            }
        }
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }

    }
}









