package numberrangeprinter;

/**
 *
 * @author abdulkadirkaratas
 */
import java.util.Scanner;

public class NumberRangePrinter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int firstNumber = input.nextInt();

        System.out.print("Enter the second number: ");
        int secondNumber = input.nextInt();

        System.out.println("Numbers between " + firstNumber + " and " + secondNumber + " (exclusive):");
        for (int i = firstNumber + 1; i < secondNumber; i++) {
            if(firstNumber%2 == 1)
                System.out.print(i + " ");
        }
    }
}
