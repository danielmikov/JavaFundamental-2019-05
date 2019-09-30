package Course05_BasicSyntaxConditionalStatemetnsAndLoops;

import java.util.Scanner;

public class CourseNotes {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Type Integer : ");
            int number = scanner.nextInt();
            System.out.println(number);

            System.out.println("Type string of Integers");
            int numberOther = Integer.parseInt(scanner.next());
            System.out.println("This is the first one Integer times 2:" + (numberOther * 2) + "\n");

            System.out.println("What's your name?");
            String name = scanner.next();
            System.out.printf("Hello, %s\n", name);

            int grade = 55;
            double percent = 53.5334;
            char charPercent = '%';
            System.out.printf("Your grade is : %03d because your got %.4f%c on tour last exam.\n\n", grade, percent, charPercent);

            System.out.println("Indicate Name, Age and Grade");
            String name1 = scanner.nextLine();
            int age1 = scanner.nextInt();
            double grade1 = scanner.nextDouble();
            System.out.printf("Name: %s, Age: %d, Grade %.2f\n", name1, age1, grade1);

            System.out.println("Adain, indicate Name, Age and Grade");
            System.out.printf("Name: %s, Age: %d, Grade %.2f\n", scanner.nextLine(), scanner.nextInt(), scanner.nextDouble());

    // compare floating points
            if (Math.abs(0.1 + 0.2 - 0.3) < 0.00001){
                System.out.println("Yes, They're equels");
            } else {
                System.out.println("No, they are different");
            }

    //manipulating hours
            int initialTimeHours = scanner.nextInt();
            int initialTimeMinutes = scanner.nextInt();
            int breakInMinutes = 30;

            int timeInMinutes = (initialTimeHours * 60) + initialTimeMinutes + breakInMinutes;

            int totalHours = timeInMinutes / 60;
            int totalMinutes = timeInMinutes % 60;

            if (totalHours >= 24){
                totalHours -= 24;
            }

            System.out.printf("%d:%02d", totalHours, totalMinutes);

    //Day of week or language country
            int dayOfWeek = scanner.nextInt();
            String dayName;

            switch (dayOfWeek) {
                case 1:
                    dayName = "Monday";
                    break;
                case 2:
                    dayName = "Monday";
                    break;
                case 3:
                    dayName = "Monday";
                    break;
                default:
                    dayName = "Invalid entry";
                    break;
            }

            System.out.println(dayName);

    // NOT -> !
    // AND -> &&
    // OR -> ||

    //do while is executed at least once.
            int number2 = 10;
            int number3 = 10;

            do{
                number2++;
                System.out.println(number2);
            } while (number2 < 10);

    //while is not executed if initial verification if not true. (so nothing printed here)
            while (number3 < 10){
                number3++;
                System.out.println(number3);
            }
    }
}
