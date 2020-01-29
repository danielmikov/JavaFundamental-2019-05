package Course14_MethodsLabs;

import java.util.Scanner;

public class Exercise01_SignOfIntegerNumbers {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer input = Integer.parseInt(scanner.nextLine());

        confirmIntSign(input);
    }

    private static void confirmIntSign(Integer input) {
        if (input < 0){
            System.out.printf("The number %d is negative.", input);
        } else if (input == 0){
            System.out.printf("The number %d is zero.", input);
        } else {
            System.out.printf("The number %d is positive.", input);
        }
        System.out.println("");
    }

}
