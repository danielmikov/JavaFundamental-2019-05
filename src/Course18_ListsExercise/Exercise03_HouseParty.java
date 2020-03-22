package Course18_ListsExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise03_HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int listSize = Integer.parseInt(scanner.nextLine());
        List<String> list = new ArrayList<>(listSize);

        for (int i = 0; i < listSize; i++) {
            list.add(scanner.nextLine());
        }

        List<String> attending = new ArrayList<>();


        System.out.printf("");
    }
}
