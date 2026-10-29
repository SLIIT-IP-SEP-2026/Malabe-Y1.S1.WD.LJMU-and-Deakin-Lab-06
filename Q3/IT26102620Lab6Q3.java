import java.util.Scanner;

public class IT26102620Lab6Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;
        int count = 0;
        double sumOfSquares = 0;
        double rms;

        System.out.print("Enter a positive integer (-99 to stop): ");
        number = input.nextInt();

        while (number != -99) {
            if (number < 0) {
                System.out.println("Invalid input! Please enter a positive integer.");
            } else {
                sumOfSquares = sumOfSquares + (double) number * number;
                count++;
            }

            System.out.print("Enter a positive integer (-99 to stop): ");
            number = input.nextInt();
        }

        if (count > 0) {
            rms = Math.sqrt(sumOfSquares / count);
            System.out.println("Root Mean Square = " + rms);
        } else {
            System.out.println("No valid numbers were entered.");
        }

        input.close();
    }
}
