package Course11_ArraysLabs;

import java.util.Scanner;

public class Exercise07_CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] inputToArray = input.split(" ");
        if (inputToArray.length == 1){
            System.out.println(inputToArray[0]);
        } else{
            int[] inputToInt = new int[inputToArray.length];
            for (int i = 0; i < inputToInt.length; i++) {
                inputToInt[i] = Integer.parseInt(inputToArray[i]);
            }

            int[] condensed01 = new int[inputToArray.length];


            int operationsCountDown = inputToArray.length - 1;
            while (operationsCountDown>= 1){
                for (int i = 0; i < operationsCountDown; i++) {
                    condensed01[i] = inputToInt[i]+inputToInt[i+1];
                }

                for (int i = 0; i < operationsCountDown; i++) {
                    inputToInt[i] = condensed01[i];
                }
                operationsCountDown--;
            }

            System.out.println(condensed01[0]);
        }

    }
}
