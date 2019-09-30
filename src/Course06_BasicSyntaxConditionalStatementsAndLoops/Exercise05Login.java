package Course06_BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class Exercise05Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String usnerName = scanner.nextLine();
        String password = new StringBuilder(usnerName).reverse().toString();
        int loginAttemtps = 0;

/* BAD CODE 1st attempt
        while (loginAttemtps <= 2){
            String passwordInput = scanner.nextLine();
            if (password.equals(passwordInput)){
                System.out.printf("User %s logged in.", usnerName);
            }else{
                System.out.println("Incorrect password. Try again.");
            }
            loginAttemtps++;
        }
        String lastAttempt = scanner.nextLine();
            if (password.equals(lastAttempt)){
                System.out.printf("User %s logged in.", usnerName);
            }else{
                System.out.printf("User %s blocked!", usnerName);
            }

 */
        while (loginAttemtps <= 3){
            String passwordAttempt = scanner.nextLine();
            if (loginAttemtps == 3){
                System.out.printf("User %s blocked!", usnerName);
                break;
            }
            if (passwordAttempt.equals(password)){
                System.out.printf("User %s logged in.", usnerName);
                break;
            } else{
                System.out.println("Incorrect password. Try again.");
            }
            loginAttemtps++;
        }
    }
}
