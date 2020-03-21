package Course17_ListsLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exercise05_ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList list = new ArrayList<>(
                Arrays.stream(scanner.nextLine().split(" "))
                        .map(e -> Integer.parseInt(e))
                        .collect(Collectors.toList()));

        String[] input = new String[3];

        input = scanner.nextLine().split(" ");

        while (!input[0].equals("end")) {

            switch (input[0]) {
                case "Contains":
                    if (list.contains(Integer.parseInt(input[1]))) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    switch (input[1]) {
                        case "even":
                            for (int i = 0; i < list.size(); i++) {
                                if ((int) list.get(i) % 2 == 0) {
                                    System.out.printf("%d ", (int) list.get(i));
                                }
                            }
                            System.out.println("");
                            break;
                        case "odd":
                            for (int i = 0; i < list.size(); i++) {
                                if ((int) list.get(i) % 2 != 0) {
                                    System.out.printf("%d ", (int) list.get(i));
                                }
                            }
                            System.out.println("");
                            break;
                    }
                    break;
                case "Get": //Get sum
                    int sum = 0;
                    for (int i = 0; i < list.size(); i++) {
                        sum += (int) list.get(i);
                    }
                    System.out.println(sum);
                    break;
                case "Filter":
                    switch (input[1]){
                        case ">":
                            for (int i = 0; i < list.size(); i++) {
                                if ((int) list.get(i) > Integer.parseInt(input[2])) {
                                    System.out.printf("%d ", (int) list.get(i));
                                }
                            }
                            System.out.println("");
                            break;
                        case "<":
                            for (int i = 0; i < list.size(); i++) {
                                if ((int) list.get(i) < Integer.parseInt(input[2])) {
                                    System.out.printf("%d ", (int) list.get(i));
                                }
                            }
                            System.out.println("");
                            break;
                        case ">=":
                            for (int i = 0; i < list.size(); i++) {
                                if ((int) list.get(i) >= Integer.parseInt(input[2])) {
                                    System.out.printf("%d ", (int) list.get(i));
                                }
                            }
                            System.out.println("");
                            break;
                        case "<=":
                            for (int i = 0; i < list.size(); i++) {
                                if ((int) list.get(i) <= Integer.parseInt(input[2])) {
                                    System.out.printf("%d ", (int) list.get(i));
                                }
                            }
                            System.out.println("");
                            break;
                    }
                    break;

            }
            input = scanner.nextLine().split(" ");
        }

    }
}