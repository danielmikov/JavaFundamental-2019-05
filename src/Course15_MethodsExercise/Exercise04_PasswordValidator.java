package Course15_MethodsExercise;

import java.util.Scanner;

public class Exercise04_PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();
        String[] passwordInArray = password.split("");

        //Valid pass:
        //1. 6 to 10 char
        boolean validateLength = checkLength(password);
        //2. only letter and digits
        boolean validateCharacters = checkChar(password, passwordInArray);
        //3. Min 2 digits
        boolean validateMin2Digits = checkMin2Digits(password, passwordInArray);

        printConfirmationValid(validateLength, validateCharacters, validateMin2Digits);
    }

    private static void printConfirmationValid(boolean validateLength, boolean validateCharacters, boolean validateMin2Digits) {
        if (validateLength && validateCharacters && validateMin2Digits){
            System.out.println("Password is valid");
        }
    }

    private static boolean checkMin2Digits(String password, String[] passwordInArray) {
        boolean validateMin2Digits = false;
        int digitCounter = 0;
        for (int i = 0; i < password.length(); i++) {
            switch (passwordInArray[i]) {
                case "1":
                case "2":
                case "3":
                case "4":
                case "5":
                case "6":
                case "7":
                case "8":
                case "9":
                case "0":
                    digitCounter++;
                    break;
                default:
                    break;
            }
        }

        if (digitCounter >= 2) {
            validateMin2Digits = true;
        } else {
            System.out.println("Password must have at least 2 digits");
        }

        return validateMin2Digits;
    }

    private static boolean checkChar(String password, String[] passwordInArray) {
        // 0 to 9 = ASCII: 48 to 57
        // A to Z = ASCII: 65 to 90
        // a to z = ASCII: 97 to 122

        boolean validateCharacters = false;
        for (int i = 0; i < password.length(); i++) {
            switch (passwordInArray[i]) {
//Numbers
                case "1":
                case "2":
                case "3":
                case "4":
                case "5":
                case "6":
                case "7":
                case "8":
                case "9":
                case "0":
//A-Z
                case "A":
                case "B":
                case "C":
                case "D":
                case "E":
                case "F":
                case "G":
                case "H":
                case "I":
                case "J":
                case "K":
                case "L":
                case "M":
                case "N":
                case "O":
                case "P":
                case "Q":
                case "R":
                case "S":
                case "T":
                case "U":
                case "V":
                case "W":
                case "X":
                case "Y":
                case "Z":

//a-z
                case "a":
                case "b":
                case "c":
                case "d":
                case "e":
                case "f":
                case "g":
                case "h":
                case "i":
                case "j":
                case "k":
                case "l":
                case "m":
                case "n":
                case "o":
                case "p":
                case "q":
                case "r":
                case "s":
                case "t":
                case "u":
                case "v":
                case "w":
                case "x":
                case "y":
                case "z":
                    validateCharacters = true;
                    break;
                default:
                    validateCharacters = false;
                    System.out.println("Password must consist only of letters and digits");
                    return validateCharacters;
            }
        }

        return validateCharacters;
    }

    private static boolean checkLength(String password) {
        boolean validLength = false;
        if (password.length() < 6 || password.length() > 10) {
            System.out.println("Password must be between 6 and 10 characters");
        } else {
            validLength = true;
        }
        return validLength;
    }
}
