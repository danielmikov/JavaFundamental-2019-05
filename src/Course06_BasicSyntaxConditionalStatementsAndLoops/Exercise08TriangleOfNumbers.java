package Course06_BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class Exercise08TriangleOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        for (int i = 1; i <= number; i++) {
            if (i > 1){
                for (int j = 0; j < i - 1; j++) {
                    System.out.print(i + " ");
                }
            }
            System.out.println(i);
        }
    }
}
