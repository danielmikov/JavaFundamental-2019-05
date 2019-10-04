package Course09_DataTypesAndVariablesExercise;

import java.util.Scanner;

public class Exercise07_WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfEntries = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i < numberOfEntries; i++) {
            int additionalWater = scanner.nextInt();
            if (sum + additionalWater > 255){
                System.out.println("Insufficient capacity!");
            }else {
                sum += additionalWater;
            }
        }

        System.out.println(sum);
    }
}
