package Course08_DataTypesAndVariablesLab;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Exercise03_ExactSumOfRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        BigDecimal input;
        BigDecimal total = new BigDecimal(BigInteger.valueOf(0));
        for (int i = 0; i < size; i++) {
            input = scanner.nextBigDecimal();
            total = total.add(input);
        }
        System.out.println(total);

    }
}
