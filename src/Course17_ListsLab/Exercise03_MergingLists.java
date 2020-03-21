package Course17_ListsLab;

import java.util.*;
import java.util.stream.Collectors;

public class Exercise03_MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list1 = new ArrayList<>(
                Arrays.stream(scanner.nextLine().split(" "))
                .map(e -> Integer.parseInt(e))
                .collect(Collectors.toList())
        );

        List<Integer> list2 = new ArrayList<>(
                Arrays.stream(scanner.nextLine().split(" "))
                .map(e -> Integer.parseInt(e))
                .collect(Collectors.toList())
        );


    }

}
