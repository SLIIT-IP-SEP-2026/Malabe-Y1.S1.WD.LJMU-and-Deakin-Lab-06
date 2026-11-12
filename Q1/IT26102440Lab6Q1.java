import java.util.Scanner;
public class IT26102440Lab6Q1{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		double number, sqaure, squareRoot;
		
		System.out.print("Enter a number: ");
		number = input.nextDouble();
		
		square = number * number;
		squareRoot = Math.sqrt(number);
		
		System.out.println("The square of" + number " is: " + sqaure);
		System.out.println("The square root of" + number + "is: " sqaureRoot);
		
	}
}