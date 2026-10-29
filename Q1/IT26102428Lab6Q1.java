
import java.util.Scanner;

public class IT26102428Lab6Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double number = input.nextDouble();

        double square = number * number;
        
        System.out.println("Square = " + square);

        if (number >= 0) {
            double squareRoot = Math.sqrt(number);
            System.out.println("Square root = " + squareRoot);
        } else {
            System.out.println("Square root is not a real number.");
        }

        input.close();
    }
}
