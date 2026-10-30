import java.util.Scanner;


public class IT26102381Lab6Q3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int sum = 0;
        int count = 0;
        double mean = 0;

        final String terminator = "-99";
        boolean isTerminated = false;

        while (!isTerminated) {
            System.out.print("Enter a number: ");

            // user input
            int input = sc.nextInt();

            // break out of the while loop | can also use break
            if (input == -99) isTerminated = true;

            // check for negative numbers
            else if (input < 0) {
                System.out.println("Invalid input. Please enter a positive integer or -99 to terminate.");
                continue;
            }
            else {
                sum += input;
                count ++;
            }

        }

        // prevent negative numbers from being divided by zero
        // Exception in thread "main" java.lang.ArithmeticException: / by zero
        if (count == 0) {
            System.out.println("\nNo valid numbers were entered. Cannot calculate RMS.");
            sc.close();
            return;
        }

        mean = sum / count;

        System.out.print("\nThe Root Mean Square (RMS) is: " + mean);

        sc.close();
    }

}