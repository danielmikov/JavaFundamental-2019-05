package Course08_DataTypesAndVariablesLab;

import java.util.Scanner;

public class CourseNotes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

// Compate fooating number (flout or double)
        double a = 0.0001; //e-3
        double b = 0.0002; //e-3
        double tolerance = 0.00001; //e-4
        double compare = 0.0003; //e-3
        if ( ((a + b) - compare) < tolerance ){
            System.out.println("It's correct");
        } else {
            System.out.println("NOT O.K.");
        }
        if ((a + b) == compare ){
            System.out.println("Unicorn"); //Never going to happen

        } else {
            System.out.println("a + b: " + (a + b));
            System.out.println("compare" + compare);
        }

//casting:
        double doubleValue = 41.99;
        int intValue = (int) doubleValue; //loosing date 0.99 //no rounding //just cut.

        char charLetter = 'A';
        char charValue = 65;
        System.out.println(charLetter); //will print A
        System.out.println((char) charValue); //will print A

    }
}
