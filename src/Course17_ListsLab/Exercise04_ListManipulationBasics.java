package Course17_ListsLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exercise04_ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       ArrayList list = new ArrayList<>(
                Arrays.stream(scanner.nextLine().split(" "))
                        .collect(Collectors.toList()));

       String[] input = new String[3];

        input = scanner.nextLine().split(" ");

        while (!input[0].equals("end")) {

            switch (input[0]) {
                case "Add":
                    list.add(Integer.valueOf(Integer.parseInt(input[1])));
                    break;
                case "Remove":
                    list.remove(Integer.valueOf(Integer.parseInt(input[1])));
                    break;
                case "RemoveAt":
                    list.remove(Integer.parseInt(input[1]));
                    break;
                case "Insert":
                    list.add(Integer.parseInt(input[2]), Integer.parseInt(input[1]));
                    break;
            }

            input = scanner.nextLine().split(" ");

        }

        for (Object o : list) {
            System.out.printf("%d ", o);
        }
    }
}
