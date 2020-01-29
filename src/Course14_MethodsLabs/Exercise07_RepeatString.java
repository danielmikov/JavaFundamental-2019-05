package Course14_MethodsLabs;

import java.util.Scanner;

public class Exercise07_RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();
        int repeat = Integer.parseInt(scanner.nextLine());

        printString(string, repeat);
    }

    private static void printString(String string, int repeat) {
        for (int i = 0; i < repeat; i++) {
            System.out.print(string);
        }
    }
}
