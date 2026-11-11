
import java.util.Scanner;

public class IT26102617Lab6Q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num;
        int count = 0;
        double sqSum = 0;
        double rms;

        while (true) {

            System.out.print("Enter a number: ");
            num = input.nextInt();

            if (num == -99) {
                break;
            }

            if (num > 0) {
                sqSum = sqSum + num * num;
                count++;
            }
            else {
                System.out.println("Invalid input. Please enter a positive integer or -99 to terminate");
            }
        }

        if (count > 0) {
            rms = Math.sqrt(sqSum / count);
            System.out.println("The Root Mean Square (RMS) is: " + rms);
        }
        else {
            System.out.println("No positive numbers entered.");
        }

        input.close();
    }
}
