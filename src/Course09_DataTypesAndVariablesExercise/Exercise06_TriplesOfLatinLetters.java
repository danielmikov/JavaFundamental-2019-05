package Course09_DataTypesAndVariablesExercise;

import java.util.Scanner;

public class Exercise06_TriplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();

        for (int i = 97; i < 97 + size; i++) {
            for (int j = 97; j < 97 + size; j++){
                for (int k = 97; k < 97 + size; k++) {
                    System.out.printf("%c%c%c\n",i,j,k);
                }
            }
        }
    }
}
