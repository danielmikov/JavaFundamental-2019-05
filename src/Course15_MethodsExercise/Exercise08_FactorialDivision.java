package Course15_MethodsExercise;

import java.util.Scanner;

public class Exercise08_FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double input01 = scanner.nextDouble();
        Double input02 = scanner.nextDouble();

        System.out.printf("%.2f", (calculateFactorial(input01) / calculateFactorial(input02)));
    }

    private static Double calculateFactorial(Double input) {
        Double factorial = 1.0;
        for (int i = 0; i < input; i++) {
            factorial *= input - i;
        }
        return factorial;
    }
}
