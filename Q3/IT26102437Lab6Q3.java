import java.util.Scanner;

public class IT26102437Lab6Q3{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;
        int count = 0;

        double sumSquares = 0;
        double rms;

        System.out.println("Enter positive integers (terminate input with -99):");

        System.out.print("Enter a number: ");
        number = input.nextInt();

        while (number != -99) {

            if (number > 0) {

                sumSquares = sumSquares + (number * number);

                count++;

            } else {

                System.out.println("Invalid input. Please enter a positive integer or -99 to terminate");

            }

            System.out.print("Enter a number: ");
            number = input.nextInt();

        }

        if (count > 0) {

            rms = Math.sqrt(sumSquares / count);

            System.out.println();
            System.out.println("The Root Mean Square (RMS) is: " + rms);

        } else {

            System.out.println("No valid numbers were entered.");

        }

    }
}