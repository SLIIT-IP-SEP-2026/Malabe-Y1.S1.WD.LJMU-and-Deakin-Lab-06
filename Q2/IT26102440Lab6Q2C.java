import java.util.Scanner;
public class IT26102440Lab6Q2C{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		int count = 1;
		int number;
		int sum = 0;
		double average;
		String numbers = "";
		
		System.out.println("Please enter 10 numbers:");
		
		while(count <= 10){
			
			System.out.print("Enter number" + count + ": ");
			number = input.nextInt();
			
			numbers = numbers + number + " ";
			
			sum = sum + number;
			
			count = count + 1;
			
		}
		
		average = sum / 10.0;
		
		System.out.println();
		System.out.println("The numbers you entered are:");
		System.out.println(numbers);
		
		System.out.println();
		System.out.println("Sum of the numbers: " + sum);
		System.out.println("Average of the numbers: " + average);
		
	}
}