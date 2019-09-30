package Course06_BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class Exercise03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groupSize = scanner.nextInt();
        String groupType = scanner.next();
        String dayOfWeek = scanner.next();

        double priceIndividual;
        double priceGroup;

        switch (groupType){
            case "Students":
                switch (dayOfWeek){
                    case "Friday":
                        priceIndividual = 8.45;
                        priceGroup = groupSize * priceIndividual;
                        if(groupSize >= 30){
                            priceGroup = priceGroup - (priceGroup * 0.15);
                        }
                        System.out.printf("Total price: %.2f", priceGroup);
                        break;
                    case "Saturday":
                        priceIndividual = 9.80;
                        priceGroup = groupSize * priceIndividual;
                        if(groupSize >= 30){
                            priceGroup = priceGroup - (priceGroup * 0.15);
                        }
                        System.out.printf("Total price: %.2f", priceGroup);
                        break;
                    case "Sunday":
                        priceIndividual = 10.46;
                        priceGroup = groupSize * priceIndividual;
                        if(groupSize >= 30){
                            priceGroup = priceGroup - (priceGroup * 0.15);
                        }
                        System.out.printf("Total price: %.2f", priceGroup);
                        break;
                    default:
                        System.out.println("Invalid day of the week.");
                        break;
                }
            break;
            case "Business":
                switch (dayOfWeek){
                    case "Friday":
                        priceIndividual = 10.90;
                        if(groupSize >= 100){
                            groupSize -= 10;
                        }
                        priceGroup = groupSize * priceIndividual;

                        System.out.printf("Total price: %.2f", priceGroup);
                        break;
                    case "Saturday":
                        priceIndividual = 15.60;
                        if(groupSize >= 100){
                            groupSize -= 10;
                        }
                        priceGroup = groupSize * priceIndividual;

                        System.out.printf("Total price: %.2f", priceGroup);
                        break;
                    case "Sunday":
                        priceIndividual = 16;
                        if(groupSize >= 100){
                            groupSize -= 10;
                        }
                        priceGroup = groupSize * priceIndividual;

                        System.out.printf("Total price: %.2f", priceGroup);
                        break;
                    default:
                        System.out.println("Invalid day of the week.");
                        break;
                }
                break;
            case "Regular":
                switch (dayOfWeek){
                    case "Friday":
                        priceIndividual = 15;
                        priceGroup = groupSize * priceIndividual;
                        if(groupSize >= 10 && groupSize <=20){
                            priceGroup = priceGroup - (priceGroup * 0.05);
                        }
                        System.out.printf("Total price: %.2f", priceGroup);
                        break;
                    case "Saturday":
                        priceIndividual = 20;
                        priceGroup = groupSize * priceIndividual;
                        if(groupSize >= 10 && groupSize <=20){
                            priceGroup = priceGroup - (priceGroup * 0.05);
                        }
                        System.out.printf("Total price: %.2f", priceGroup);
                        break;
                    case "Sunday":
                        priceIndividual = 22.50;
                        priceGroup = groupSize * priceIndividual;
                        if(groupSize >= 10 && groupSize <=20){
                            priceGroup = priceGroup - (priceGroup * 0.05);
                        }
                        System.out.printf("Total price: %.2f", priceGroup);
                        break;
                    default:
                        System.out.println("Invalid day of the week.");
                        break;
                }
                break;
            default:
                System.out.println("Invalid group type.");
                break;
        }
    }
}
