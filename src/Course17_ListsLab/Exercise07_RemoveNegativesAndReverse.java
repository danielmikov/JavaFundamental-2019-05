package Course17_ListsLab;

import java.util.*;
import java.util.stream.Collectors;

public class Exercise07_RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> list = new ArrayList<>(Arrays.stream(scanner.nextLine().split(" ")).map(e -> Double.parseDouble(e)).collect(Collectors.toList()));

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 0){
                list.remove(i);
                i--;
            }
        }

        if (list.size() == 0){
            System.out.println("empty");
        } else {
            Collections.reverse(list);

            for (Double aDouble : list) {
                System.out.printf("%.0f ", aDouble);
            }
        }
    }
}
