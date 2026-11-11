import java.util.Scanner; 

public class IT26102437Lab6Q1{
	public static void main (String[]args){
		double number, square, squareRoot;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number : ");
		number = input.nextDouble();
		
		if (number <= 0){
			System.out.println("Error : the number must be greater than zero");
			
		} else {
			square = number * number;
			squareRoot = Math.sqrt(number);
			System.out.println();
			System.out.println("The square of " + number + " is : " + square);
			System.out.println("The square root of " + number + " is : " + squareRoot);
		}
	}
}