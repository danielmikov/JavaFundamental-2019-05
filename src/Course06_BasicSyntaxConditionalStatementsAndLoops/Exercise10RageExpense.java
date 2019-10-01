package Course06_BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class Exercise10RageExpense {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int gamesLost = scanner.nextInt();
//headset every second lost game
        double priceHeadset = scanner.nextDouble();
        int counterHeadset = 0;
//mouse every third lost game
        double priceMouse = scanner.nextDouble();
        int counterMouse = 0;
//mouse && headset true = keyboard
        double priceKeyboard = scanner.nextDouble();
        int counterKeyboard = 0;
//display every second keyboard
        double priceDisplay = scanner.nextDouble();
        int counterDisplay = 0;

        for (int i = 1; i <= gamesLost; i++) {
            if (i % 2 == 0){
                counterHeadset++;
            }
            if (i % 3 == 0){
                counterMouse++;
            }
            if ((i % 2 == 0) && (i % 3 == 0)){
                counterKeyboard++;

                if ((counterKeyboard > 0) && (counterKeyboard % 2 == 0)){
                    counterDisplay++;
                }
            }

        }
        double totalCost =
                (counterHeadset * priceHeadset) +
                (counterMouse * priceMouse) +
                (counterKeyboard * priceKeyboard) +
                (counterDisplay * priceDisplay);

        System.out.printf("Rage expenses: %.2f lv.", totalCost);
    }
}
