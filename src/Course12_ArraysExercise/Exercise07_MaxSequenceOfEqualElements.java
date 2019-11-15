package Course12_ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise07_MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt((e -> Integer.parseInt(e))).toArray();
        int lastIndex = input[0];
        int sequenceLengthCurrent = 0;
        int sequenceDigitCurrent = input[0];

        int sequenceDigitLongest = input[0];
        int sequenceLengthLongest = 0;

        for (int i = 1; i < input.length; i++) {
            //in sequence
            if (lastIndex == input[i]) {

                sequenceLengthCurrent++;
                sequenceDigitCurrent = input[i];
                if(sequenceLengthCurrent > sequenceLengthLongest){
                    sequenceLengthLongest = sequenceLengthCurrent;
                    sequenceDigitLongest = sequenceDigitCurrent;
                }
            }
            //no sequence
            else {
                lastIndex = input[i];
                sequenceLengthCurrent = 0;
            }
        }
        for (int j = 0; j <= sequenceLengthLongest; j++) {
            System.out.printf("%d ",sequenceDigitLongest);

        }
    }
}
