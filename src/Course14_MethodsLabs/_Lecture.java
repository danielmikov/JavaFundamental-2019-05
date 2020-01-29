package Course14_MethodsLabs;

import java.util.Scanner;

public class _Lecture {
    static void printerSeparator(int length){
        for (int i = 0; i < length; i++) {
            System.out.print("-");

        }
        System.out.println("");
    }

    static void printSeparatedName(String name){
        printerSeparator(name.length());
        System.out.println(name);
        printerSeparator(name.length());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        printSeparatedName(name);
    }
}
