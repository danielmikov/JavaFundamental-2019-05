package Course12_ArraysExercise;

import java.util.Scanner;

public class Exercise02_CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input01 = scanner.nextLine();
        String input02 = scanner.nextLine();

        String[] input01ToString = input01.split(" ");
        String[] input02ToString = input02.split(" ");
        for (int i = 0; i < input01ToString.length; i++) {
            for (int j = 0; j < input02ToString.length; j++) {
                if (input01ToString[i].equals(input02ToString[j])){
                    System.out.print(input02ToString[j] + " ");
                }
            }
        }
    }
}
