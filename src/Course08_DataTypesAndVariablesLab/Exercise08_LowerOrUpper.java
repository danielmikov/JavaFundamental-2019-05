package Course08_DataTypesAndVariablesLab;

import java.util.Scanner;

public class Exercise08_LowerOrUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        char character = input.charAt(0);

        if (character >= 65 && character <= 90){
            System.out.println("upper-case");
        }
        if (character >= 97 && character <= 122){
            System.out.println("lower-case");
        }

    }
}
