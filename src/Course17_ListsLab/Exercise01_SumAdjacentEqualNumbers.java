package Course17_ListsLab;

import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;

public class Exercise01_SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Double::parseDouble).collect(Collectors.toList());

        for (int i = 0; i < numbers.size() - 1; i++) {
            if (numbers.get(i).equals(numbers.get(i + 1))) {
                numbers.set(i, numbers.get(i) + numbers.get(i + 1));
                numbers.remove(i + 1);

                i = -1;
            }
        }

        DecimalFormat decimalFormat = new DecimalFormat("#.##");

        for (int j = 0; j < numbers.size(); j++) {
            System.out.print(decimalFormat.format(numbers.get(j)) + " ");
        }

    }
}
