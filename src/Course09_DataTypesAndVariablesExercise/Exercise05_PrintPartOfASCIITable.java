package Course09_DataTypesAndVariablesExercise;

import java.util.Scanner;

public class Exercise05_PrintPartOfASCIITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startASCII = Integer.parseInt(scanner.nextLine());
        int stopASCII = Integer.parseInt(scanner.nextLine());

        for (int i = startASCII; i < stopASCII; i++) {
            System.out.print((char)i + " ");
        }

        System.out.print((char) stopASCII);
    }
}
