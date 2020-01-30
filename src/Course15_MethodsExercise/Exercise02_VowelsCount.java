package Course15_MethodsExercise;

import java.util.Scanner;

public class Exercise02_VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        printNumberOfVowels(vowelsCounter(input));
    }

    private static void printNumberOfVowels(int vowelsCount) {
        System.out.println(vowelsCount);
    }

    // a, e, i, o, u
    private static int vowelsCounter(String input) {
        String[] inputToArray = input.split("");

        int vowelsCount = 0;
        for (int i = 0; i < input.length(); i++) {
            switch (inputToArray[i]) {
                case "a": //Small
                case "e":
                case "i":
                case "o":
                case "u":
                case "A": //Caps
                case "E":
                case "I":
                case "O":
                case "U":
                    vowelsCount++;
                    break;
                default:
                    break;
            }
        }
        return vowelsCount;

    }
}

