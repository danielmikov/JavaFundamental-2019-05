package Course11_ArraysLabs;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class CourseNotes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

// -----
        int[] numbers0 = {0, 1, 2};

// -----
        int[] numbers01 = new int[3]; //initialize an integer array of 3 ellements
        numbers01[0] = scanner.nextInt();
        numbers01[1] = scanner.nextInt();
        numbers01[2] = scanner.nextInt();

        System.out.println(numbers01[2]);
        System.out.println(numbers01[1]);
        System.out.println(numbers01[0]);

// -----
        int arraySize = scanner.nextInt();
        int[] numbers02 = new int[arraySize];
        for (int i = 0; i < numbers02.length; i++) {
            numbers02[i] = scanner.nextInt();
        }

        for (int i = numbers02.length - 1; i >= 0; i--) {
            System.out.println(numbers02[i]);
        }

// -----
        String[] words = new String[3];
        System.out.println(words[0]);

//-----
        String stringInput = scanner.nextLine(); // 1 0 20 320 1 6546 12 56
        String[] arrayStringNumbersInput = stringInput.split(" ");

        //--- one way
        int[] arrayNumbers = new int[arrayStringNumbersInput.length];
        for (int i = 0; i < arrayNumbers.length; i++) {
            arrayNumbers[i] = Integer.parseInt(arrayStringNumbersInput[i]);
        }
        for (int i = 0; i < arrayNumbers.length; i++) {
            System.out.print(arrayNumbers[i]);
            if (i < arrayNumbers.length - 1) {
                System.out.print(", ");
            }
        }

        //--- other way
        int[] arrayNumbers02 = Arrays
                .stream(arrayStringNumbersInput)             //convert to stream
                .mapToInt(e -> Integer.parseInt(e))          //complete operation element "e ->"
                .toArray();                                  //convert back to array

        //--- other way
        int[] arrayInitial = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

//-----
        String[] words02 = new String[]{"Hello", "world"};
        String joined = String.join(", ", words02);
        System.out.println(joined);

//----- for each = no index reference
        for (String temporaryWord : words02) {
            System.out.print(temporaryWord + " test ");
        }

//----- parse.Int()



    }

}
