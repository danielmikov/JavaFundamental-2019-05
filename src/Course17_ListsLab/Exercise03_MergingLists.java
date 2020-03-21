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

        List<Integer> listCombined = new ArrayList<>();

        for (int i = 0; i < (list1.size() + list2.size()); i++) {
            if (i<list1.size()){
                listCombined.add(list1.get(i));
            }
            if (i<list2.size()){
                listCombined.add(list2.get(i));
            }

        }

        for (Integer integer : listCombined) {
            System.out.print(integer + " ");
        }


    }

}
