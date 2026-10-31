import java.util.Scanner;

public class IT26102580Lab6Q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num;
        int count = 0;
        double sum = 0;
        double rms;

        System.out.print("Enter a positive number (-99 to stop): ");
        num = input.nextInt();

        while (num != -99) {

            if (num < 0) {
                System.out.println("Invalid input! Enter a positive number.");
            } 
            else {
                sum = sum + (num * num);
                count++;
            }

            System.out.print("Enter a number: ");
            num = input.nextInt();
        }

        if (count > 0) {

            rms = Math.sqrt(sum / count);

            System.out.println("Root Mean Square = " + rms);

        } 
        else {
            System.out.println("No numbers were entered.");
        }

    }
}