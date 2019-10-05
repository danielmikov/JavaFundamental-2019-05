package Course09_DataTypesAndVariablesExercise;

import java.util.Scanner;

public class Exercise08_BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputSize = Integer.parseInt(scanner.nextLine());
        String kegModelBiggest = "";
        double kegVolumeBiggest = 0;

        for (int i = 0; i < inputSize ; i++) {
            String kegModelCurrent = scanner.nextLine();
            double kegRadius = Double.parseDouble(scanner.nextLine());
            double kegHeight = Double.parseDouble(scanner.nextLine());
            double kegVolumeCurrent = Math.PI * (kegRadius * kegRadius) * kegHeight;
            if (kegVolumeCurrent > kegVolumeBiggest){
                kegModelBiggest = kegModelCurrent;
                kegVolumeBiggest = kegVolumeCurrent;
            }
        }
        System.out.println(kegModelBiggest);
    }
}
