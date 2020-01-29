package Course14_MethodsLabs;

import java.util.Scanner;

public class Exercise09_GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String valueType = scanner.nextLine();
        String inputFirst = scanner.nextLine();
        String inputSecond = scanner.nextLine();

        switch (valueType) {
            case "int":
                getMaxInt(inputFirst, inputSecond);
                break;
            case "char":
                getMaxChar(inputFirst, inputSecond);
                break;
            case "string":
                getMaxString(inputFirst, inputSecond);
                break;
            default:
                break;
        }

    }

    private static void getMaxInt(String inFirst, String inSecond) {
        int valueFirst = Integer.parseInt(inFirst);
        int valueSecond = Integer.parseInt(inSecond);

        if (valueFirst > valueSecond) {
            System.out.println(valueFirst);
        } else {
            System.out.println(valueSecond);
        }
    }

    private static void getMaxChar(String inFirst, String inSecond) {
        char valueFirst = inFirst.charAt(0);
        char valueSecond = inSecond.charAt(0);

        if (valueFirst > valueSecond) {
            System.out.println(valueFirst);
        } else {
            System.out.println(valueSecond);
        }
    }

    private static void getMaxString(String inFirst, String inSecond) {
        if (inFirst.compareTo(inSecond) > 0) {
            System.out.println(inFirst);
        } else {
            System.out.println(inSecond);
        }
    }
}
