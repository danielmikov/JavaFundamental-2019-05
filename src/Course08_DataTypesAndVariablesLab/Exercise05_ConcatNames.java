package Course08_DataTypesAndVariablesLab;

import java.util.Scanner;

public class Exercise05_ConcatNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameA = scanner.nextLine();
        String nameB = scanner.nextLine();
        String relationship = scanner.nextLine();

        System.out.println(nameA + relationship + nameB);
    }
}
