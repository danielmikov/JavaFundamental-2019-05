package Course15_MethodsExercise;

import java.util.Scanner;

public class Exercise05_AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input01 = Integer.parseInt(scanner.nextLine());
        int input02 = Integer.parseInt(scanner.nextLine());
        int input03 = Integer.parseInt(scanner.nextLine());

        System.out.println(subtractDigits(sumDigits(input01, input02), input03));
    }

    private static int subtractDigits(int sumDigits, int input03) {
        int result = sumDigits - input03;
        return result;
    }

    private static int sumDigits(int input01, int input02) {
        int sum = input01 + input02;
        return sum;
    }
}
