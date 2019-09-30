package Course06_BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class Exercise04PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = scanner.nextInt();
        int stop = scanner.nextInt();
        int sum = start;

        System.out.print(start + " ");

        while (start < stop){
            start += 1;
            sum += start;
            System.out.print(start + " ");
        }
        System.out.println("\nSum: " + sum);

    }
}
