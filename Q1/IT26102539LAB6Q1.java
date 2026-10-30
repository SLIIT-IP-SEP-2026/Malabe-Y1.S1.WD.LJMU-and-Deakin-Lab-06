import java.util.Scanner;

public class IT26102539LAB6Q1 {
    public static void main(String [] args ) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter A Number: ");
		double num = input.nextDouble();
		
		double square = num * num;
		System.out.println("The Square of " + num + " is: " + square);
		
		double sqroot = Math.sqrt(num);
		System.out.println("The Square Root of " + num + " is: " + sqroot);

	}
}
	