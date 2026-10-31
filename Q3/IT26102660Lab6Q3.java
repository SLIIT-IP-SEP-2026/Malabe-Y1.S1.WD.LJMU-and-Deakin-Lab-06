import java.util.Scanner;

public class IT26102660Lab6Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double SumSquares = 0;
        int Count = 0;

        System.out.println("Enter positive integers (terminate input with -99):");

        while (true) {
            System.out.print("Enter a number: ");
            int Num = input.nextInt();

            if (Num == -99) {
                break;
            }

            if (Num <= 0) {
                System.out.println("Invalid. Please enter a positive integer or -99 to terminate.");
                continue;
            }
            SumSquares += (double) Num * Num;
            Count++;
        }

        if (Count == 0) {
            System.out.println("No positive numbers were entered.");
        } else {
            System.out.println("The Root Mean Square (RMS) is: " + Math.sqrt(SumSquares / Count));
        }

        input.close();
    }
}