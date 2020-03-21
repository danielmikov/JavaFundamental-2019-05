package Course17_ListsLab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercise06_ListOfProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int listSize = Integer.parseInt(scanner.nextLine());
        List<String> listProductsInput = new ArrayList<>(listSize);

        for (int i = 1; i <= listSize; i++) {
            listProductsInput.add(scanner.nextLine());
        }

        Collections.sort(listProductsInput);

        for (int i = 1; i <= listSize; i++) {
            System.out.println(i + "." + listProductsInput.get(i - 1));
        }
    }
}
