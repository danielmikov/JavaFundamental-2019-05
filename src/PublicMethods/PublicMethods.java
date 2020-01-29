package PublicMethods;

import java.util.Scanner;

public class PublicMethods {
    public static String readConsoleInput(){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        return input;
    }
}
