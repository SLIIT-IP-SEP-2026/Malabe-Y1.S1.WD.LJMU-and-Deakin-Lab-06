import java.util.Scanner;
	public class IT26102662Lab6Q1{
	
		public static void main (String [] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		
		double square;
		double squareRoot;
		
		square = number*number;
		squareRoot = Math.sqrt(number);
		
		System.out.println("The Square Of "+ number + " is: " + square);
		System.out.println("The Square Root Of "+ number + " is: " + squareRoot);
		}
	}	