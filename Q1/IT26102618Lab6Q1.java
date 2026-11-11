import java.util.Scanner;

public class IT26102618Lab6Q1{
	
	public static void main(String[]args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		double num = input.nextDouble();
		
		if(num <= 0){
			System.out.println("Error: The number must be greater than zero");
			
		}else{
			double numSq = num * num;
			double numSqRoot = Math.sqrt(num);
		
			System.out.println();
			System.out.println("The square of "+num +" is: "+numSq);
			System.out.println("The square root of "+num +" is: "+numSqRoot);
		}
		
		
	}
}