package Course06_BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class Exercise06StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//String number is addition of factorials...
//factorial of 4! = 4*3*2*1 = 24

        String input = scanner.next();
        int inputToInt = Integer.parseInt(input);
        int lastDigit;
        int factorial = 1;
        int total = 0;

        for (int i = input.length() ; i > 0 ; i--) {
            lastDigit = inputToInt % 10;
            inputToInt /= 10;
//System.out.println("lastDigit: " + lastDigit);
// System.out.println("inputToInt: " + inputToInt);
            for (int j = 1; j < lastDigit; j++) {
                factorial += factorial * j;
//System.out.println("factorial: " + factorial);
            }
            total += factorial;
//System.out.println("total: " + total);
            factorial = 1;
        }

        inputToInt = Integer.parseInt(input);
        if (total == inputToInt){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }


    }
}
