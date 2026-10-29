
import java.util.Scanner;

public class IT26102428Lab6Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;
        int count = 0;
        double sumSquares = 0;

        while (true) {
            System.out.print("Enter a positive integer (-99 to stop): ");
            number = input.nextInt();

            if (number == -99) {
                break;
            }

            if (number < 0) {
                System.out.println("Invalid input. Enter a positive integer.");
                continue;
            }

            if (number == 0) {
                System.out.println("Please enter a positive integer greater than zero.");
                continue;
            }

            sumSquares = sumSquares + (double) number * number;
            count++;
        }

        if (count > 0) {
            double meanSquare = sumSquares / count;
            double rms = Math.sqrt(meanSquare);

            System.out.println("Number of values = " + count);
            System.out.println("Sum of squares = " + sumSquares);
            System.out.println("Root Mean Square = " + rms);
        } else {
            System.out.println("No positive numbers were entered.");
        }

        input.close();
    }
}
