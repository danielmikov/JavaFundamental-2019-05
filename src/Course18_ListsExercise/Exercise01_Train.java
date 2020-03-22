package Course18_ListsExercise;

import java.util.*;
import java.util.stream.Collectors;

public class Exercise01_Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> train = new ArrayList<>(
                Arrays.stream(scanner.nextLine().split(" "))
                        .map(e -> Integer.parseInt(e))
                        .collect(Collectors.toList()));

        int capacity = Integer.parseInt(scanner.nextLine());

        String[] input = new String[2];
        input = scanner.nextLine().split(" ");

        while (!input[0].equals("end")) {
            switch (input[0]) {
                case "Add":
                    train.add(Integer.valueOf(input[1]));
                    break;
                default:
                    for (int i = 0; i < train.size(); i++) {
                        if (train.get(i) + Integer.parseInt(input[0]) <= capacity) {
                            int combinedPassengers = train.get(i) + Integer.parseInt(input[0]);
                            train.set(i, combinedPassengers);
                            break;
                        }
                    }
                    break;
            }
            input = scanner.nextLine().split(" ");
        }

        for (Integer passengers : train) {
            System.out.printf("%d ", passengers);
        }


    }
}
