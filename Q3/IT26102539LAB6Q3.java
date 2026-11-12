
import java.util.Scanner;

public class IT26102539LAB6Q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;
        int count = 0;
        double sum = 0;

        System.out.println("Enter positive integers (terminate input with -99):");

        for (;;) {

            System.out.print("Enter a number: ");
            number = input.nextInt();

            if (number == -99) {
                break;
            }
            else if (number <= 0) {
                System.out.println("Invalid input. Please enter a positive integer or -99 to terminate.");
            }
            else {
                sum = sum + (number * number);
                count++;
            }
        }

        if (count > 0) {
            double rms = Math.sqrt(sum / count);
            System.out.println("The Root Mean Square (RMS) is: " + rms);
        }
        else {
            System.out.println("No valid numbers were entered.");
        }

        input.close();
    }
}
