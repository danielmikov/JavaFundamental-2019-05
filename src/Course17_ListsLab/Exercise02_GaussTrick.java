package Course17_ListsLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exercise02_GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> list = new ArrayList<>(Arrays
                .stream(scanner.nextLine().split(" "))
                .map(e -> Double.parseDouble(e))
                .collect(Collectors.toList()));

        for (int i = 0; i < list.size() / 2; i++) {
            list.set(i, list.get(i) + list.get((list.size() - 1 - i)));
            System.out.printf("%.0f ", list.get(i));

        }

        if (list.size() % 2 != 0) {
            System.out.printf("%.0f", list.get(list.size() / 2));
        }
    }
}
