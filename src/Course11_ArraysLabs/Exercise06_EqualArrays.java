package Course11_ArraysLabs;

import java.util.Scanner;

public class Exercise06_EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input01 = scanner.nextLine();
        String[] input01ToArray = input01.split(" ");
        int[] input01ToInt = new int[input01ToArray.length];

        String input02 = scanner.nextLine();
        String[] input02ToArray = input02.split(" ");
        int[] input02ToInt = new int[input01ToArray.length];

        int sum = 0;
        boolean identical = true;

        for (int i = 0; i < input01ToInt.length; i++) {
            input01ToInt[i] = Integer.parseInt(input01ToArray[i]);
            input02ToInt[i] = Integer.parseInt(input02ToArray[i]);
            if (input01ToInt[i] != input02ToInt[i]){
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                identical = false;
                break;
            }
            sum += input01ToInt[i];
        }

        if (identical){
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }

    }
}
