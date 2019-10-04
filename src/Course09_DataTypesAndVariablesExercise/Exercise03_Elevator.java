package Course09_DataTypesAndVariablesExercise;

import java.util.Scanner;

public class Exercise03_Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int persons = scanner.nextInt();
        int capacity = scanner.nextInt();
        double trips = 1.0 * persons / capacity;
        System.out.println((int) Math.ceil(trips));
    }
}
