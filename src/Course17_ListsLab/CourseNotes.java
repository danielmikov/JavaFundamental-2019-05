package Course17_ListsLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CourseNotes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //basic functions : .add .remove .get .set
///////////
        //Create array of strings:
        String[] wordsArrays = new String[]{"Hello", "World"};

        //Create list of strings:
        List<String> words1 = new ArrayList<>(/*SIZE*/);
        words1.add("Hello");
        words1.add("World");
        words1.add("joke");
        //remove by value
        words1.remove("joke");
        //remove all elements by value
        while (words1.remove("joke")) {
        }

        //Create list of strings:
        List<String> words2 = new ArrayList<>(Arrays.asList("Hello", "World", "joke"));
        //remove by index
        words2.remove(2);

///////////
        //Create list of int:
        List<Integer> numbers1 = new ArrayList<>();
        numbers1.add(1);
        numbers1.add(2);
        numbers1.add(3);
        numbers1.add(4);

        //Remove int by value:
        numbers1.remove(Integer.valueOf(3));
        //Remove int by value:
        numbers1.remove(3);

///////////
        //Create list of int from string:
        String string = scanner.nextLine();
        List<Integer> numbers2 = Arrays.stream(string.split(" ")).map(e -> Integer.parseInt(e)).collect(Collectors.toList());


///////////
        //Create list from input, until "END":
        String input = scanner.nextLine();

        List<String> inputList = new ArrayList<>();
        while (!input.equalsIgnoreCase("end")) {
            inputList.add(input);
            input = scanner.nextLine();
        }

        //print list
        printList(inputList, " ");

        //Remove an element
        List<String> citiesUSA = new ArrayList<>();
        citiesUSA.add("New-York");
        citiesUSA.add("Hollywood");
        citiesUSA.add("Washington");
        citiesUSA.add("Los Vegas");
        citiesUSA.add("New-York");
        citiesUSA.add("Los Vegas");

        System.out.println();
        printList(citiesUSA, " ");

        //remove first element with x
        citiesUSA.remove("Los Vegas");
        System.out.println();
        printList(citiesUSA, " ");

        //remove all element with x:
        while (citiesUSA.remove("New-York")) {
        }
        System.out.println();
        printList(citiesUSA, " ");
    }

    private static void printList(List<String> list, String separator) {
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%s%s", list.get(i), separator);
        }
    }
}
