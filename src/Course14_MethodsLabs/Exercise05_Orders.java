package Course14_MethodsLabs;

import java.util.Scanner;

public class Exercise05_Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        System.out.printf("%.2f", calculateOrderCost(product, quantity));
    }

    private static double calculateOrderCost(String product, int quantity) {
        double cost = 0.0;
        switch (product){
            case "coffee":
                cost = quantity * 1.50;
                break;
            case "water":
                cost = quantity * 1.00;
                break;
            case "coke":
                cost = quantity * 1.40;
                break;
            case "snacks":
                cost = quantity * 2.00;
                break;
            default:
                break;
        }
        return cost;
    }
}
