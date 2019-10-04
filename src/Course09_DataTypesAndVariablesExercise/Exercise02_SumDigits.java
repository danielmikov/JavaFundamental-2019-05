package Course09_DataTypesAndVariablesExercise;

import java.util.Scanner;

public class Exercise02_SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String intput = scanner.nextLine();
        int integer = Integer.parseInt(intput);
        int sum = 0;

        for (int i = 0; i < intput.length(); i++) {
            int lastDigit = integer % 10;
            sum += lastDigit;
            integer /= 10;
        }

        System.out.println(sum);
    }
}
