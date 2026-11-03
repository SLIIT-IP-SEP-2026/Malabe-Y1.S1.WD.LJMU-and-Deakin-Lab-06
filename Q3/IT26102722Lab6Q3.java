import java.util.Scanner;

public class IT26102722Lab6Q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num;
        int count = 0;
        double sum = 0;
        double rms;

        System.out.println("Enter positive integers (terminate input with -99):");

        while (true) {

            System.out.print("Enter a number: ");
            num = input.nextInt();

            if (num == -99) {
                break;
            }

            if (num < 0) {
                System.out.println("Invalid input. Please enter a positive integer or -99 to terminate");
                continue;
            }

            sum = sum + (num * num);
            count++;
        }

        rms = Math.sqrt(sum / count);

        System.out.println();
        System.out.println("The Root Mean Square (RMS) is: " + rms);

        input.close();
    }
}