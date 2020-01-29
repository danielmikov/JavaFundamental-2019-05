package Course14_MethodsLabs;

import java.util.Scanner;

public class Exercise06_CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());

        System.out.println(calculateArea(width, length));
    }

    private static int calculateArea(int width, int length) {
        int area = width * length;
        return area;
    }
}
