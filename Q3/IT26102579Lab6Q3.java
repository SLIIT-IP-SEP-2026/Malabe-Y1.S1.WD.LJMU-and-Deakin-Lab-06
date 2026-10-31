import java.util.Scanner;

public class IT26102579Lab6Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;
        int count = 0;
        double sumSquares = 0;

        System.out.print("Enter a positive integer (-99 to stop): ");
        num = input.nextInt();

        while (num != -99) {

            if (num < 0) {
                System.out.println("Invalid input!");
            }
			else {
                sumSquares = sumSquares + (num * num);
                count++;
            }

            System.out.print("Enter a positive integer (-99 to stop): ");
            num = input.nextInt();
        }

        double rms = Math.sqrt(sumSquares / count);

        System.out.println("\nRoot Mean Square = " + rms);

    }
}