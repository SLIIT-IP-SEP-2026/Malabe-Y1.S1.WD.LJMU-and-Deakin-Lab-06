import java.util.Scanner;

public class IT26102661Lab6Q3 {
	
    public static void main(String[] args) {
		
        Scanner input = new Scanner(System.in);
		
        int num;
        int count = 0;
        double sumOfSquares = 0;
        double rms;

        System.out.println("Enter positive integers (terminate input with -99):");

        System.out.print("Enter a number: ");
        num = input.nextInt();

        while (num != -99) {
			
            if (num < 0) {
				
                System.out.println("Invalid input. Please enter a positive integer or -99 to terminate");
            } else {
				
                sumOfSquares = sumOfSquares + (num * num);
                count++;
            }

            System.out.print("Enter a number: ");
            num = input.nextInt();
        }

        rms = Math.sqrt(sumOfSquares / count);

        System.out.println();
        System.out.println("The Root Mean Square (RMS) is: " + rms);
    }
}