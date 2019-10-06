package Course11_ArraysLabs;

import java.util.Scanner;

public class Exercise04_ReverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] inputToArray = input.split(" ");
//        String[] inputRevers = new String[inputToArray.length];
//        int indexConter = 0;
//        for (int i = inputRevers.length - 1; i >= 0; i--) {
//            inputRevers[indexConter] = inputToArray[i];
//            indexConter++;
//        }
        for (int i = inputToArray.length - 1; i >= 0; i--) {
            System.out.print(inputToArray[i] + " ");
        }
    }
}
