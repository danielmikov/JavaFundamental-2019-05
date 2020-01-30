package Course15_MethodsExercise;

import java.util.Scanner;

public class Exercise01_SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input01 = Integer.parseInt(scanner.nextLine());
        int input02 = Integer.parseInt(scanner.nextLine());
        int input03 = Integer.parseInt(scanner.nextLine());

        int smallest = 0;

        smallest = getSmallest(input01, input02, input03);

        System.out.println(smallest);
    }

    private static int getSmallest(int input01, int input02, int input03) {
        int smallestFirst = 0;
        int smallestSecond = 0;
        int smallest;
        if (input01 < input02){
            smallestFirst = input01;
        } else {
            smallestFirst = input02;
        }
        if (input02 < input03){
            smallestSecond = input02;
        } else {
            smallestSecond = input03;
        }
        if (smallestFirst < smallestSecond){
            smallest = smallestFirst;
        } else {
            smallest = smallestSecond;
        }

        return smallest;
    }
}
