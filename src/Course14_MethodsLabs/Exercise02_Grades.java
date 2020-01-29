package Course14_MethodsLabs;

import java.util.Scanner;

public class Exercise02_Grades {
    public static void main(String[] args) {
        Double input = Double.parseDouble(readConsoleInput());

        convertGradesToWords(input);
    }

    private static void convertGradesToWords(Double input) {
        if (input >= 2 & input < 3){
            System.out.println("Fail");
        } else if (input >= 3 & input < 3.5){
            System.out.println("Poor");
        } else if (input >= 3.50 & input < 4.5){
            System.out.println("Good");
        } else if (input >= 4.5 & input < 5.5){
            System.out.println("Very good");
        } else if (input >= 5.5 & input <= 6){
            System.out.println("Excellent");
        } else {
            System.out.println("Invalid Entry");
        }
    }

    public static String readConsoleInput(){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        return input;
    }
}
