package Course09_DataTypesAndVariablesExercise;

import java.util.Scanner;

public class Exercise09_SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //firstDayYield = startingYield
        //secondDayYield = firsDayYield - 10
        //thirdDayYield = secondDayYield - 10
        // and so on..

        // profitable if = totalYield > 100 (continue)
        // not profitable if totalYield < 100 (stop)

        // crew cost: totalYield - 26 / day
        // crew cost: totalYield - 26 after stop.
        // minimum totalYield = 0 (no negative)

        //print days
        //print totalYield

        int yieldStarting = Integer.parseInt(scanner.nextLine());
        int yieldTotal = 0;
        int dayCounter = 0;
        while(yieldStarting >= 100){
            if (yieldTotal < 0){
                yieldTotal = 0;
            }
            yieldTotal += yieldStarting;
            yieldStarting -= 10;
            dayCounter++;
            yieldTotal -= 26; // crew cost / day

        }
        yieldTotal -= 26; // cew cost at stop
        if (yieldTotal < 0){
            yieldTotal = 0;
        }
        System.out.println(dayCounter);
        System.out.println(yieldTotal);
    }
}
