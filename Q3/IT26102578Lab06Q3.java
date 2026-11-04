import java.util.Scanner;

public class IT26102578Lab06Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        double sumSquares = 0;

        System.out.println("Enter positive integers (terminate input with -99):");

        while (true) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            if (num == -99) break;

            if (num < 0) {
                System.out.println("Invalid input. Please enter a positive integer or -99 to terminate");
                continue;
            }

            sumSquares += num * num;
            count++;
        }

        if (count > 0) {
            double rms = Math.sqrt(sumSquares / count);
            System.out.println("The Root Mean Square (RMS) is: " + rms);
        } else {
            System.out.println("No valid numbers entered.");
        }
    }
}
