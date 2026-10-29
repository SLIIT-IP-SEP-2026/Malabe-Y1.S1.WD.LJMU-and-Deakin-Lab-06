import java.util.Scanner;

public class IT26102324Lab6Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        double number = input.nextDouble();
        
        // Calculation
        double square = number * number; // Math.pow(number, 2) use karannath puluwan
        double squareRoot = Math.sqrt(number);
        
        System.out.println("\nThe square of " + number + " is : " + square);
        System.out.println("The square root of " + number + " is : " + squareRoot);
        
        input.close();
    }
}