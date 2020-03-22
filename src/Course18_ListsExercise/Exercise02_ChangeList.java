package Course18_ListsExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exercise02_ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = new ArrayList<>(
                Arrays.stream(scanner.nextLine().split(" "))
                        .map(e -> Integer.parseInt(e))
                        .collect(Collectors.toList()));

        String[] command = new String[3];
        command = scanner.nextLine().split(" ");

        while (!command[0].equals("end")){
            switch (command[0]){
                case "Delete":
                    for (int i = 0; i < list.size(); i++) {
                        if (list.get(i)== Integer.parseInt(command[1])){
                            list.remove(i);
                            i--;
                        }
                    }
                    break;
                case "Insert":
                    list.add(Integer.parseInt(command[2]), Integer.parseInt(command[1]));
                    break;
            }
            command = scanner.nextLine().split(" ");
        }

        for (Integer e : list) {
            System.out.printf("%d ", e);
        }

    }
}