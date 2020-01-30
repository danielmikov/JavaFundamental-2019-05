package Course15_MethodsExercise;

import java.util.Scanner;

public class Exercise03_CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char input01 = scanner.nextLine().charAt(0);
        char input02 = scanner.nextLine().charAt(0);

        printCharRange(getRangeStart(input01, input02), getRangeEnd(input01, input02));
    }

    private static char getRangeStart(char input01, char input02) {
        char start;
        if (input01 > input02) {
            start = input02;
        } else {
            start = input01;
        }
        return start;
    }
    private static char getRangeEnd(char input01, char input02) {
        char end;
        if (input01 > input02) {
            end = input01;
        } else {
            end = input02;
        }
        return end;
    }

    private static void printCharRange(char start, char end) {
        for (int i = start + 1; i < end; i++) {
            System.out.printf("%c ", i);
        }
    }
}
